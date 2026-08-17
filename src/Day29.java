import java.util.HashMap;
import java.util.Scanner;

public class Day29 {

    // --------------- Program 1 --------------
    // Add Key-Value Pairs

    static void addElements() {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Aman");
        students.put(102, "Riya");
        students.put(103, "Rahul");
        students.put(104, "Priya");

        System.out.println("Students : " + students);
    }


    // -------------- Program 2 ----------------
    // Get and Update Value

    static void updateElement() {

        HashMap<String, String> countries = new HashMap<>();

        countries.put("India", "New Delhi");
        countries.put("Japan", "Tokyo");
        countries.put("France", "Paris");

        System.out.println("Before Update : " + countries);

        countries.put("India", "Delhi");

        System.out.println("After Update : " + countries);
        System.out.println("Capital of Japan : " + countries.get("Japan"));
    }


    // --------------- Program 3 --------------
    // Search and Remove

    static void searchAndRemove() {

        HashMap<Integer, String> products = new HashMap<>();

        products.put(1, "Laptop");
        products.put(2, "Mobile");
        products.put(3, "Headphones");
        products.put(4, "Keyboard");

        System.out.println("Products : " + products);

        if (products.containsKey(3)) {
            System.out.println("Product with ID 3 is available.");
        }

        products.remove(4);

        System.out.println("After Removing : " + products);
    }


    // ------------------ Program 4 ------------------
    // User Input HashMap

    static void userInputMap(Scanner sc) {

        HashMap<Integer, String> students = new HashMap<>();

        System.out.print("How many students do you want to add? ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Student ID : ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();

            students.put(id, name);
        }

        System.out.println("Student Records : " + students);

        System.out.print("Enter Student ID to Search : ");
        int searchId = sc.nextInt();

        if (students.containsKey(searchId)) {
            System.out.println("Student Name : " + students.get(searchId));
        } else {
            System.out.println("Student ID not found.");
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

        updateElement();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        searchAndRemove();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        userInputMap(sc);


        sc.close();
    }
}
