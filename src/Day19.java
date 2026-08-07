import java.util.Scanner;
public class Day19 {

        // ================= Program 1 =================

        static class Animal {

            void sound() {
                System.out.println("Animal makes a sound.");
            }
        }

        static class Lion extends Animal {

            @Override
            void sound() {
                System.out.println("Lion Roars.");
            }
        }

        // ================= Program 2 =================

        static class Employee {

            void work() {
                System.out.println("Employee is Working.");
            }
        }

        static class Manager extends Employee {

            @Override
            void work() {
                System.out.println("Manager is Managing the Team.");
            }
        }

        // ================= Program 3 =================

        static class Notification {

            void send() {
                System.out.println("Sending Notification...");
            }
        }

        static class EmailNotification extends Notification {

            @Override
            void send() {
                System.out.println("Sending Email Notification.");
            }
        }

        // ================= Program 4 =================

        static class Payment {

            void pay(double amount) {
                System.out.println("Payment Amount : " + amount);
            }
        }

        static class UpiPayment extends Payment {

            @Override
            void pay(double amount) {
                System.out.println("UPI Payment Successful : ₹" + amount);
            }
        }

        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            Animal a = new Lion();
            a.sound();

            // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            Employee e = new Manager();
            e.work();

            // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            Notification n = new EmailNotification();
            n.send();

            // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            System.out.print("Enter Payment Amount : ");
            double amount = sc.nextDouble();

            Payment p = new UpiPayment();
            p.pay(amount);

            sc.close();
        }
    }

