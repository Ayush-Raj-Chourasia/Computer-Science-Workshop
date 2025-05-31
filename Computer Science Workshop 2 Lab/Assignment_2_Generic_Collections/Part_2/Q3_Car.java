package Part_2;
import java.util.ArrayList;
import java.util.Collections;

public class Q3_Car implements Comparable<Q3_Car> {
    private int modelNo;
    private String name;
    private int stock;

    public Q3_Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModelNo() {
        return modelNo;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(Q3_Car car) {
        return Integer.compare(this.stock, car.stock);
    }

    @Override
    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
}

class Q3_CarApp {
    public static void main(String[] args) {
        ArrayList<Q3_Car> cars = new ArrayList<>();
        cars.add(new Q3_Car(2013, "Creta", 10));
        cars.add(new Q3_Car(2020, "MG", 13));
        cars.add(new Q3_Car(2018, "Kia", 20));
        cars.add(new Q3_Car(2017, "Audi", 45));
        cars.add(new Q3_Car(2015, "BMW", 55));

        Collections.sort(cars);
        System.out.println("Sorted list of Car objects:");
        for (Q3_Car car : cars) {
            System.out.println(car);
        }
    }
}

/*
Output:
Sorted list of Car objects:
2013 Creta 10
2020 MG 13
2018 Kia 20
2017 Audi 45
2015 BMW 55
*/ 