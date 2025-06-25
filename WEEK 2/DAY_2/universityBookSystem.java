public class universityBookSystem {
    public static class Student {
        public int rollNumber;
        protected String name;
        private double CGPA;

        public Student(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        public double getCGPA() {
            return CGPA;
        }

        public void setCGPA(double CGPA) {
            if (CGPA >= 0 && CGPA <= 10) {
                this.CGPA = CGPA;
            } else {
                System.out.println("Invalid CGPA value.");
            }
        }
    }

    public static class PostgraduateStudent extends Student {
        private String specialization;

        public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
            super(rollNumber, name, CGPA);
            this.specialization = specialization;
        }

        public void displayDetails() {
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Specialization: " + specialization);
        }
    }

    public static class Book {
        public String ISBN;
        protected String title;
        private String author;

        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }
    }

    public static class EBook extends Book {
        private double fileSizeMB;

        public EBook(String ISBN, String title, String author, double fileSizeMB) {
            super(ISBN, title, author);
            this.fileSizeMB = fileSizeMB;
        }

        public void displayDetails() {
            System.out.println("ISBN: " + ISBN);
            System.out.println("Title: " + title);
            System.out.println("File Size: " + fileSizeMB + " MB");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== University Management System ===");
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 8.5, "Computer Science");
        pgStudent.displayDetails();
        pgStudent.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pgStudent.getCGPA());

        System.out.println("\n=== Book Library System ===");
        EBook ebook = new EBook("978-0134685991", "Effective Java", "Joshua Bloch", 2.5);
        ebook.displayDetails();
        System.out.println("Author: " + ebook.getAuthor());
        ebook.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
