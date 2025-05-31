package Part_1;
public class Q5_Student implements Comparable<Q5_Student> {
    private String name;
    private int rollNumber;
    private double totalMark;

    public Q5_Student(String name, int rollNumber, double totalMark) {
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
    public int compareTo(Q5_Student other) {
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

class Q5_Driver {
    public static void bubbleSort(Q5_Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap students[j] and students[j+1]
                    Q5_Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Q5_Student[] students = {
            new Q5_Student("John", 104, 85.5),
            new Q5_Student("Alice", 102, 92.0),
            new Q5_Student("Bob", 101, 78.5),
            new Q5_Student("Emma", 103, 88.0)
        };

        System.out.println("Before sorting:");
        for (Q5_Student student : students) {
            System.out.println(student);
        }

        bubbleSort(students);

        System.out.println("\nAfter sorting by roll number:");
        for (Q5_Student student : students) {
            System.out.println(student);
        }
    }
}

/*
Output:
Before sorting:
Student{name='John', rollNumber=104, totalMark=85.5}
Student{name='Alice', rollNumber=102, totalMark=92.0}
Student{name='Bob', rollNumber=101, totalMark=78.5}
Student{name='Emma', rollNumber=103, totalMark=88.0}

After sorting by roll number:
Student{name='Bob', rollNumber=101, totalMark=78.5}
Student{name='Alice', rollNumber=102, totalMark=92.0}
Student{name='Emma', rollNumber=103, totalMark=88.0}
Student{name='John', rollNumber=104, totalMark=85.5}
*/ 