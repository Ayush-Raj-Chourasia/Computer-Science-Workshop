public class Q2_ReassigningReference {
    private String name;

    public Q2_ReassigningReference(String name) {
        this.name = name;
        System.out.println("Created object: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        Q2_ReassigningReference obj1 = new Q2_ReassigningReference("Object 1");
        Q2_ReassigningReference obj2 = new Q2_ReassigningReference("Object 2");

        System.out.println("\nBefore reassignment:");
        System.out.println("obj1: " + obj1.name);
        System.out.println("obj2: " + obj2.name);

        obj1 = obj2;
        System.out.println("\nAfter reassignment:");
        System.out.println("obj1: " + obj1.name);
        System.out.println("obj2: " + obj2.name);

        System.out.println("\nRequesting garbage collection...");
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 