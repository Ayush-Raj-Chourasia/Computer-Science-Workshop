public class Q5_MemoryMonitor {
    private int intValue;
    private double doubleValue;

    public Q5_MemoryMonitor(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void setValues(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void updateValues(int intDelta, double doubleDelta) {
        this.intValue += intDelta;
        this.doubleValue += doubleDelta;
    }

    public static void printMemoryStats() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("\nMemory Statistics:");
        System.out.println("Total Memory: " + totalMemory / 1024 + " KB");
        System.out.println("Free Memory: " + freeMemory / 1024 + " KB");
        System.out.println("Used Memory: " + usedMemory / 1024 + " KB");
    }

    public static void main(String[] args) {
        System.out.println("Initial memory state:");
        printMemoryStats();

        Q5_MemoryMonitor obj1 = new Q5_MemoryMonitor(10, 20.5);
        Q5_MemoryMonitor obj2 = new Q5_MemoryMonitor(30, 40.5);

        System.out.println("\nAfter creating objects:");
        printMemoryStats();

        obj1.setValues(15, 25.5);
        obj2.updateValues(5, 10.5);

        System.out.println("\nAfter modifying objects:");
        printMemoryStats();

        obj1 = null;
        obj2 = null;

        System.out.println("\nAfter nullifying references:");
        printMemoryStats();

        System.out.println("\nRequesting garbage collection...");
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nAfter garbage collection:");
        printMemoryStats();
    }
} 