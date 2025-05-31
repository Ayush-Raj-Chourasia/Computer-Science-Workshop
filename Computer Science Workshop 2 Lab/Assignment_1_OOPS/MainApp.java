class College {
    private String collegeName;
    private String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }
}

class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.getCollegeName());
        System.out.println("College Location: " + college.getCollegeLoc());
        System.out.println();
    }
}

public class MainApp {
    public static void main(String[] args) {
        College c1 = new College("ABC College", "New York");
        College c2 = new College("XYZ University", "Los Angeles");

        Student s1 = new Student(101, "Alice", c1);
        Student s2 = new Student(102, "Bob", c2);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
