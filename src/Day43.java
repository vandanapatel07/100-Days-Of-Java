import java.util.*;

public class Day43 {

    // ================= PROGRAM 1 =================
    // ArrayList - Store and Display Items

    static void arrayListExample() {

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("Web Development");
        courses.add("Data Science");

        System.out.println("Courses: " + courses);
        System.out.println("Total Courses: " + courses.size());
    }


    // ================= PROGRAM 2 =================
    // LinkedList - Add First and Last

    static void linkedListExample() {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Study Java");
        tasks.add("Practice Coding");
        tasks.add("Complete Assignment");

        tasks.addFirst("Wake Up");
        tasks.addLast("Revise Topics");

        System.out.println("Daily Tasks:");
        System.out.println(tasks);
    }


    // ================= PROGRAM 3 =================
    // HashSet - Remove Duplicate Values

    static void hashSetExample() {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("Java");
        skills.add("HTML");
        skills.add("SQL");

        System.out.println("Skills:");
        System.out.println(skills);

        System.out.println("Unique Skills: "
                + skills.size());
    }


    // ================= PROGRAM 4 =================
    // HashMap - User Input

    static void hashMapExample(Scanner sc) {

        HashMap<Integer, String> books = new HashMap<>();

        System.out.print("How many books do you want to add? ");
        int n = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Book ID: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();

            books.put(id, name);
        }

        System.out.println("\nBook Records:");

        for (Map.Entry<Integer, String> entry
                : books.entrySet()) {

            System.out.println(
                    "ID: " + entry.getKey()
                            + " | Book: " + entry.getValue()
            );
        }
    }


    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- PROGRAM 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        arrayListExample();


        // ---------- PROGRAM 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        linkedListExample();


        // ---------- PROGRAM 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        hashSetExample();


        // ---------- PROGRAM 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        hashMapExample(sc);


        sc.close();
    }
}
