import java.util.Scanner;

    public class Day24 {

        // ================= Custom Exception Classes =================

        static class InvalidAgeException extends Exception {

            InvalidAgeException(String message) {
                super(message);
            }
        }

        static class InsufficientBalanceException extends Exception {

            InsufficientBalanceException(String message) {
                super(message);
            }
        }

        static class InvalidMarksException extends Exception {

            InvalidMarksException(String message) {
                super(message);
            }
        }

        static class InvalidPasswordException extends Exception {

            InvalidPasswordException(String message) {
                super(message);
            }
        }


        // ---------------- Program 1 ----------------
        // Voting Age

        static void checkVotingAge(int age) throws InvalidAgeException {

            if (age < 18) {
                throw new InvalidAgeException(
                        "Age must be 18 or above for voting."
                );
            }

            System.out.println("You are eligible to vote.");
        }


        // ---------------- Program 2 ----------------
        // Bank Balance

        static void withdraw(double balance, double amount)
                throws InsufficientBalanceException {

            if (amount > balance) {
                throw new InsufficientBalanceException(
                        "Insufficient balance."
                );
            }

            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance = ₹" + (balance - amount));
        }


        // ----------------- Program 3 -----------------
        // Student Marks

        static void checkMarks(int marks)
                throws InvalidMarksException {

            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException(
                        "Marks must be between 0 and 100."
                );
            }

            System.out.println("Valid Marks = " + marks);
        }


        // ---------------- Program 4 ----------------
        // Password Validation

        static void checkPassword(String password)
                throws InvalidPasswordException {

            if (password.length() < 8) {
                throw new InvalidPasswordException(
                        "Password must contain at least 8 characters."
                );
            }

            System.out.println("Password accepted.");
        }


        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            System.out.print("Enter Your Age : ");
            int age = sc.nextInt();

            try {
                checkVotingAge(age);
            } catch (InvalidAgeException e) {
                System.out.println("Exception : " + e.getMessage());
            }


            // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            System.out.print("Enter Account Balance : ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount : ");
            double amount = sc.nextDouble();

            try {
                withdraw(balance, amount);
            } catch (InsufficientBalanceException e) {
                System.out.println("Exception : " + e.getMessage());
            }


            // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            System.out.print("Enter Student Marks : ");
            int marks = sc.nextInt();

            try {
                checkMarks(marks);
            } catch (InvalidMarksException e) {
                System.out.println("Exception : " + e.getMessage());
            }


            // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            sc.nextLine();

            System.out.print("Enter Password : ");
            String password = sc.nextLine();

            try {
                checkPassword(password);
            } catch (InvalidPasswordException e) {
                System.out.println("Exception : " + e.getMessage());
            }


            sc.close();
        }
    }

