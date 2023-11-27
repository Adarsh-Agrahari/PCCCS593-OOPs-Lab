// Q5. Create a class called Employee that includes three pieces of information as instance variables— a first name (type String), a last name (type String) and a monthly salary (double). Your class should have a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); // Call the setMonthlySalary method to ensure it's not negative
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void applyRaise(double percentage) {
        monthlySalary += monthlySalary * (percentage / 100.0);
    }
}

public class Q5 {
    public static void main(String[] args) {
        // Create Employee objects
        Employee employee1 = new Employee("Bob", "Jone", 2875);
        Employee employee2 = new Employee("Susan", "Baker", 3150.75); // Demonstrate negative monthly salary

        // Display yearly salary for each employee
        displayYearlySalary(employee1);
        displayYearlySalary(employee2);

        System.out.println();
        System.out.println("Increasing employee salaries by 10%");

        // Give a 10% raise to each employee
        employee1.applyRaise(10);
        employee2.applyRaise(10);

        // Display yearly salary after the raise
        displayYearlySalary(employee1);
        displayYearlySalary(employee2);
    }

    public static void displayYearlySalary(Employee employee) {
        System.out.println(employee.getFirstName() + " " + employee.getLastName() +
                "'s Yearly Salary: " + employee.getYearlySalary());
    }
}


// Sample Output:

// Employee 1: Bob Jones; Yearly Salary: 34500.00
// Employee 2: Susan Baker; Yearly Salary: 37809.00

// Increasing employee salaries by 10%
// Employee 1: Bob Jones; Yearly Salary: 37950.00
// Employee 2: Susan Baker; Yearly Salary: 41589.90