import java.util.*;
import java.util.stream.Collectors;

public class Day33 {

    // ================= Program 1 =================
    // Filter Even Numbers

    static void filterEvenNumbers() {

        List<Integer> numbers = Arrays.asList(
                10, 15, 22, 31, 40, 55, 60
        );

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original List : " + numbers);
        System.out.println("Even Numbers : " + evenNumbers);
    }


    // ================= Program 2 =================
    // Convert Names to Uppercase

    static void convertToUppercase() {

        List<String> names = Arrays.asList(
                "aman", "riya", "rahul", "priya"
        );

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Original Names : " + names);
        System.out.println("Uppercase Names : " + upperNames);
    }


    // ================= Program 3 =================
    // Find Numbers Greater Than 50

    static void findGreaterNumbers() {

        List<Integer> numbers = Arrays.asList(
                25, 65, 40, 80, 35, 90, 55
        );

        List<Integer> result = numbers.stream()
                .filter(n -> n > 50)
                .collect(Collectors.toList());

        System.out.println("Numbers Greater Than 50 : " + result);
    }


    // ================= Program 4 =================
    // User Input + Stream

    static void userInputStream(Scanner sc) {

        List<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Number " + (i + 1) + " : ");
            numbers.add(sc.nextInt());
        }

        List<Integer> squaredNumbers = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        System.out.println("Original Numbers : " + numbers);
        System.out.println("Squared Numbers : " + squaredNumbers);
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        filterEvenNumbers();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        convertToUppercase();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        findGreaterNumbers();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        userInputStream(sc);


        sc.close();
    }
}
