import java.util.Scanner;
public class Day04 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=sc.nextInt();

        //Check Pass or Fail
        //if-else statement

        if (marks >= 40){
            System.out.println("Student is pass");
        }
        else {
            System.out.println("Student is fail");
        }

        //Check Grade
        //else-if ladder

        if(marks >= 90){
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else{
            System.out.println("Grade: F");
        }
    }
}
