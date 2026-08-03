import java.util.Scanner;
public class Day15 {

 //---------------- Program 1 --------------------

        static class Bank {

            void bankName() {
                System.out.println("Bank : State Bank of India");
            }
        }

        static class SavingAccount extends Bank {

            void savingFeature() {
                System.out.println("Interest is Available.");
            }
        }

        static class CurrentAccount extends Bank {

            void currentFeature() {
                System.out.println("Overdraft Facility Available.");
            }
        }

//---------------------- Program 2 -----------------

        static class Shape {

            void message() {
                System.out.println("Area Calculation");
            }
        }

        static class Rectangle extends Shape {

            void area(int length, int breadth) {
                System.out.println("Rectangle Area = " + (length * breadth));
            }
        }

        static class Circle extends Shape {

            void area(double radius) {
                System.out.println("Circle Area = " + (3.14 * radius * radius));
            }
        }

//------------------------ Main Method -----------------

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

//------------------ Program 1 ------------------

            System.out.println("========== PROGRAM 1 ==========");

            SavingAccount s = new SavingAccount();
            CurrentAccount c = new CurrentAccount();

            s.bankName();
            s.savingFeature();

            System.out.println();

            c.bankName();
            c.currentFeature();

//------------------ Program 2 -------------------

            System.out.println("\n========== PROGRAM 2 ==========");

            Rectangle r = new Rectangle();
            Circle cr = new Circle();

            r.message();

            System.out.print("Enter Length : ");
            int length = sc.nextInt();

            System.out.print("Enter Breadth : ");
            int breadth = sc.nextInt();

            r.area(length, breadth);

            System.out.print("\nEnter Radius : ");
            double radius = sc.nextDouble();

            cr.area(radius);

            sc.close();
        }
    }

