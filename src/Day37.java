import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day37 {

    // ================= Program 1 =================
    // Create a File

    static void createFile() {

        try {

            File file = new File("student.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            System.out.println("File Name : " + file.getName());

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    // ================= Program 2 =================
    // Write Data into File

    static void writeFile() {

        try {

            FileWriter writer = new FileWriter("student.txt");

            writer.write("Student Management System\n");
            writer.write("Name: Vandana\n");
            writer.write("Course: B.Tech CSE\n");
            writer.write("Year: 3rd Year\n");

            writer.close();

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    // ================= Program 3 =================
    // Read Data from File

    static void readFile() {

        try {

            FileReader reader = new FileReader("student.txt");

            int character;

            System.out.println("File Content:");

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    // ================= Program 4 =================
    // Append User Input to File

    static void appendFile(Scanner sc) {

        try {

            FileWriter writer =
                    new FileWriter("student.txt", true);

            System.out.print("Enter a message to add to file: ");
            String message = sc.nextLine();

            writer.write(message + "\n");

            writer.close();

            System.out.println("Data appended successfully.");

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        createFile();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        writeFile();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        readFile();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        appendFile(sc);


        sc.close();
    }
}
