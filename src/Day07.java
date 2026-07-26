import javax.swing.text.Element;
import java.util.Scanner;
public class Day07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Program 1: Input And Print Array Elements...

        System.out.println("PROGRAM 1 : INPUT AND PRINT ARRAY");
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements :");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array elements are :");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + " ");
        }

        //-------------------------------------------------------------

        // Program 2: Sum And Average Of Array...

        System.out.println("\n\nPROGRAM 2: SUM AND AVERAGE");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + numbers[i];
        }
        double average = (double) sum / size;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        //--------------------------------------------------------------

        //Program 3: Largest And Smallest Elements...

        System.out.println("\nPROGRAM 3: LARGEST AND SMALLEST");
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 0; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest Element = " + largest);
        System.out.println("Smallest Element = " + smallest);


   //--------------------------------------------------------------------


        //Program 4: Search An Element...

        System.out.println("\nPROGRAM 4: SEARCH AN ElEMENT");
        System.out.println("Enter element to search : ");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == search){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Element found in the array.");
        }
        else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}
