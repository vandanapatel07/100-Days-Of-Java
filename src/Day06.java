    import java.util.Scanner;

    public class Day06 {

        // Method 1: Add Two Numbers
        public static int add(int a, int b) {
            return a + b;
        }

        // Method 2: Check Even or Odd
        public static void checkEvenOdd(int number) {
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        }

        // Method 3: Find Largest of Three Numbers
        public static int findLargest(int a, int b, int c) {
            if (a >= b && a >= c) {
                return a;
            } else if (b >= a && b >= c) {
                return b;
            } else {
                return c;
            }
        }

        // Method 4: Calculate Factorial
        public static int factorial(int number) {
            int result = 1;

            for (int i = 1; i <= number; i++) {
                result = result * i;
            }

            return result;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Program 1: Add Two Numbers


            System.out.println("PROGRAM 1: ADD TWO NUMBERS");

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int sum = add(a, b);

            System.out.println("Sum = " + sum);

//------------------------------------------------------------

            // Program 2: Check Even or Odd


            System.out.println("\nPROGRAM 2: EVEN OR ODD");

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            checkEvenOdd(number);

//--------------------------------------------------------------


            // Program 3: Find Largest of Three Numbers
            System.out.println("\nPROGRAM 3: LARGEST OF THREE NUMBERS");

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter third number: ");
            int num3 = sc.nextInt();

            int largest = findLargest(num1, num2, num3);

            System.out.println("Largest number = " + largest);


//____________________________________________________________________

            // Program 4: Calculate Factorial


            System.out.println("\nPROGRAM 4: FACTORIAL");

            System.out.print("Enter a number: ");
            int factNumber = sc.nextInt();

            int fact = factorial(factNumber);

            System.out.println("Factorial = " + fact);

            sc.close();
        }
    }

