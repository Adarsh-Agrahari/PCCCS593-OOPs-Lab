// Q3.	Create a class named 'Member' having the following members:
// Data members 
// 1 - Name
// 2 - Age
// 3 - Phone number 
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

class Member {
    String Name;
    int Age;
    int PhNo;
    String address;
    int salary;

    Member(String n, int ag, int p, String ad, int sal) {
        this.Name = n;
        this.Age = ag;
        this.PhNo = p;
        this.address = ad;
        this.salary = sal;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    Employee(String n, int ag, int p, String ad, int sal, String sz) {
        super(n, ag, p, ad, sal);
        this.specialization = sz;
    }
}

class Manager extends Member {
    String department;

    Manager(String n, int ag, int p, String ad, int sal, String dt) {
        super(n, ag, p, ad, sal);
        this.department = dt;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, 1234567890, "123 Main St", 50000, "Java Developer");
        Manager mng = new Manager("Alice", 35, 987654321, "456 Elm St", 70000, "HR");

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.Name);
        System.out.println("Age: " + emp.Age);
        System.out.println("Phone Number: " + emp.PhNo);
        System.out.println("Address: " + emp.address);
        emp.printSalary();
        System.out.println("Specialization: " + emp.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + mng.Name);
        System.out.println("Age: " + mng.Age);
        System.out.println("Phone Number: " + mng.PhNo);
        System.out.println("Address: " + mng.address);
        mng.printSalary();
        System.out.println("Department: " + mng.department);
    }
}

// Output ~

// Employee Details:
// Name: John
// Age: 30
// Phone Number: 1234567890
// Address: 123 Main St
// Salary: 50000
// Specialization: Java Developer

// Manager Details:
// Name: Alice
// Age: 35
// Phone Number: 987654321
// Address: 456 Elm St
// Salary: 70000
// Department: HR