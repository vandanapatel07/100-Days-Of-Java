import java.util.Scanner;
public class Day05 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        // Program 1 : Print Numbers From 1 to N
        // Using For Loop...

        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Numbers from 1 to " +n+ ":");
        for (int i = 1; i <=n ; i++) {
            System.out.println(i);

        }
     //-----------------------------------------------------------------

     //Program 2 : Sum Of Numbers from 1 to N
     //Using While Loop...

        System.out.println("Enter a number :");
        int number=sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= number){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = "+sum);


    //---------------------------------------------------------------------

    //Program 3 : Multiplication Table
    //Using For Loop....

        System.out.println("\n Enter a number for multiplication table :");
        int table=sc.nextInt();
        for(int j = 1; j <= 10; j++){
            System.out.println(table + " * " + j + " = "+(table * j));
        }


    //---------------------------------------------------------------------

    //Program 4 : Factorial Of a Number
    //Using Do-While Loop....

        System.out.println("\nEnter a number to find factorial : ");
        int factNumber=sc.nextInt();
        int factorial = 1;
        int k = 1;
        do{
            factorial = factorial+k;
            k++;
        }while (k >= factNumber);
        System.out.println("Factorial = "+ factorial);

        sc.close();

    }
}
