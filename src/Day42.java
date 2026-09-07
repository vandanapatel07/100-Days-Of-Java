import java.util.Scanner;

public class Day42 {

    // ================= PROGRAM 1 =================
    // Try-Catch: Division by Zero

    static void divisionExample(Scanner sc) {

        System.out.println("\n===== PROGRAM 1: Division =====");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        try {

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        }
    }


    // ================= PROGRAM 2 =================
    // Multiple Catch Blocks

    static void arrayExample(Scanner sc) {

        System.out.println("\n===== PROGRAM 2: Array Exception =====");

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter array index (0-4): ");
        int index = sc.nextInt();

        try {

            System.out.println(
                    "Value: " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Error: Invalid array index.");

        } catch (Exception e) {

            System.out.println(
                    "Something went wrong.");
        }
    }


    // ================= PROGRAM 3 =================
    // Finally Block

    static void finallyExample(Scanner sc) {

        System.out.println("\n===== PROGRAM 3: Finally Block =====");

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {

            int result = 100 / number;

            System.out.println(
                    "Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: Number cannot be zero.");

        } finally {

            System.out.println(
                    "Finally block executed.");
        }
    }


    // ================= PROGRAM 4 =================
    // Custom Exception

    static class InvalidAgeException
            extends Exception {

        InvalidAgeException(String message) {

            super(message);
        }
    }


    static void checkAge(Scanner sc) {

        System.out.println("\n===== PROGRAM 4: Custom Exception =====");

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {

            if (age < 18) {

                throw new InvalidAgeException(
                        "Age must be 18 or above.");
            }

            System.out.println(
                    "You are eligible.");

        } catch (InvalidAgeException e) {

            System.out.println(
                    "Custom Exception: "
                            + e.getMessage());
        }
    }


    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Program 1
        divisionExample(sc);

        // Program 2
        arrayExample(sc);

        // Program 3
        finallyExample(sc);

        // Program 4
        checkAge(sc);

        sc.close();
    }
}
