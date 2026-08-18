import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Day30 {

    // ------------ Program 1 -----------------
    // Iterator with ArrayList

    static void arrayListIterator() {

        ArrayList<String> subjects = new ArrayList<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");
        subjects.add("OS");

        Iterator<String> iterator = subjects.iterator();

        System.out.println("Subjects:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    // ---------------- Program 2 -------------
    // Iterator with HashSet

    static void hashSetIterator() {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer> iterator = numbers.iterator();

        System.out.println("Numbers:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    // --------------- Program 3 ----------------
    // Remove Element using Iterator

    static void removeUsingIterator() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {

            int number = iterator.next();

            if (number % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println("After Removing Odd Numbers : " + numbers);
    }


    // ------------- Program 4 ---------------
    // User Input + Iterator

    static void userInputIterator(Scanner sc) {

        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names do you want to add? ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Name " + (i + 1) + " : ");
            String name = sc.nextLine();

            names.add(name);
        }

        System.out.println("\nNames using Iterator:");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        arrayListIterator();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        hashSetIterator();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        removeUsingIterator();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        userInputIterator(sc);


        sc.close();
    }
}