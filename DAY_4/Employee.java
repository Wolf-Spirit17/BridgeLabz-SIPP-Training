import java.util.*;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    public void display() {
        System.out.println("Department: " + name);
        for (Employee e : employees) {
            e.display();
        }
    }

    public void clear() {
        employees.clear();
    }
}

class Company {
    private String name;
    private List<Department> departments;
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }
    public void addDepartment(Department dept) {
        departments.add(dept);
    }
    public void displayStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments) {
            d.display();
        }
    }
    public void dissolve() {
        for (Department d : departments) {
            d.clear();
        }
        departments.clear();
        System.out.println("Company " + name + " has been dissolved. All departments and employees removed.");
    }
}
public class Main {
    public static void main(String[] args) {
        Company company = new Company("TechNova");

        Department dev = new Department("Development");
        dev.addEmployee("Ashish");
        dev.addEmployee("Riya");

        Department hr = new Department("Human Resources");
        hr.addEmployee("Suresh");
        hr.addEmployee("Maya");

        company.addDepartment(dev);
        company.addDepartment(hr);

        company.displayStructure();

        company.dissolve();
    }
}
