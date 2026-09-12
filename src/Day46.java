import java.util.*;

public class Day46 {

    // Student class for Program 3
    static class Student implements Comparable<Student> {

        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student other) {
            return this.marks - other.marks;
        }

        @Override
        public String toString() {
            return name + " - " + marks;
        }
    }


    // Employee class for Program 4
    static class Employee implements Comparable<Employee> {

        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee other) {
            return Double.compare(this.salary, other.salary);
        }

        @Override
        public String toString() {
            return name + " - ₹" + salary;
        }
    }


    // Program 1: Iterator with ArrayList
    static void iteratorExample() {

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("JavaScript");

        Iterator<String> iterator = languages.iterator();

        System.out.println("Programming Languages:");

        while (iterator.hasNext()) {
            String language = iterator.next();
            System.out.println(language);
        }
    }


    // Program 2: Remove elements using Iterator
    static void iteratorRemoveExample() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number > 30) {
                iterator.remove();
            }
        }

        System.out.println("After removing numbers greater than 30:");
        System.out.println(numbers);
    }


    // Program 3: Sort Students by marks using Comparable
    static void studentSorting() {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 75));
        students.add(new Student("Priya", 90));
        students.add(new Student("Aman", 65));
        students.add(new Student("Neha", 82));

        Collections.sort(students);

        System.out.println("Students sorted by marks:");

        for (Student student : students) {
            System.out.println(student);
        }
    }


    // Program 4: Sort Employees by salary using Comparable
    static void employeeSorting() {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aman", 45000));
        employees.add(new Employee("Priya", 60000));
        employees.add(new Employee("Rahul", 40000));
        employees.add(new Employee("Neha", 75000));

        Collections.sort(employees);

        System.out.println("Employees sorted by salary:");

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


    public static void main(String[] args) {

        System.out.println("========== PROGRAM 1 ==========");
        iteratorExample();

        System.out.println("\n========== PROGRAM 2 ==========");
        iteratorRemoveExample();

        System.out.println("\n========== PROGRAM 3 ==========");
        studentSorting();

        System.out.println("\n========== PROGRAM 4 ==========");
        employeeSorting();
    }
}
