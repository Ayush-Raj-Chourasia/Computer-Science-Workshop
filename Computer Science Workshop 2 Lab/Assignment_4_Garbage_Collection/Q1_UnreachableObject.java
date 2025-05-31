public class Q1_UnreachableObject {
    private String name;

    public Q1_UnreachableObject(String name) {
        this.name = name;
        System.out.println("Created object: " + name);
    }

    public void display() {
        Q1_UnreachableObject obj = new Q1_UnreachableObject("Display Object");
        System.out.println("Display method called");
    }

    public void show() {
        Q1_UnreachableObject obj = new Q1_UnreachableObject("Show Object");
        obj.display();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collected: " + name);
        super.finalize();
    }

    public static void main(String[] args) {
        Q1_UnreachableObject mainObj = new Q1_UnreachableObject("Main Object");
        mainObj.show();
        
        System.out.println("\nRequesting garbage collection...");
        System.gc();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
} 