import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Day32 {

    // ================= Program 1 =================
    // Comparable - Sort Students by Marks

    static class Student implements Comparable<Student> {

        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student s) {
            return this.marks - s.marks;
        }

        void display() {
            System.out.println(name + " - " + marks);
        }
    }


    // ================= Program 2 =================
    // Comparator - Sort Students by Name

    static class NameComparator implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }


    // ================= Program 3 =================
    // Comparator - Sort Employees by Salary

    static class Employee {

        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        void display() {
            System.out.println(name + " - ₹" + salary);
        }
    }

    static class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee e1, Employee e2) {
            return Double.compare(e1.salary, e2.salary);
        }
    }


    // ================= Program 4 =================
    // User Input + Sorting

    static class Product {

        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void display() {
            System.out.println(name + " - ₹" + price);
        }
    }

    static class PriceComparator implements Comparator<Product> {

        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.price, p2.price);
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Program 1 ----------
        System.out.println("========== PROGRAM 1 ==========");

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Riya", 85));
        students.add(new Student("Aman", 72));
        students.add(new Student("Rahul", 91));
        students.add(new Student("Priya", 78));

        Collections.sort(students);

        System.out.println("Students Sorted by Marks:");

        for (Student s : students) {
            s.display();
        }


        // ---------- Program 2 ----------
        System.out.println("\n========== PROGRAM 2 ==========");

        Collections.sort(students, new NameComparator());

        System.out.println("Students Sorted by Name:");

        for (Student s : students) {
            s.display();
        }


        // ---------- Program 3 ----------
        System.out.println("\n========== PROGRAM 3 ==========");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Amit", 45000));
        employees.add(new Employee("Neha", 35000));
        employees.add(new Employee("Karan", 55000));
        employees.add(new Employee("Pooja", 40000));

        Collections.sort(employees, new SalaryComparator());

        System.out.println("Employees Sorted by Salary:");

        for (Employee e : employees) {
            e.display();
        }


        // ---------- Program 4 ----------
        System.out.println("\n========== PROGRAM 4 ==========");

        ArrayList<Product> products = new ArrayList<>();

        System.out.print("How many products do you want to add? ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Product Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Product Price : ");
            double price = sc.nextDouble();

            sc.nextLine();

            products.add(new Product(name, price));
        }

        Collections.sort(products, new PriceComparator());

        System.out.println("\nProducts Sorted by Price:");

        for (Product p : products) {
            p.display();
        }

        sc.close();
    }
}