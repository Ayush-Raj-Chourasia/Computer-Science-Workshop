package Part_2;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Q7_Address {
    private int plotNo;
    private String at;
    private String post;

    public Q7_Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo=" + plotNo +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

class Q7_Driver {
    public static void main(String[] args) {
        TreeMap<String, Q7_Address> map = new TreeMap<>();
        map.put("John", new Q7_Address(101, "MG Road", "Bangalore"));
        map.put("Alice", new Q7_Address(202, "Park Street", "Kolkata"));
        map.put("Emma", new Q7_Address(303, "Marine Drive", "Mumbai"));

        System.out.println("Entries in TreeMap:");
        Iterator<Map.Entry<String, Q7_Address>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Q7_Address> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

/*
Output:
Entries in TreeMap:
Alice => Address{plotNo=202, at='Park Street', post='Kolkata'}
Emma => Address{plotNo=303, at='Marine Drive', post='Mumbai'}
John => Address{plotNo=101, at='MG Road', post='Bangalore'}
*/ 