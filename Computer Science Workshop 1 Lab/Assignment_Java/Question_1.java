
public class Question_1 {
    public static void main(String[] args) {
        int num = 10; // Primitive int

        // (a) Using Autoboxing
        Integer obj1 = num; // Autoboxing
        System.out.println("Autoboxed Integer Object: " + obj1);

        // (b) Using Constructor
        Integer obj2 = new Integer(num); // Using Constructor
        System.out.println("Integer Object using Constructor: " + obj2);
    }
}


// Autoboxed Float Object: 12.34
// Float Object using valueOf(): 12.34
