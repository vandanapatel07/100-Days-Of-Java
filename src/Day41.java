import java.sql.*;
import java.util.Scanner;

public class Day41 {

    static final String URL = "jdbc:mysql://localhost:3306/java_db";
    static final String USER = "root";
    static final String PASSWORD = "your_password";


    // ================= PROGRAM 1 =================
    // CREATE - Insert Employee

    static void insertEmployee(Scanner sc) {

        System.out.println("\n--- CREATE: Insert Employee ---");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        String query =
                "INSERT INTO employees VALUES (?, ?, ?)";

        try {
            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            int rows = ps.executeUpdate();

            System.out.println(rows +
                    " employee inserted successfully.");

            ps.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Insert Error: "
                    + e.getMessage());
        }
    }


    // ================= PROGRAM 2 =================
    // READ - Display Employees

    static void displayEmployees() {

        System.out.println("\n--- READ: Employee Records ---");

        String query = "SELECT * FROM employees";

        try {
            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            Statement st =
                    con.createStatement();

            ResultSet rs =
                    st.executeQuery(query);

            while (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("id")
                                + " | Name: " + rs.getString("name")
                                + " | Salary: " + rs.getDouble("salary")
                );
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Read Error: "
                    + e.getMessage());
        }
    }


    // ================= PROGRAM 3 =================
    // UPDATE - Update Employee Salary

    static void updateEmployee(Scanner sc) {

        System.out.println("\n--- UPDATE: Employee Salary ---");

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter New Salary: ");

        // Prevent InputMismatchException
        if (!sc.hasNextDouble()) {

            System.out.println(
                    "Please enter salary in numbers only.");

            sc.next();
            return;
        }

        double salary = sc.nextDouble();

        String query =
                "UPDATE employees SET salary = ? WHERE id = ?";

        try {
            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Employee salary updated successfully.");

            } else {

                System.out.println(
                        "Employee ID not found.");
            }

            ps.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Update Error: "
                    + e.getMessage());
        }
    }


    // ================= PROGRAM 4 =================
    // DELETE - Delete Employee

    static void deleteEmployee(Scanner sc) {

        System.out.println("\n--- DELETE: Employee ---");

        System.out.print("Enter Employee ID to Delete: ");
        int id = sc.nextInt();

        String query =
                "DELETE FROM employees WHERE id = ?";

        try {
            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Employee deleted successfully.");

            } else {

                System.out.println(
                        "Employee ID not found.");
            }

            ps.close();
            con.close();

        } catch (SQLException e) {

            System.out.println("Delete Error: "
                    + e.getMessage());
        }
    }


    // ================= MAIN METHOD =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- PROGRAM 1 ----------

        System.out.println("\n========== PROGRAM 1 ==========");

        insertEmployee(sc);


        // ---------- PROGRAM 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        displayEmployees();


        // ---------- PROGRAM 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        updateEmployee(sc);


        // ---------- PROGRAM 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        deleteEmployee(sc);


        sc.close();
    }
}
