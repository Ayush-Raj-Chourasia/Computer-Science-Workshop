public class Question_3 {
    public static void main(String[] args) {
        double num = 123.456; // Primitive double

        // (a) Using Autoboxing
        Double obj1 = num; // Autoboxing
        System.out.println("Autoboxed Double Object: " + obj1);

        // (b) Using Constructor
        Double obj2 = new Double(num); // Using Constructor
        System.out.println("Double Object using Constructor: " + obj2);
    }
}


// Autoboxed Double Object: 123.456
// Double Object using Constructor: 123.456
