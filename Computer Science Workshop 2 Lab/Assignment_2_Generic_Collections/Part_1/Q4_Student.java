package Part_1;
public class Q4_Student implements Comparable<Q4_Student> {
    private String name;
    private int rollNumber;
    private double totalMark;

    public Q4_Student(String name, int rollNumber, double totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getTotalMark() {
        return totalMark;
    }

    @Override
    public int compareTo(Q4_Student other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", totalMark=" + totalMark +
                '}';
    }
}

class Q4_Driver {
    public static Q4_Student linearSearch(Q4_Student[] students, int targetRollNumber) {
        for (Q4_Student student : students) {
            if (student.getRollNumber() == targetRollNumber) {
                return student;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Q4_Student[] students = {
            new Q4_Student("John", 101, 85.5),
            new Q4_Student("Alice", 102, 92.0),
            new Q4_Student("Bob", 103, 78.5),
            new Q4_Student("Emma", 104, 88.0)
        };

        System.out.println("All Students:");
        for (Q4_Student student : students) {
            System.out.println(student);
        }

        int searchRollNumber = 102;
        Q4_Student foundStudent = linearSearch(students, searchRollNumber);
        
        if (foundStudent != null) {
            System.out.println("\nFound student with roll number " + searchRollNumber + ":");
            System.out.println(foundStudent);
        } else {
            System.out.println("\nStudent with roll number " + searchRollNumber + " not found.");
        }
    }
}

/*
Output:
All Students:
Student{name='John', rollNumber=101, totalMark=85.5}
Student{name='Alice', rollNumber=102, totalMark=92.0}
Student{name='Bob', rollNumber=103, totalMark=78.5}
Student{name='Emma', rollNumber=104, totalMark=88.0}

Found student with roll number 102:
Student{name='Alice', rollNumber=102, totalMark=92.0}
*/ 