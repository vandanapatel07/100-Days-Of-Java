import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Day35 {

    // ================= Program 1 =================
    // Predicate

    static void predicateExample(int number) {

        Predicate<Integer> isPositive =
                n -> n > 0;

        if (isPositive.test(number)) {
            System.out.println(number + " is Positive.");
        } else {
            System.out.println(number + " is not Positive.");
        }
    }


    // ================= Program 2 =================
    // Function

    static void functionExample(String name) {

        Function<String, Integer> findLength =
                text -> text.length();

        System.out.println("Name : " + name);
        System.out.println("Length : " + findLength.apply(name));
    }


    // ================= Program 3 =================
    // Consumer

    static void consumerExample(String message) {

        Consumer<String> displayMessage =
                text -> System.out.println("Message : " + text);

        displayMessage.accept(message);
    }


    // ================= Program 4 =================
    // Supplier

    static void supplierExample() {

        Supplier<String> welcomeMessage =
                () -> "Welcome to Java Functional Interfaces!";

        System.out.println(supplierExampleText(welcomeMessage));
    }

    static String supplierExampleText(Supplier<String> supplier) {
        return supplier.get();
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        predicateExample(number);


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        sc.nextLine();

        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        functionExample(name);


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        System.out.print("Enter a Message : ");
        String message = sc.nextLine();

        consumerExample(message);


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        supplierExample();


        sc.close();
    }
}
