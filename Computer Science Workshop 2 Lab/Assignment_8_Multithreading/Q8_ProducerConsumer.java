class Buffer {
    private int[] buffer;
    private int count = 0;
    private int capacity;
    public Buffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
    }
    public synchronized void put(int value) throws InterruptedException {
        while (count == capacity) {
            wait();
        }
        buffer[count++] = value;
        System.out.println("Produced: " + value);
        notifyAll();
    }
    public synchronized int get() throws InterruptedException {
        while (count == 0) {
            wait();
        }
        int value = buffer[--count];
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}

class Producer extends Thread {
    private Buffer buffer;
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.put(i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                buffer.get();
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Q8_ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Producer and Consumer have finished.");
    }
} 