interface Vehicle {
    void accelerate();
    void brake();
}

class Car implements Vehicle {
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating to " + speed + " km/h in " + duration + " seconds.");
    }

    public void brake() {
        System.out.println("Car is braking.");
    }
}

class Bicycle implements Vehicle {
    public void accelerate() {
        System.out.println("Bicycle is accelerating.");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is accelerating to " + speed + " km/h in " + duration + " seconds.");
    }

    public void brake() {
        System.out.println("Bicycle is braking.");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.accelerate();
        ((Car) car).accelerate(60);
        ((Car) car).accelerate(80, 5);
        car.brake();

        bicycle.accelerate();
        ((Bicycle) bicycle).accelerate(20);
        ((Bicycle) bicycle).accelerate(30, 3);
        bicycle.brake();
    }
}
