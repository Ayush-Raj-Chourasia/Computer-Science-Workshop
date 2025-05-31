public class Q3_NullifiedReference {
    private String name;

    public Q3_NullifiedReference(String name) {
        this.name = name;
        System.out.println("Created object: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        Q3_NullifiedReference obj = new Q3_NullifiedReference("Test Object");
        
        System.out.println("\nBefore nullification:");
        System.out.println("Object name: " + obj.name);

        obj = null;
        System.out.println("\nAfter nullification:");
        System.out.println("Object reference is now null");

        System.out.println("\nRequesting garbage collection...");
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 