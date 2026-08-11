import java.util.Scanner;

public class Day23 {

    // --------------- Program 1 -----------------
    // Divide by Zero Exception

    static void divideNumbers(int a, int b) {

        try {
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }


    // ------------------- Program 2 ---------------
    // Array Index Exception

    static void accessArray(int[] numbers, int index) {

        try {
            System.out.println("Value = " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index.");
        }
    }


    // ---------------- Program 3 --------------
    // finally Block

    static void checkNumber(int number) {

        try {

            if (number < 0) {
                throw new Exception("Negative number is not allowed.");
            }

            System.out.println("Number = " + number);

        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());

        } finally {
            System.out.println("Finally block executed.");
        }
    }


    // -------------- Program 4 ------------------
    // throw and throws

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("You are not eligible to vote.");
        }

        System.out.println("You are eligible to vote.");
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        divideNumbers(a, b);


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter Array Index (0-4) : ");
        int index = sc.nextInt();

        accessArray(numbers, index);


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        checkNumber(number);


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Exception : " + e.getMessage());
        }


        sc.close();
    }
}
