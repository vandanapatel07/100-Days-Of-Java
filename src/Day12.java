import java.util.Scanner;

    public class Day12 {

        // Program 1: Static Variable
        static class Student {
            String name;
            static String college = "KCTM";

            Student(String name) {
                this.name = name;
            }

            void display() {
                System.out.println("Name : " + name);
                System.out.println("College : " + college);
            }
        }

        //------------------------------------------------------

        // Program 2: Static Method
        static class Calculator {

            static int square(int n) {
                return n * n;
            }
        }

        //------------------------------------------------------

        // Program 3: Static Block
        static class Demo {

            static {
                System.out.println("Static Block Executed");
            }

            Demo() {
                System.out.println("Constructor Called");
            }
        }

        //------------------------------------------------------

        // Program 4: User Input + Static Variable
        static class Employee {

            String name;
            static String company = "OpenAI";

            Employee(String name) {
                this.name = name;
            }

            void display() {
                System.out.println("Employee Name : " + name);
                System.out.println("Company : " + company);
            }
        }

        //------------------------------------------------------

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Program 1
            System.out.println("PROGRAM 1");
            Student s1 = new Student("Vandana");
            Student s2 = new Student("Rahul");

            s1.display();
            s2.display();

            //------------------------------------------------------

            // Program 2
            System.out.println("\nPROGRAM 2");
            System.out.print("Enter Number : ");
            int num = sc.nextInt();

            System.out.println("Square = " + Calculator.square(num));

            //------------------------------------------------------

            // Program 3
            System.out.println("\nPROGRAM 3");
            Demo d = new Demo();

            //------------------------------------------------------

            // Program 4
            System.out.println("\nPROGRAM 4");

            sc.nextLine();

            System.out.print("Enter Employee Name : ");
            String name = sc.nextLine();

            Employee e1 = new Employee(name);
            e1.display();

            sc.close();
        }
    }

