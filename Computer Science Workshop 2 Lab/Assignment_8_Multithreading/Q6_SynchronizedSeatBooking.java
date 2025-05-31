class SeatManager {
    private int availableSeats;

    public SeatManager(int seats) {
        this.availableSeats = seats;
    }

    public void bookSeat(String customer, int seatsToBook) {
        synchronized (this) {
            if (seatsToBook <= availableSeats) {
                System.out.println(customer + " booked " + seatsToBook + " seat(s).");
                availableSeats -= seatsToBook;
            } else {
                System.out.println(customer + " could not book " + seatsToBook + " seat(s). Not enough seats available.");
            }
            System.out.println("Seats left: " + availableSeats);
        }
    }
}

class BookingThread extends Thread {
    private SeatManager manager;
    private String customer;
    private int seatsToBook;

    public BookingThread(SeatManager manager, String customer, int seatsToBook) {
        this.manager = manager;
        this.customer = customer;
        this.seatsToBook = seatsToBook;
    }

    public void run() {
        manager.bookSeat(customer, seatsToBook);
    }
}

public class Q6_SynchronizedSeatBooking {
    public static void main(String[] args) {
        SeatManager manager = new SeatManager(5);
        Thread t1 = new BookingThread(manager, "Alice", 2);
        Thread t2 = new BookingThread(manager, "Bob", 3);
        Thread t3 = new BookingThread(manager, "Charlie", 2);
        t1.start();
        t2.start();
        t3.start();
    }
} 