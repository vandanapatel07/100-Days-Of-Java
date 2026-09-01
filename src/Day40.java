import java.sql.*;
import java.util.Scanner;

public class Day40 {

    static final String URL = "jdbc:mysql://localhost:3306/java_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password";


    // ================= Program 1 =================
    // Database Connection

    static void connectDatabase() {

        try {
            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database Connected Successfully!");

            connection.close();

        } catch (SQLException e) {
            System.out.println("Connection Error : "
                    + e.getMessage());
        }
    }


    // ================= Program 2 =================
    // Insert Student

    static void insertStudent(Scanner sc) {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Student Marks : ");
        double marks = sc.nextDouble();

        String query =
                "INSERT INTO students VALUES (?, ?, ?)";

        try {
            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setDouble(3, marks);

            int rows = statement.executeUpdate();

            System.out.println(rows
                    + " student record inserted.");

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Insert Error : "
                    + e.getMessage());
        }
    }


    // ================= Program 3 =================
    // Display Students

    static void displayStudents() {

        String query = "SELECT * FROM students";

        try {
            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            Statement statement =
                    connection.createStatement();

            ResultSet result =
                    statement.executeQuery(query);

            System.out.println("\nStudent Records:");

            while (result.next()) {

                System.out.println(
                        "ID : " + result.getInt("id")
                                + " | Name : " + result.getString("name")
                                + " | Marks : " + result.getDouble("marks")
                );
            }

            result.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Display Error : "
                    + e.getMessage());
        }
    }


    // ================= Program 4 =================
    // Update Student Marks

    static void updateStudent(Scanner sc) {

        System.out.print("Enter Student ID : ");
        int id = sc.nextInt();

        System.out.print("Enter New Marks : ");
        double marks = sc.nextDouble();

        String query =
                "UPDATE students SET marks = ? WHERE id = ?";

        try {
            Connection connection =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement statement =
                    connection.prepareStatement(query);

            statement.setDouble(1, marks);
            statement.setInt(2, id);

            int rows = statement.executeUpdate();

            if (rows > 0) {
                System.out.println(
                        "Student marks updated successfully.");
            } else {
                System.out.println(
                        "Student ID not found.");
            }

            statement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Update Error : "
                    + e.getMessage());
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        connectDatabase();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        insertStudent(sc);


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        displayStudents();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        updateStudent(sc);


        sc.close();
    }
}
