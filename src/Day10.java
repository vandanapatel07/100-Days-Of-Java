import java.util.Scanner;
public class Day10 {

    // Class 1: Student

        static class Student {

            String name;
            int age;

            // Default Constructor
            Student() {
                name = "Vandana";
                age = 20;
            }

            void displayStudent() {
                System.out.println("Student Name: " + name);
                System.out.println("Student Age: " + age);
            }
        }


 //---------------------------------------------------
        // Class 2: Car

        static class Car {

            String brand;
            String color;

            // Parameterized Constructor
            Car(String brand, String color) {
                this.brand = brand;
                this.color = color;
            }

            void displayCar() {
                System.out.println("Car Brand: " + brand);
                System.out.println("Car Color: " + color);
            }
        }

//------------------------------------------------------------
        // Class 3: Employee


        static class Employee {

            String name;
            int age;
            double salary;

            // Parameterized Constructor
            Employee(String name, int age, double salary) {
                this.name = name;
                this.age = age;
                this.salary = salary;
            }

            void displayEmployee() {
                System.out.println("Employee Name: " + name);
                System.out.println("Employee Age: " + age);
                System.out.println("Employee Salary: " + salary);
            }
        }


//--------------------------------------------------------------
        // Class 4: Product

        static class Product {

            String productName;
            double price;

            // Constructor with User Input
            Product(String productName, double price) {
                this.productName = productName;
                this.price = price;
            }

            void displayProduct() {
                System.out.println("Product Name: " + productName);
                System.out.println("Product Price: ₹" + price);
            }
        }

//----------------------------------------------------------------
    // Main Method


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);


            // Program 1: Default Constructor


            System.out.println("PROGRAM 1: DEFAULT CONSTRUCTOR");

            Student student1 = new Student();

            student1.displayStudent();


//-----------------------------------------------------------------

            // Program 2: Parameterized Constructor


            System.out.println("\nPROGRAM 2: PARAMETERIZED CONSTRUCTOR");

            Car car1 = new Car("Toyota", "White");

            car1.displayCar();


//-----------------------------------------------------------------

            // Program 3: Constructor with User Input


            System.out.println("\nPROGRAM 3: USER INPUT WITH CONSTRUCTOR");

            System.out.print("Enter employee name: ");
            String employeeName = sc.nextLine();

            System.out.print("Enter employee age: ");
            int employeeAge = sc.nextInt();

            System.out.print("Enter employee salary: ");
            double employeeSalary = sc.nextDouble();

            Employee employee1 =
                    new Employee(employeeName, employeeAge, employeeSalary);

            System.out.println("\nEmployee Details:");

            employee1.displayEmployee();


//----------------------------------------------------------------------

            // Program 4: Multiple Objects using Constructor


            System.out.println("\nPROGRAM 4: MULTIPLE OBJECTS");

            Product product1 = new Product("Laptop", 55000);
            Product product2 = new Product("Mobile", 25000);

            System.out.println("\nProduct 1:");
            product1.displayProduct();

            System.out.println("\nProduct 2:");
            product2.displayProduct();


            sc.close();
        }
    }

