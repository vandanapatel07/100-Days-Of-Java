import java.util.Scanner;

    public class Day17 {

        // ---------------- Program 1 -------------

        static class Animal {
            void sound() {
                System.out.println("Animal makes a sound.");
            }
        }

        static class Cat extends Animal {
            @Override
            void sound() {
                System.out.println("Cat says Meow Meow.");
            }
        }

        // ----------------- Program 2 ----------------------

        static class Bank {
            void interestRate() {
                System.out.println("Bank Interest Rate : 5%");
            }
        }

        static class HDFC extends Bank {
            @Override
            void interestRate() {
                System.out.println("HDFC Interest Rate : 7%");
            }
        }

        // ------------------ Program 3 ------------------

        static class Shape {
            void draw() {
                System.out.println("Drawing Shape...");
            }
        }

        static class Triangle extends Shape {
            @Override
            void draw() {
                System.out.println("Drawing Triangle...");
            }
        }

        // ------------------- Program 4 ------------------------

        static class Vehicle {

            void display(String brand) {
                System.out.println("Vehicle Brand : " + brand);
            }
        }

        static class Bike extends Vehicle {

            @Override
            void display(String brand) {
                System.out.println("Bike Brand : " + brand);
            }
        }

        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            Cat c = new Cat();
            c.sound();

            // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            HDFC h = new HDFC();
            h.interestRate();

            // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            Triangle t = new Triangle();
            t.draw();

            // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            Bike b = new Bike();

            System.out.print("Enter Bike Brand : ");
            String brand = sc.nextLine();

            b.display(brand);

            sc.close();
        }
    }

