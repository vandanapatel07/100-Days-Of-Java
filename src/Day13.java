import java.util.Scanner;

    public class Day13 {

        // ---------------- Program 1 ----------------
        static class Animal {
            void eat() {
                System.out.println("Animal is Eating");
            }
        }

        static class Dog extends Animal {
            void bark() {
                System.out.println("Dog is Barking");
            }
        }

        // ---------------- Program 2 ----------------
        static class Person {
            String name = "Vandana";

            void showName() {
                System.out.println("Name : " + name);
            }
        }

        static class Student extends Person {
            int roll = 101;

            void showRoll() {
                System.out.println("Roll No : " + roll);
            }
        }

        // ---------------- Program 3 ----------------
        static class Employee {
            String name;
            int id;

            void input(String n, int i) {
                name = n;
                id = i;
            }
        }

        static class Company extends Employee {
            void display() {
                System.out.println("Employee Name : " + name);
                System.out.println("Employee ID : " + id);
            }
        }

        // ---------------- Program 4 ----------------
        static class Marks {
            int m1, m2;

            void input(int a, int b) {
                m1 = a;
                m2 = b;
            }
        }

        static class Result extends Marks {
            void total() {
                System.out.println("Total Marks : " + (m1 + m2));
            }
        }

        // ---------------- Main Method ----------------
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Program 1
            System.out.println("========== PROGRAM 1 ==========");
            Dog d = new Dog();
            d.eat();
            d.bark();

            // Program 2
            System.out.println("\n========== PROGRAM 2 ==========");
            Student s = new Student();
            s.showName();
            s.showRoll();

            // Program 3
            System.out.println("\n========== PROGRAM 3 ==========");
            Company c = new Company();

            System.out.print("Enter Employee Name : ");
            String empName = sc.next();

            System.out.print("Enter Employee ID : ");
            int empId = sc.nextInt();

            c.input(empName, empId);
            c.display();

            // Program 4
            System.out.println("\n========== PROGRAM 4 ==========");
            Result r = new Result();

            System.out.print("Enter Marks 1 : ");
            int m1 = sc.nextInt();

            System.out.print("Enter Marks 2 : ");
            int m2 = sc.nextInt();

            r.input(m1, m2);
            r.total();

            sc.close();
        }
    }

