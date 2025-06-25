public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: ₹" + fee);
        System.out.println();
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 5000);
        Course c2 = new Course("Web Development", 8, 8000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("Global Tech Academy");

        Course c3 = new Course("Data Science", 10, 12000);
        c3.displayCourseDetails();

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
