import java.util.ArrayList;
import java.util.Scanner;

public class Day26 {

    // ------------- Program 1 -----------------
    // Add Elements

    static void addElements() {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println("Fruits : " + fruits);
    }


    // -------------- Program 2 ------------------
    // Remove Element

    static void removeElement() {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Lucknow");

        System.out.println("Before Removing : " + cities);

        cities.remove("Mumbai");

        System.out.println("After Removing : " + cities);
    }


    // ---------------- Program 3 ---------------
    // Search Element

    static void searchElement(String name) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Riya");
        students.add("Vandana");
        students.add("Rahul");

        if (students.contains(name)) {
            System.out.println(name + " is present in the list.");
        } else {
            System.out.println(name + " is not present in the list.");
        }
    }


    // ---------------- Program 4 --------------
    // User Input ArrayList

    static void userInputList(Scanner sc) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("How many numbers do you want to add? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Number " + (i + 1) + " : ");
            int number = sc.nextInt();

            numbers.add(number);
        }

        System.out.println("Numbers : " + numbers);
        System.out.println("Total Elements : " + numbers.size());
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

        System.out.print("Enter Student Name to Search : ");
        String name = sc.nextLine();

        searchElement(name);


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        userInputList(sc);


        sc.close();
    }
}
