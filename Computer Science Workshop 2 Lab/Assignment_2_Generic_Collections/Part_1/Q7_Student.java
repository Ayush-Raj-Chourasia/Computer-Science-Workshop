package Part_1;
import java.util.Arrays;
import java.util.Comparator;

public class Q7_Student {
    private String name;
    private int rollNo;
    private int age;

    public Q7_Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }
}

class RollNoComparator implements Comparator<Q7_Student> {
    @Override
    public int compare(Q7_Student s1, Q7_Student s2) {
        return Integer.compare(s1.getRollNo(), s2.getRollNo());
    }
}

class AgeComparator implements Comparator<Q7_Student> {
    @Override
    public int compare(Q7_Student s1, Q7_Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

class Q7_Driver {
    public static void main(String[] args) {
        Q7_Student[] students = {
            new Q7_Student("John", 104, 20),
            new Q7_Student("Alice", 102, 19),
            new Q7_Student("Bob", 101, 21),
            new Q7_Student("Emma", 103, 18)
        };

        System.out.println("Original array:");
        for (Q7_Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number
        Arrays.sort(students, new RollNoComparator());
        System.out.println("\nSorted by roll number:");
        for (Q7_Student student : students) {
            System.out.println(student);
        }

        // Sort by age
        Arrays.sort(students, new AgeComparator());
        System.out.println("\nSorted by age:");
        for (Q7_Student student : students) {
            System.out.println(student);
        }
    }
}

/*
Output:
Original array:
Student{name='John', rollNo=104, age=20}
Student{name='Alice', rollNo=102, age=19}
Student{name='Bob', rollNo=101, age=21}
Student{name='Emma', rollNo=103, age=18}

Sorted by roll number:
Student{name='Bob', rollNo=101, age=21}
Student{name='Alice', rollNo=102, age=19}
Student{name='Emma', rollNo=103, age=18}
Student{name='John', rollNo=104, age=20}

Sorted by age:
Student{name='Emma', rollNo=103, age=18}
Student{name='Alice', rollNo=102, age=19}
Student{name='John', rollNo=104, age=20}
Student{name='Bob', rollNo=101, age=21}
*/ 