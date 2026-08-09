import java.util.Scanner;

    public class Day21 {

        // ----------------- Program 1 -------------

        static class Student {

            private String name;
            private int age;

            public void setName(String name) {
                this.name = name;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        // ---------------- Program 2 ---------------

        static class BankAccount {

            private double balance;

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public double getBalance() {
                return balance;
            }

            public void deposit(double amount) {
                balance = balance + amount;
            }
        }

        // ---------------- Program 3 ---------------

        static class Product {

            private String productName;
            private double price;

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public void setPrice(double price) {
                if (price > 0) {
                    this.price = price;
                } else {
                    System.out.println("Invalid Price");
                }
            }

            public String getProductName() {
                return productName;
            }

            public double getPrice() {
                return price;
            }
        }

        // ----------------- Program 4 ----------------

        static class Employee {

            private String name;
            private double salary;

            public void setName(String name) {
                this.name = name;
            }

            public void setSalary(double salary) {
                if (salary >= 10000) {
                    this.salary = salary;
                } else {
                    System.out.println("Salary must be at least ₹10000");
                }
            }

            public void display() {
                System.out.println("Employee Name : " + name);
                System.out.println("Employee Salary : ₹" + salary);
            }
        }

        // ================= Main Method =================

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ---------- Program 1 ----------

            System.out.println("========== PROGRAM 1 ==========");

            Student s = new Student();

            System.out.print("Enter Student Name : ");
            s.setName(sc.nextLine());

            System.out.print("Enter Age : ");
            s.setAge(sc.nextInt());

            System.out.println("Student Name : " + s.getName());
            System.out.println("Student Age : " + s.getAge());


            // ---------- Program 2 ----------

            System.out.println("\n========== PROGRAM 2 ==========");

            BankAccount account = new BankAccount();

            System.out.print("Enter Initial Balance : ");
            double balance = sc.nextDouble();

            account.setBalance(balance);

            System.out.print("Enter Deposit Amount : ");
            double amount = sc.nextDouble();

            account.deposit(amount);

            System.out.println("Final Balance : ₹" + account.getBalance());


            // ---------- Program 3 ----------

            System.out.println("\n========== PROGRAM 3 ==========");

            sc.nextLine();

            Product product = new Product();

            System.out.print("Enter Product Name : ");
            product.setProductName(sc.nextLine());

            System.out.print("Enter Product Price : ");
            product.setPrice(sc.nextDouble());

            System.out.println("Product Name : " + product.getProductName());
            System.out.println("Product Price : ₹" + product.getPrice());


            // ---------- Program 4 ----------

            System.out.println("\n========== PROGRAM 4 ==========");

            sc.nextLine();

            Employee employee = new Employee();

            System.out.print("Enter Employee Name : ");
            employee.setName(sc.nextLine());

            System.out.print("Enter Employee Salary : ");
            employee.setSalary(sc.nextDouble());

            employee.display();

            sc.close();
        }
    }

