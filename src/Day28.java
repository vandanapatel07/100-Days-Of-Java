import java.util.HashSet;
import java.util.Scanner;

public class Day28 {

    // -------------- Program 1 ---------------
    // Add Elements and Remove Duplicates

    static void addElements() {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("Fruits : " + fruits);
        System.out.println("Size : " + fruits.size());
    }


    // -------------- Program 2 --------------
    // Remove Element

    static void removeElement() {

        HashSet<String> subjects = new HashSet<>();

        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DBMS");
        subjects.add("OS");

        System.out.println("Before Removing : " + subjects);

        subjects.remove("OS");

        System.out.println("After Removing : " + subjects);
    }


    // ---------------- Program 3 -----------------
    // Search Element

    static void searchElement(String city) {

        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Mumbai");
        cities.add("Agra");

        if (cities.contains(city)) {
            System.out.println(city + " is present in the HashSet.");
        } else {
            System.out.println(city + " is not present in the HashSet.");
        }
    }


    // ------------------ Program 4 ---------------
    // User Input HashSet

    static void userInputSet(Scanner sc) {

        HashSet<Integer> numbers = new HashSet<>();

        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Number " + (i + 1) + " : ");
            int number = sc.nextInt();

            numbers.add(number);
        }

        System.out.println("HashSet : " + numbers);
        System.out.println("Unique Elements : " + numbers.size());
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        addElements();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        removeElement();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        System.out.print("Enter City to Search : ");
        String city = sc.nextLine();

        searchElement(city);


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        userInputSet(sc);


        sc.close();
    }
}
