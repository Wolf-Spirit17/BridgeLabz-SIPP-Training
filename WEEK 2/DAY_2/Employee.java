public class Employee {

        public int employeeID;
        protected String department;
        private double salary;
        public Employee(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }
        public void setSalary(double newSalary) {
            if (newSalary >= 0) {
                this.salary = newSalary;
            } else {
                System.out.println("Salary cannot be negative.");
            }
        }
        public double getSalary() {
            return this.salary;
        }
        public static class Manager extends Employee {
            public Manager(int employeeID, String department, double salary) {
                super(employeeID, department, salary);
            }

            public void displayManagerDetails() {
                System.out.println("Manager ID: " + employeeID);
                System.out.println("Department: " + department);
            }
        }

        // Main method to test
        public static void main(String[] args) {
            Manager mgr = new Manager(101, "HR", 75000);

            mgr.displayManagerDetails();

            mgr.setSalary(80000);
            System.out.println("Updated Salary: " + mgr.getSalary());
        }


}
