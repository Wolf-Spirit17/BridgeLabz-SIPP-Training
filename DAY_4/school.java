import java.util.*;

// Course Class
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); // Maintain bidirectional relationship
        }
    }

    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }
}

// Student Class (associated with Course, aggregated by School)
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        course.enrollStudent(this); // Maintain bidirectional relationship
    }

    // Internal method to be called by Course to avoid recursion
    protected void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

// School Class (aggregation with Student)
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student); // Aggregation: School has students
    }

    public void showAllStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

// Main class to demonstrate the relationships
public class school {
    public static void main(String[] args) {
        // Create school
        school school = new school("Greenwood High");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Add students to school (aggregation)
        school.addStudent(alice);
        school.addStudent(bob);

        // Enroll students in courses (association)
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);
        bob.enrollInCourse(science);

        // Display info
        school.showAllStudents();
        alice.showEnrolledCourses();
        bob.showEnrolledCourses();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
