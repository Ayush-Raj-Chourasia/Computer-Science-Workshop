import java.util.ArrayList;
import java.util.Date;

class Course {
    private String courseId;
    private String courseName;
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return courseId + " - " + courseName + " (" + credits + " credits)";
    }
}

class Student {
    private String studentId;
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(String courseId) {
        enrolledCourses.removeIf(course -> course.toString().startsWith(courseId));
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student " + name + " (ID: " + studentId + ") has been garbage collected");
        super.finalize();
    }
}

public class Q7_StudentEnrollment {
    public static void printMemoryStats() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("\nMemory Statistics at " + new Date());
        System.out.println("Total Memory: " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
    }

    public static void main(String[] args) {
        System.out.println("Initial memory state:");
        printMemoryStats();

        // Create courses
        Course javaCourse = new Course("CS101", "Java Programming", 3);
        Course dbCourse = new Course("CS102", "Database Systems", 4);
        Course webCourse = new Course("CS103", "Web Development", 3);

        // Create and enroll students
        Student student1 = new Student("S001", "John Doe");
        student1.enrollCourse(javaCourse);
        student1.enrollCourse(dbCourse);

        Student student2 = new Student("S002", "Jane Smith");
        student2.enrollCourse(javaCourse);
        student2.enrollCourse(webCourse);

        System.out.println("\nAfter creating students and enrolling courses:");
        printMemoryStats();

        // Drop courses
        student1.dropCourse("CS101");
        student2.dropCourse("CS103");

        System.out.println("\nAfter dropping courses:");
        printMemoryStats();

        // Make students unreachable
        student1 = null;
        student2 = null;

        System.out.println("\nAfter nullifying student references:");
        printMemoryStats();

        // Request garbage collection
        System.out.println("\nRequesting garbage collection...");
        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal memory state:");
        printMemoryStats();
    }
} 