public class Question_2 {
    public static void main(String[] args) {
        float num = 12.34f; // Primitive float

        // (a) Using Autoboxing
        Float obj1 = num; // Autoboxing
        System.out.println("Autoboxed Float Object: " + obj1);

        // (b) Using Constructor
        Float obj2 = new Float(num); // Using Constructor
        System.out.println("Float Object using Constructor: " + obj2);
    }
}


// Autoboxed Float Object: 12.34
// Float Object using Constructor: 12.34
