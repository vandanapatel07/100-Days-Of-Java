import java.util.Scanner;
public class Day11 {

// Program 1: this keyword with Variables....

static class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }
}

//--------------------------------------------------------

//Program 2: this() Constructor Calling....

static class Employee{
    String name;
    int id;
    Employee(){
        this("Vandana",101);
        System.out.println("Default Constructor Called");
    }
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Id : "+id);
    }
}

//-------------------------------------------------------------

// Program 3: this Method Calling....

static class Car{
    void start(){
        System.out.println("car Started....");
        this.stop();
    }
    void stop(){
        System.out.println("Car Stopped...");
    }
}

//------------------------------------------------------------

//Program 4: User Input Using this....

static class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Person Name : "+name);
        System.out.println("Person Age : "+age);
    }
}

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

// Program 1...

        System.out.println("PROGRAM 1:");
    Student s1=new Student("Vandana",20);
    s1.display();

//------------------------------------------------------

// Program 2...

        System.out.println("\nPROGRAM 2:");
        Employee e1=new Employee();
        e1.display();

//------------------------------------------------------

// Program 3...

        System.out.println("\nPROGRAM 3:");
        Car c1=new Car();
        c1.start();

//------------------------------------------------------

// Program 4...

        System.out.println("\nPROGRAM 4:");
        System.out.println("Enter Name : ");
        String name=sc.nextLine();
        System.out.println("Enter Age : ");
        int age=sc.nextInt();

        Person p1=new Person(name,age);
        p1.display();

        sc.close();
    }
}

