import java.util.Scanner;
public class Day09 {

// Class 1: Student..

    static class Student{
    String name;
    int age;
    double marks;
    void displayStudent(){

        System.out.println("Student Name : "+name);
        System.out.println("Student Age : "+age);
        System.out.println("Student Marks : "+marks);
    }
}

// Class 2: Car..

    static class Car{
    String brand;
    String color;
    void displayCar(){

        System.out.println("Car Brand : "+brand);
        System.out.println("Car Color : "+color);
    }
    void startCar(){

        System.out.println("Car is starting...");
    }
    }

// Class 3: Employee..

    static class Employee{
    String name;
    int age;
    double salary;
    void displayEmployee(){

        System.out.println("Employee Name : "+name);
        System.out.println("Employee Age :" +age);
        System.out.println("Employee Salary :" +salary);
    }
    }

// Main method.......

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

//     Program 1: Class And Object....

        System.out.println("PROGRAM 1: CLASS AND OBJECT");
        Student student1=new Student();

        student1.name="Vandana";
        student1.age=20;
        student1.marks=80.5;
        student1.displayStudent();

//     Program 2: Student Detils Using User Input....

        System.out.println("\nPROGRAM 2: STUDENT DETAILS");
        Student student2=new Student();

        System.out.println("Enter student name :");
        student2.name=sc.nextLine();

        System.out.println("Enter student age :");
        student2.age=sc.nextInt();

        System.out.println("Enter student marks :");
        student2.marks=sc.nextDouble();

        System.out.println("\nStudent Details:");
        student2.displayStudent();

    // Program 3: Car Class And Methods....

        System.out.println("\nPROGRAM 3: CAR DETAILS");
        Car car1=new Car();

        System.out.println("Enter car brand :");
        car1.brand=sc.next();

        System.out.println("Enter car color :");
        car1.color=sc.next();

        car1.displayCar();
        car1.startCar();

    // Program 4: Multiple Employee Objects....

        System.out.println("\nPROGRAM 4: EMPLOYEE DETAILS");
        Employee employee1=new Employee();
        Employee employee2=new Employee();

        employee1.name= "Rahul";
        employee1.age= 28;
        employee1.salary=25000;

        employee2.name="Ankit";
        employee2.age=30;
        employee2.salary=35000;

        System.out.println("\nEmployee 1 :");
        employee1.displayEmployee();

        System.out.println("\nEmployee 2 :");
        employee2.displayEmployee();

        sc.close();
    }

}
