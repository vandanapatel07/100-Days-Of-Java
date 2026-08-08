import java.util.Scanner;
public class Day20 {

        // ------------------ Program 1 --------------

        static abstract class Shape {

            abstract void area();
        }

        static class Square extends Shape {

            int side;

            Square(int side) {
                this.side = side;
            }

            @Override
            void area() {
                System.out.println("Area of Square = " + (side * side));
            }
        }

        // ------------------ Program 2 ----------------

        static abstract class Bank {

            abstract void interestRate();

            void message() {
                System.out.println("Welcome to the Bank");
            }
        }

        static class SBI extends Bank {

            @Override
            void interestRate() {
                System.out.println("SBI Interest Rate = 7%");
            }
        }

        // ----------------- Program 3 -----------------

        static abstract class Employee {

            String name;

            Employee(String name) {
                this.name = name;
            }

            abstract void calculateSalary();

            void displayName() {
                System.out.println("Employee Name : " + name);
            }
        }

        static class Developer extends Employee {

            double salary;

            Developer(String name, double salary) {
                super(name);
                this.salary = salary;
            }

            @Override
            void calculateSalary() {
                System.out.println("Salary : ₹" + salary);
            }
        }

        // ------------------- Program 4 -----------------

        static abstract class Vehicle {

            String brand;

            Vehicle(String brand) {
                this.brand = brand;
            }

            abstract void start();

            void displayBrand() {
                System.out.println("Vehicle Brand : " + brand);
            }
        }

        static class Bike extends Vehicle {

            Bike(String brand) {
                super(brand);
            }

            @Override
            void start() {
                System.out.println("Bike Started...");
            }
        }

        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            System.out.print("Enter Square Side : ");
            int side = sc.nextInt();

            Square square = new Square(side);
            square.area();


            // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            SBI sbi = new SBI();

            sbi.message();
            sbi.interestRate();


            // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            sc.nextLine();

            System.out.print("Enter Employee Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Salary : ");
            double salary = sc.nextDouble();

            Developer developer = new Developer(name, salary);

            developer.displayName();
            developer.calculateSalary();


            // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            sc.nextLine();

            System.out.print("Enter Bike Brand : ");
            String brand = sc.nextLine();

            Bike bike = new Bike(brand);

            bike.displayBrand();
            bike.start();

            sc.close();
        }
    }

