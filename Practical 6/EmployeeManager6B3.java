import java.util.*;

class Member {
    String name;
    int age;
    String phone_no;
    String address;
    int salary;

    Member(String name, int age, String phone_no, String address, int salary) {
        this.name = name;
        this.age = age;
        this.phone_no = phone_no;
        this.address = address;
        this.salary = salary;
    }

    public void salary() {
        System.out.println("Salary :- " + salary);
    }

    public void display() {
        System.out.println("\nName :- " + name);
        System.out.println("Age :- " + age);
        System.out.println("Phone no :- " + phone_no);
        System.out.println("Address :- " + address);
        salary();

    }
}

class Employee extends Member {
    String specialization;

    Employee(String name, int age, String phone_no, String address, int salary, String specialization) {
        super(name, age, phone_no, address, salary);
        this.specialization = specialization;
    }

    public void Empinfo() {
        System.out.println();
        display();
        System.out.println("Specialization :- " + specialization+"\n");
    }
}

class Manager extends Member {
    String department;
    Manager(String name, int age, String phone_no, String address, int salary, String department) {
        super(name, age, phone_no, address, salary);
        this.department = department;
    }

    public void Mngrinfo() {
        display();
        System.out.println("Department :- " + department+"\n");
    }
}

public class EmployeeManager6B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Employee...............");

        System.out.print("Enter name :- ");
        String ename = sc.nextLine();
        System.out.print("Enter age :- ");
        int eage = sc.nextInt();
        System.out.print("Enter phone no :- ");
        String ephone_no = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter address :- ");
        String eaddress = sc.nextLine();
        System.out.print("Enter salary :- ");
        int esalary = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Specialization :- ");
        String Specialization = sc.nextLine();

        Employee e1 = new Employee(ename, eage, ephone_no, eaddress, esalary, Specialization);

        e1.Empinfo();

        System.out.println("Enter details for Managere...............");

        System.out.print("Enter name :- ");
        String mname = sc.nextLine();
        System.out.print("Enter age :- ");
        int mage = sc.nextInt();
        System.out.print("Enter phone no :- ");
        String mphone_no = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter address :- ");
        String maddress = sc.nextLine();
        System.out.print("Enter salary :- ");
        int msalary = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department :- ");
        String department = sc.nextLine();

        Manager m1 = new Manager(mname, mage, mphone_no, maddress, msalary, department);

        m1.Mngrinfo();

    }
}