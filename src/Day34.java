import java.util.ArrayList;
import java.util.Scanner;

public class Day34 {

    // ================= Program 1 =================
    // Lambda Expression for Addition

    interface Addition {
        int calculate(int a, int b);
    }


    // ================= Program 2 =================
    // Lambda Expression for Even/Odd

    interface CheckNumber {
        boolean check(int number);
    }


    // ================= Program 3 =================
    // Lambda Expression for Greeting

    interface Greeting {
        void message(String name);
    }


    // ================= Program 4 =================
    // Lambda Expression with ArrayList

    interface NumberOperation {
        int operate(int number);
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        Addition add = (a, b) -> a + b;

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        System.out.println("Addition = " + add.calculate(a, b));


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        CheckNumber checkEven = number -> number % 2 == 0;

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        if (checkEven.check(number)) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        Greeting greeting = name ->
                System.out.println("Hello, " + name + "! Welcome to Java.");

        sc.nextLine();

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        greeting.message(name);


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        NumberOperation square = n -> n * n;

        System.out.println("Original Numbers : " + numbers);

        System.out.println("Square of Numbers:");

        for (int n : numbers) {
            System.out.println(n + " → " + square.operate(n));
        }


        sc.close();
    }
}
