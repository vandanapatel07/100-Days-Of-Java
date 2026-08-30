import java.io.*;
import java.util.Scanner;

public class Day38 {

    // ================= Program 1 =================
    // Serialize Student Object

    static class Student implements Serializable {

        int id;
        String name;
        double marks;

        Student(int id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("Marks : " + marks);
        }
    }


    // ================= Program 2 =================
    // Deserialize Student Object

    static void deserializeStudent() {

        try {

            ObjectInputStream input =
                    new ObjectInputStream(
                            new FileInputStream("student.dat"));

            Student student = (Student) input.readObject();

            System.out.println("Student Object Retrieved:");
            student.display();

            input.close();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    // ================= Program 3 =================
    // Serialize Employee Object

    static class Employee implements Serializable {

        int id;
        String name;
        double salary;

        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println("Employee ID : " + id);
            System.out.println("Employee Name : " + name);
            System.out.println("Salary : ₹" + salary);
        }
    }


    // ================= Program 4 =================
    // User Input + Serialization

    static void userInputSerialization(Scanner sc) {

        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary : ");
        double salary = sc.nextDouble();

        Employee employee =
                new Employee(id, name, salary);

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.dat"));

            output.writeObject(employee);

            output.close();

            System.out.println(
                    "Employee object saved successfully.");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------
        System.out.println("========== PROGRAM 1 ==========");

        Student student =
                new Student(101, "Vandana", 85.5);

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream("student.dat"));

            output.writeObject(student);

            output.close();

            System.out.println(
                    "Student object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }


        // ---------- Program 2 ----------
        System.out.println("\n========== PROGRAM 2 ==========");

        deserializeStudent();


        // ---------- Program 3 ----------
        System.out.println("\n========== PROGRAM 3 ==========");

        Employee employee =
                new Employee(201, "Rahul", 45000);

        try {

            ObjectOutputStream output =
                    new ObjectOutputStream(
                            new FileOutputStream("employee.dat"));

            output.writeObject(employee);

            output.close();

            System.out.println(
                    "Employee object serialized successfully.");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }


        // ---------- Program 4 ----------
        System.out.println("\n========== PROGRAM 4 ==========");

        userInputSerialization(sc);


        sc.close();
    }
}