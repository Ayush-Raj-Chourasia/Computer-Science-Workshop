import java.util.ArrayList;
import java.util.List;

class Student {
    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }
}

interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollments();
}

class Enrollment implements EnrollmentSystem {
    private List<String> enrollments = new ArrayList<>();

    public void enrollStudent(Student student, Course course) {
        enrollments.add(student.getName() + " enrolled in " + course.getCourseName());
    }

    public void dropStudent(Student student, Course course) {
        enrollments.remove(student.getName() + " enrolled in " + course.getCourseName());
    }

    public void displayEnrollments() {
        for (String enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }
}

public class MainEnrollApp {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");

        Course course1 = new Course("CSE101", "Data Structures");
        Course course2 = new Course("CSE102", "Algorithms");

        EnrollmentSystem enrollmentSystem = new Enrollment();

        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student2, course2);
        enrollmentSystem.displayEnrollments();

        enrollmentSystem.dropStudent(student1, course1);
        enrollmentSystem.displayEnrollments();
    }
}
