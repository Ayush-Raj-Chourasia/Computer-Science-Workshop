package Part_2;
import java.util.LinkedList;
import java.util.Scanner;

public class Q4_Student {
    private String name;
    private int age;
    private double mark;

    public Q4_Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Q4_Student that = (Q4_Student) obj;
        return age == that.age &&
                Double.compare(that.mark, mark) == 0 &&
                name.equals(that.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}

class Q4_Driver {
    public static void main(String[] args) {
        LinkedList<Q4_Student> students = new LinkedList<>();
        students.add(new Q4_Student("John", 20, 85.5));
        students.add(new Q4_Student("Alice", 19, 92.0));
        students.add(new Q4_Student("Bob", 21, 78.5));
        students.add(new Q4_Student("Emma", 18, 88.0));

        // (a) Display the list
        System.out.println("List of students:");
        for (Q4_Student s : students) {
            System.out.println(s);
        }

        // (b) Prompt user to enter a student and check existence
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter name, age, mark to search:");
        String name = sc.next();
        int age = sc.nextInt();
        double mark = sc.nextDouble();
        Q4_Student searchStudent = new Q4_Student(name, age, mark);
        boolean exists = students.contains(searchStudent);
        System.out.println("Exists (content comparison using equals): " + exists);

        // (c) Remove a specified student
        System.out.println("\nEnter name, age, mark to remove:");
        name = sc.next();
        age = sc.nextInt();
        mark = sc.nextDouble();
        Q4_Student removeStudent = new Q4_Student(name, age, mark);
        boolean removed = students.remove(removeStudent);
        System.out.println("Removed: " + removed);

        // (d) Count number of students
        System.out.println("\nNumber of students in list: " + students.size());

        sc.close();
    }
}

/*
Sample Output:
List of students:
Student{name='John', age=20, mark=85.5}
Student{name='Alice', age=19, mark=92.0}
Student{name='Bob', age=21, mark=78.5}
Student{name='Emma', age=18, mark=88.0}

Enter name, age, mark to search:
Alice 19 92.0
Exists (content comparison using equals): true

Enter name, age, mark to remove:
Bob 21 78.5
Removed: true

Number of students in list: 3
*/ 