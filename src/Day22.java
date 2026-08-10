import java.util.Scanner;

    public class Day22 {

        // ------------------- Program 1 ----------------
        // Interface with Calculator

        interface Calculator {
            void add(int a, int b);
            void subtract(int a, int b);
        }

        static class MyCalculator implements Calculator {

            public void add(int a, int b) {
                System.out.println("Addition = " + (a + b));
            }

            public void subtract(int a, int b) {
                System.out.println("Subtraction = " + (a - b));
            }
        }


        // ------------------ Program 2 -----------------
        // Interface with Payment

        interface Payment {
            void pay(double amount);
        }

        static class UPI implements Payment {

            public void pay(double amount) {
                System.out.println("Payment of ₹" + amount + " made using UPI.");
            }
        }


        // ------------------- Program 3 -----------------
        // Multiple Interfaces

        interface Camera {
            void takePhoto();
        }

        interface MusicPlayer {
            void playMusic();
        }

        static class Smartphone implements Camera, MusicPlayer {

            public void takePhoto() {
                System.out.println("Photo captured.");
            }

            public void playMusic() {
                System.out.println("Music is playing.");
            }
        }


        // ------------------ Program 4 ------------------
        // Interface with User Input

        interface Area {
            void calculateArea(double value);
        }

        static class Circle implements Area {

            public void calculateArea(double radius) {
                double area = Math.PI * radius * radius;

                System.out.println("Area of Circle = " + area);
            }
        }


        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            MyCalculator calculator = new MyCalculator();

            calculator.add(20, 10);
            calculator.subtract(20, 10);


            // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            UPI upi = new UPI();

            System.out.print("Enter Payment Amount : ");
            double amount = sc.nextDouble();

            upi.pay(amount);


            // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            Smartphone phone = new Smartphone();

            phone.takePhoto();
            phone.playMusic();


            // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            Circle circle = new Circle();

            System.out.print("Enter Circle Radius : ");
            double radius = sc.nextDouble();

            circle.calculateArea(radius);


            sc.close();
        }
    }
