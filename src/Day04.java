import java.util.Scanner;
public class Day04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

        //  Program 1 : Pass or Fail


        if (marks >= 40) {
            System.out.println("Student is pass");
        } else {
            System.out.println("Student is fail");
        }
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Program 2 : Positive Or Negative Numbers...


        System.out.println("Enter a number : ");
        int number=sc.nextInt();

        if (number > 0){
            System.out.println("Number is Positive");
        } else if (number < 0) {
            System.out.println("Nummber is Negative");
        }else {
            System.out.println("Number is Zero");
    }


        // Program 3 : Even Or Odd Numbers...


        System.out.println("Enter a number :");
        int num=sc.nextInt();
        if (num % 2 == 0){
            System.out.println("Number is Even");
        }else {
            System.out.println("Number is Odd");
        }


        //Program 4 : Largest Of Three Numbers...


        System.out.println("Enter First Number :");
        int a=sc.nextInt();

        System.out.println("Enter Second Number :");
        int b=sc.nextInt();

        System.out.println("Enter Third Number :");
        int c=sc.nextInt();

        if (a >= b && a >= c){
            System.out.println("Largest Number Is :"+a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest Number Is :"+b);
        }else {
            System.out.println("Largest Number Is :"+c);
        }
        sc.close();

    }
}




