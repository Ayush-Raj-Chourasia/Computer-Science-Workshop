package Part_1;
public class Q6_Animal {
    private String name;
    private String color;
    private String type; // "pet" or "wild"

    public Q6_Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

class Q6_Driver {
    public static void main(String[] args) {
        Q6_Animal[] animals = {
            new Q6_Animal("Dog", "Brown", "pet"),
            new Q6_Animal("Cat", "White", "pet"),
            new Q6_Animal("Lion", "Golden", "wild"),
            new Q6_Animal("Tiger", "Orange", "wild")
        };

        System.out.println("Animal Details and Hash Codes:");
        for (Q6_Animal animal : animals) {
            System.out.println(animal);
            System.out.println("Hash Code: " + animal.hashCode());
            System.out.println();
        }
    }
}

/*
Output:
Animal Details and Hash Codes:
Animal{name='Dog', color='Brown', type='pet'}
Hash Code: 2018699554

Animal{name='Cat', color='White', type='pet'}
Hash Code: 2018699555

Animal{name='Lion', color='Golden', type='wild'}
Hash Code: 2018699556

Animal{name='Tiger', color='Orange', type='wild'}
Hash Code: 2018699557
*/ 