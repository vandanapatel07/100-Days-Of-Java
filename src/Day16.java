import java.util.Scanner;

    public class Day16 {

//------------------ Program 1 -------------------

        interface Camera {
            void clickPhoto();
        }

        interface MusicPlayer {
            void playMusic();
        }

        static class SmartPhone implements Camera, MusicPlayer {

            public void clickPhoto() {
                System.out.println("Photo Captured Successfully.");
            }

            public void playMusic() {
                System.out.println("Music is Playing...");
            }
        }

//-------------------- Program 2 -------------------------

        interface PersonalDetails {
            void inputDetails(String name, int age);
        }

        interface CollegeDetails {
            void inputCourse(String course);
        }

        static class Student implements PersonalDetails, CollegeDetails {

            String name;
            int age;
            String course;

            public void inputDetails(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void inputCourse(String course) {
                this.course = course;
            }

            void display() {
                System.out.println("\n----- Student Details -----");
                System.out.println("Name   : " + name);
                System.out.println("Age    : " + age);
                System.out.println("Course : " + course);
            }
        }

//-------------------- Main Method ---------------------

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

//-------------------- Program 1 ---------------------

            System.out.println("========== PROGRAM 1 ==========");

            SmartPhone phone = new SmartPhone();

            phone.clickPhoto();
            phone.playMusic();

//------------------- Program 2 -----------------------

            System.out.println("\n========== PROGRAM 2 ==========");

            Student s = new Student();

            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Age : ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Course : ");
            String course = sc.nextLine();

            s.inputDetails(name, age);
            s.inputCourse(course);

            s.display();

            sc.close();
        }
    }

