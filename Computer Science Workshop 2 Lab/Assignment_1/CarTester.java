class Car {
    private String make;
    private String model;
    
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void display() {
        System.out.println("Make: " + make + ", Model: " + model);
    }
}

public class CarTester {
    public static void main(String[] args) {
        Car myCar1 = new Car("Toyota", "Corolla");
        Car myCar2 = new Car(null, null);
        
        myCar1.display();
        myCar2.display();
        
        myCar2.setMake("Honda");
        myCar2.setModel("Civic");
        
        myCar2.display();
    }
}
