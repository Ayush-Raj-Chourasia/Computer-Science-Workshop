@FunctionalInterface
interface Shape {
    double area();
    default void printArea() {
        System.out.println("Area: " + area());
    }
}

public class Q4_Shape {
    public static void main(String[] args) {
        double radius = 3.0;
        double side = 4.0;
        double length = 5.0;
        double width = 2.0;

        Shape circle = () -> Math.PI * radius * radius;
        Shape square = () -> side * side;
        Shape rectangle = () -> length * width;

        System.out.print("Circle ");
        circle.printArea();
        System.out.print("Square ");
        square.printArea();
        System.out.print("Rectangle ");
        rectangle.printArea();
    }
} 