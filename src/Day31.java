import java.util.Scanner;

public class Day31 {

    // --------------- Program 1 ---------------
    // Generic Class

    static class Box<T> {

        private T value;

        void setValue(T value) {
            this.value = value;
        }

        T getValue() {
            return value;
        }
    }


    // --------------- Program 2 ---------------
    // Generic Method

    static <T> void display(T value) {

        System.out.println("Value : " + value);
        System.out.println("Data Type : " + value.getClass().getSimpleName());
    }


    // --------------- Program 3 ---------------
    // Generic Class with Two Types

    static class Student<T, U> {

        private T id;
        private U name;

        Student(T id, U name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("Student ID : " + id);
            System.out.println("Student Name : " + name);
        }
    }


    // --------------- Program 4 ---------------
    // User Input with Generic Class

    static class Data<T> {

        private T value;

        Data(T value) {
            this.value = value;
        }

        void display() {
            System.out.println("Entered Value : " + value);
            System.out.println("Data Type : "
                    + value.getClass().getSimpleName());
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        Box<Integer> numberBox = new Box<>();

        numberBox.setValue(100);

        System.out.println("Stored Value : "
                + numberBox.getValue());


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        display("Java Programming");
        display(500);
        display(25.5);


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        Student<Integer, String> student =
                new Student<>(101, "Vandana");

        student.display();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        Data<Integer> data = new Data<>(number);

        data.display();


        sc.close();
    }
}
