import java.util.Scanner;
public class Day14 {

//---------------- Program 1 --------------------

        static class Animal {
            void eat() {
                System.out.println("Animal is Eating...");
            }
        }

        static class Dog extends Animal {
            void bark() {
                System.out.println("Dog is Barking...");
            }
        }

        static class Puppy extends Dog {
            void weep() {
                System.out.println("Puppy is Weeping...");
            }
        }

//---------------- Program 2 ---------------------------

        static class Person {
            String name;

            void inputName(String name) {
                this.name = name;
            }
        }

        static class Student extends Person {
            int roll;

            void inputRoll(int roll) {
                this.roll = roll;
            }
        }

        static class Result extends Student {
            int marks;

            void inputMarks(int marks) {
                this.marks = marks;
            }

            void display() {
                System.out.println("Name : " + name);
                System.out.println("Roll No : " + roll);
                System.out.println("Marks : " + marks);
            }
        }

//----------------Program 3-------------------------

        static class Employee {
            int salary = 30000;
        }

        static class Developer extends Employee {
            int bonus = 10000;
        }

        static class Manager extends Developer {

            void totalSalary() {
                System.out.println("Salary : " + salary);
                System.out.println("Bonus : " + bonus);
                System.out.println("Total Salary : " + (salary + bonus));
            }
        }

 //------------------- Program 4 ---------------------

        static class Vehicle {
            String company;

            void setCompany(String company) {
                this.company = company;
            }
        }

        static class Car extends Vehicle {
            String model;

            void setModel(String model) {
                this.model = model;
            }
        }

        static class SportsCar extends Car {

            void display() {
                System.out.println("Company : " + company);
                System.out.println("Model : " + model);
            }
        }

//-------------------  Main Method -------------------------

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

        // Program 1.......


            System.out.println("========== PROGRAM 1 ==========");

            Puppy p = new Puppy();
            p.eat();
            p.bark();
            p.weep();

//------------------------------------------------

        // Program 2........


            System.out.println("\n========== PROGRAM 2 ==========");

            Result r = new Result();

            System.out.print("Enter Name : ");
            r.inputName(sc.nextLine());

            System.out.print("Enter Roll No : ");
            r.inputRoll(sc.nextInt());

            System.out.print("Enter Marks : ");
            r.inputMarks(sc.nextInt());

            r.display();

//------------------------------------------------------------

        // Program 3.........


            System.out.println("\n========== PROGRAM 3 ==========");

            Manager m = new Manager();
            m.totalSalary();

//---------------------------------------------------------------

        //  Program 4........


            System.out.println("\n========== PROGRAM 4 ==========");

            sc.nextLine();

            SportsCar s = new SportsCar();

            System.out.print("Enter Company : ");
            s.setCompany(sc.nextLine());

            System.out.print("Enter Model : ");
            s.setModel(sc.nextLine());

            s.display();

            sc.close();
        }
    }

