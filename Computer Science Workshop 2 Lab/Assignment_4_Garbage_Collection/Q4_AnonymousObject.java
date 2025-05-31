public class Q4_AnonymousObject {
    private String name;

    public Q4_AnonymousObject(String name) {
        this.name = name;
        System.out.println("Created object: " + name);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        System.out.println("Creating anonymous object...");
        new Q4_AnonymousObject("Anonymous Object").toString();
        
        System.out.println("\nRequesting garbage collection...");
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 