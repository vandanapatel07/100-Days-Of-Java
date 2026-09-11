import java.util.*;

public class Day45 {

    // Program 1: Contact Book using HashMap
    static void contactBook(Scanner sc) {

        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Rahul", "9876543210");
        contacts.put("Priya", "9123456780");
        contacts.put("Aman", "9988776655");

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (contacts.containsKey(name)) {
            System.out.println("Phone Number: " + contacts.get(name));
        } else {
            System.out.println("Contact not found.");
        }

        System.out.println("All Contacts:");
        System.out.println(contacts);
    }


    // Program 2: Product Price Manager using HashMap
    static void productManager(Scanner sc) {

        HashMap<String, Double> products = new HashMap<>();

        products.put("Laptop", 55000.0);
        products.put("Mobile", 25000.0);
        products.put("Headphones", 2000.0);

        System.out.println("Products and Prices:");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }

        System.out.print("Enter product name to update price: ");
        String product = sc.nextLine();

        if (products.containsKey(product)) {

            System.out.print("Enter new price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            products.put(product, price);

            System.out.println("Price updated successfully.");

        } else {
            System.out.println("Product not found.");
        }

        System.out.println("Updated Products:");
        System.out.println(products);
    }


    // Program 3: Unique Numbers using HashSet
    static void uniqueNumbers() {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Numbers entered:");
        System.out.println("10, 20, 10, 30, 20, 40");

        System.out.println("Unique Numbers:");
        System.out.println(numbers);

        System.out.println("Total Unique Numbers: " + numbers.size());
    }


    // Program 4: Unique Skills using HashSet
    static void uniqueSkills() {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("HTML");
        skills.add("Java");
        skills.add("CSS");
        skills.add("SQL");

        System.out.println("Skills:");
        System.out.println(skills);

        System.out.println("Total Unique Skills: " + skills.size());

        if (skills.contains("Java")) {
            System.out.println("Java skill is available.");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== PROGRAM 1 ==========");
        contactBook(sc);

        System.out.println("\n========== PROGRAM 2 ==========");
        productManager(sc);

        System.out.println("\n========== PROGRAM 3 ==========");
        uniqueNumbers();

        System.out.println("\n========== PROGRAM 4 ==========");
        uniqueSkills();

        sc.close();
    }
}
