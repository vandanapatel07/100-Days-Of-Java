import java.util.*;

public class Day47 {

    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return name + " - " + marks;
        }
    }

    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + " - ₹" + salary;
        }
    }

    static class Product {
        String name;
        double price;

        Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " - ₹" + price;
        }
    }

    // Program 1: Sort Students by Marks
    static void sortByMarks() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 75));
        students.add(new Student("Priya", 92));
        students.add(new Student("Aman", 68));
        students.add(new Student("Neha", 85));

        students.sort(Comparator.comparingInt(s -> s.marks));

        System.out.println("Students sorted by marks:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Program 2: Sort Students by Name
    static void sortByName() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Zoya", 80));
        students.add(new Student("Aman", 75));
        students.add(new Student("Rahul", 90));
        students.add(new Student("Neha", 85));

        students.sort(Comparator.comparing(s -> s.name));

        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Program 3: Sort Employees by Salary
    static void sortEmployees() {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Rahul", 45000));
        employees.add(new Employee("Priya", 65000));
        employees.add(new Employee("Aman", 40000));
        employees.add(new Employee("Neha", 75000));

        employees.sort(Comparator.comparingDouble(e -> e.salary));

        System.out.println("Employees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Program 4: Sort Products by Price
    static void sortProducts() {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 55000));
        products.add(new Product("Mouse", 800));
        products.add(new Product("Keyboard", 1500));
        products.add(new Product("Monitor", 12000));

        products.sort(Comparator.comparingDouble(p -> p.price));

        System.out.println("Products sorted by price:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {

        System.out.println("========== PROGRAM 1 ==========");
        sortByMarks();

        System.out.println("\n========== PROGRAM 2 ==========");
        sortByName();

        System.out.println("\n========== PROGRAM 3 ==========");
        sortEmployees();

        System.out.println("\n========== PROGRAM 4 ==========");
        sortProducts();
    }
}
