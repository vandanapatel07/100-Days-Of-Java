import java.util.*;

public class Day48 {

    // Generic class with one type
    static class Box<T> {

        T value;

        Box(T value) {
            this.value = value;
        }

        void display() {
            System.out.println("Value: " + value);
        }
    }

    // Generic class with two types
    static class Pair<K, V> {

        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        void display() {
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }
    }

    // Generic method
    static <T> void displayArray(T[] array) {

        for (T item : array) {
            System.out.println(item);
        }
    }

    // Program 1: Generic Integer Box
    static void integerBox() {

        Box<Integer> box = new Box<>(100);

        System.out.println("Integer Box:");
        box.display();
    }

    // Program 2: Generic String Box
    static void stringBox() {

        Box<String> box = new Box<>("Java Programming");

        System.out.println("String Box:");
        box.display();
    }

    // Program 3: Generic Pair
    static void genericPair() {

        Pair<Integer, String> student =
                new Pair<>(101, "Rahul");

        System.out.println("Student Details:");
        student.display();
    }

    // Program 4: Generic Method
    static void genericMethod() {

        Integer[] numbers = {10, 20, 30, 40};

        String[] names = {
                "Rahul",
                "Priya",
                "Aman",
                "Neha"
        };

        System.out.println("Numbers:");
        displayArray(numbers);

        System.out.println("\nNames:");
        displayArray(names);
    }

    public static void main(String[] args) {

        System.out.println("========== PROGRAM 1 ==========");
        integerBox();

        System.out.println("\n========== PROGRAM 2 ==========");
        stringBox();

        System.out.println("\n========== PROGRAM 3 ==========");
        genericPair();

        System.out.println("\n========== PROGRAM 4 ==========");
        genericMethod();
    }
}
