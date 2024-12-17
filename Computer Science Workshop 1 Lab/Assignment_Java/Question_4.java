public class Question_4 {
    public static void main(String[] args) {
        boolean flag = true; // Primitive boolean

        // (a) Using Autoboxing
        Boolean obj1 = flag; // Autoboxing
        System.out.println("Autoboxed Boolean Object: " + obj1);

        // (b) Using Constructor
        Boolean obj2 = new Boolean(flag); // Using Constructor
        System.out.println("Boolean Object using Constructor: " + obj2);
    }
}


// Autoboxed Boolean Object: true
// Boolean Object using Constructor: true
