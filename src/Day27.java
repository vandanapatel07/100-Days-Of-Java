import java.util.LinkedList;
import java.util.Scanner;

public class Day27 {

    // ------------- Program 1 --------------
    // Add Elements

    static void addElements() {

        LinkedList<String> subjects = new LinkedList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");
        subjects.add("Operating System");

        System.out.println("Subjects : " + subjects);
    }


    // ------------- Program 2 ---------------
    // Add First and Last

    static void addFirstLast() {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Lucknow");

        cities.addFirst("Noida");
        cities.addLast("Agra");

        System.out.println("Cities : " + cities);
    }


    // -------------- Program 3 ---------------
    // Remove Elements

    static void removeElements() {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Before Removing : " + numbers);

        numbers.removeFirst();
        numbers.removeLast();

        System.out.println("After Removing : " + numbers);
    }


    // --------------- Program 4 ----------------
    // User Input LinkedList

    static void userInputList(Scanner sc) {

        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Number " + (i + 1) + " : ");
            int number = sc.nextInt();

            numbers.add(number);
        }

        System.out.println("LinkedList : " + numbers);

        System.out.print("Enter number to search : ");
        int search = sc.nextInt();

        if (numbers.contains(search)) {
            System.out.println(search + " is present in the LinkedList.");
        } else {
            System.out.println(search + " is not present in the LinkedList.");
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        addElements();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        addFirstLast();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        removeElements();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        userInputList(sc);


        sc.close();
    }
}
