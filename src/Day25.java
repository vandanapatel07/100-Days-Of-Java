import java.util.Scanner;

    public class Day25 {

        // ------------- Program 1 --------------
        // Autoboxing

        static void autoboxingExample() {

            int number = 50;

            Integer obj = number;

            System.out.println("Primitive Value : " + number);
            System.out.println("Wrapper Object : " + obj);
        }


        // -------------- Program 2 ---------------
        // Unboxing

        static void unboxingExample() {

            Double obj = 25.5;

            double number = obj;

            System.out.println("Wrapper Object : " + obj);
            System.out.println("Primitive Value : " + number);
        }


        // ---------------- Program 3 ---------------
        // String to Integer

        static void convertStringToInteger(String value) {

            Integer number = Integer.parseInt(value);

            System.out.println("String Value : " + value);
            System.out.println("Integer Value : " + number);
            System.out.println("After Addition : " + (number + 10));
        }


        // ---------------- Program 4 ---------------
        // User Input + Wrapper Class

        static void userInputExample(int number) {

            Integer value = number;

            System.out.println("Entered Number : " + value);
            System.out.println("Double Value : " + (value * 2));
        }


        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            autoboxingExample();


            // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            unboxingExample();


            // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            System.out.print("Enter a Number as String : ");
            String value = sc.nextLine();

            convertStringToInteger(value);


            // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            System.out.print("Enter a Number : ");
            int number = sc.nextInt();

            userInputExample(number);


            sc.close();
        }
    }
