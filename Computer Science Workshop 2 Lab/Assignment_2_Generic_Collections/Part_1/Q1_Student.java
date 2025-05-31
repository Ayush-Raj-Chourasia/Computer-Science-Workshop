package Part_1;
public class Q1_Student<T> {
    private String name;
    private T rollNumber;
    private int age;

    public Q1_Student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public T getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                '}';
    }
}

class Q1_Driver {
    public static void main(String[] args) {
        // Create student with integer roll number
        Q1_Student<Integer> student1 = new Q1_Student<>("John", 101, 20);
        System.out.println("Student 1: " + student1);

        // Create student with string roll number
        Q1_Student<String> student2 = new Q1_Student<>("Alice", "CS101", 19);
        System.out.println("Student 2: " + student2);
    }
}

/*
Output:
Student 1: Student{name='John', rollNumber=101, age=20}
Student 2: Student{name='Alice', rollNumber=CS101, age=19}
*/ 