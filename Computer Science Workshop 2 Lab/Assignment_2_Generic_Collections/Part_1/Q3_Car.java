package Part_1;
public class Q3_Car implements Comparable<Q3_Car> {
    private String model;
    private String color;
    private double speed;

    public Q3_Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Q3_Car other) {
        return Double.compare(this.speed, other.speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}

class Q3_Driver {
    public static void main(String[] args) {
        Q3_Car car1 = new Q3_Car("Toyota Camry", "Blue", 180.0);
        Q3_Car car2 = new Q3_Car("Honda Civic", "Red", 200.0);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);

        if (car1.compareTo(car2) > 0) {
            System.out.println(car1.getModel() + " is faster than " + car2.getModel());
        } else if (car1.compareTo(car2) < 0) {
            System.out.println(car2.getModel() + " is faster than " + car1.getModel());
        } else {
            System.out.println("Both cars have the same speed");
        }
    }
}

/*
Output:
Car 1: Car{model='Toyota Camry', color='Blue', speed=180.0}
Car 2: Car{model='Honda Civic', color='Red', speed=200.0}
Honda Civic is faster than Toyota Camry
*/ 