import java.util.*;

public class Day44 {

    // Program 1: Shopping List using ArrayList
    static void shoppingList() {

        ArrayList<String> items = new ArrayList<>();

        items.add("Laptop");
        items.add("Mouse");
        items.add("Keyboard");
        items.add("Headphones");

        System.out.println("Shopping List:");
        System.out.println(items);

        // Remove an item
        items.remove("Mouse");

        // Add new item
        items.add("USB Cable");

        System.out.println("Updated Shopping List:");
        System.out.println(items);
    }


    // Program 2: Search and Update Student using ArrayList
    static void studentList(Scanner sc) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Rahul");
        students.add("Priya");
        students.add("Aman");
        students.add("Neha");

        System.out.print("Enter student name to search: ");
        String name = sc.nextLine();

        if (students.contains(name)) {

            System.out.println(name + " found in the list.");

            int index = students.indexOf(name);

            System.out.print("Enter new name: ");
            String newName = sc.nextLine();

            students.set(index, newName);

            System.out.println("Student name updated successfully.");

        } else {

            System.out.println("Student not found.");
        }

        System.out.println("Student List: " + students);
    }


    // Program 3: Ticket Queue using LinkedList
    static void ticketQueue() {

        LinkedList<String> queue = new LinkedList<>();

        queue.add("Customer 1");
        queue.add("Customer 2");
        queue.add("Customer 3");

        System.out.println("Ticket Queue:");
        System.out.println(queue);

        // First customer gets the ticket
        String served = queue.removeFirst();

        System.out.println("Ticket given to: " + served);

        System.out.println("Remaining Queue:");
        System.out.println(queue);
    }


    // Program 4: Browser History using LinkedList
    static void browserHistory() {

        LinkedList<String> history = new LinkedList<>();

        history.add("google.com");
        history.add("github.com");
        history.add("stackoverflow.com");
        history.add("youtube.com");

        System.out.println("Browser History:");
        System.out.println(history);

        // Remove last visited page
        String lastPage = history.removeLast();

        System.out.println("Closed Page: " + lastPage);

        System.out.println("Updated Browser History:");
        System.out.println(history);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== PROGRAM 1 ==========");
        shoppingList();

        System.out.println("\n========== PROGRAM 2 ==========");
        studentList(sc);

        System.out.println("\n========== PROGRAM 3 ==========");
        ticketQueue();

        System.out.println("\n========== PROGRAM 4 ==========");
        browserHistory();

        sc.close();
    }
}
