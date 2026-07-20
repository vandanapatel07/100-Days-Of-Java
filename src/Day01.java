import java.util.Scanner;
public class Day01 {
    public static void main(String[] args) {
        //Print Welcome Message
        System.out.println("Hello World!");
        System.out.println("Welcome To My 100 Days Of Java!");

        //Create Scanner Object
        Scanner sc=new Scanner(System.in);

        //Take User Input
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Enter you age: ");
        int age=sc.nextInt();

        //Display Output
        System.out.println("\n------User Details------");
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("\nThis is my first day of 100-Days-Of-Java");

        sc.close();

    }

}
