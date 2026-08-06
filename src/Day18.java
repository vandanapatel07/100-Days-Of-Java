import java.util.Scanner;

    public class Day18 {

    // ---------------- Program 1 --------------

        static class Calculator {

            void add(int a, int b) {
                System.out.println("Addition = " + (a + b));
            }

            void add(int a, int b, int c) {
                System.out.println("Addition = " + (a + b + c));
            }
        }

    // --------------- Program 2 --------------

        static class Display {

            void show(String name) {
                System.out.println("Name : " + name);
            }

            void show(int age) {
                System.out.println("Age : " + age);
            }
        }

    // ------------- Program 3 ----------------

        static class Area {

            void calculate(int side) {
                System.out.println("Area of Square = " + (side * side));
            }

            void calculate(int length, int breadth) {
                System.out.println("Area of Rectangle = " + (length * breadth));
            }
        }

    // --------------- Program 4 -----------------

        static class Employee {

            void details(String name) {
                System.out.println("Employee Name : " + name);
            }

            void details(String name, double salary) {
                System.out.println("Employee Name : " + name);
                System.out.println("Salary : " + salary);
            }
        }

        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

        // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            Calculator c = new Calculator();

            c.add(10, 20);
            c.add(10, 20, 30);

        // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            Display d = new Display();

            d.show("Vandana");
            d.show(20);

       // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            Area a = new Area();

            System.out.print("Enter Side : ");
            int side = sc.nextInt();

            a.calculate(side);

            System.out.print("Enter Length : ");
            int length = sc.nextInt();

            System.out.print("Enter Breadth : ");
            int breadth = sc.nextInt();

            a.calculate(length, breadth);

        // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            sc.nextLine();

            Employee e = new Employee();

            System.out.print("Enter Employee Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Salary : ");
            double salary = sc.nextDouble();

            e.details(name);
            System.out.println();

            e.details(name, salary);

            sc.close();
        }
    }

