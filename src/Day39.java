import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Day39 {

    // ================= Program 1 =================
    // Current Date

    static void currentDate() {

        LocalDate today = LocalDate.now();

        System.out.println("Today's Date : " + today);
        System.out.println("Year : " + today.getYear());
        System.out.println("Month : " + today.getMonth());
        System.out.println("Day : " + today.getDayOfMonth());
    }


    // ================= Program 2 =================
    // Current Time

    static void currentTime() {

        LocalTime time = LocalTime.now();

        System.out.println("Current Time : " + time);
        System.out.println("Hour : " + time.getHour());
        System.out.println("Minute : " + time.getMinute());
        System.out.println("Second : " + time.getSecond());
    }


    // ================= Program 3 =================
    // Date Calculation

    static void dateCalculation() {

        LocalDate today = LocalDate.now();

        LocalDate afterTenDays = today.plusDays(10);
        LocalDate beforeOneMonth = today.minusMonths(1);

        System.out.println("Today's Date : " + today);
        System.out.println("After 10 Days : " + afterTenDays);
        System.out.println("One Month Before : " + beforeOneMonth);
    }


    // ================= Program 4 =================
    // User Input + Calculate Age

    static void calculateAge(Scanner sc) {

        System.out.print("Enter Birth Year : ");
        int year = sc.nextInt();

        System.out.print("Enter Birth Month : ");
        int month = sc.nextInt();

        System.out.print("Enter Birth Day : ");
        int day = sc.nextInt();

        LocalDate birthDate =
                LocalDate.of(year, month, day);

        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);

        System.out.println("Birth Date : " + birthDate);
        System.out.println("Age : "
                + age.getYears() + " Years, "
                + age.getMonths() + " Months, "
                + age.getDays() + " Days");
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        currentDate();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        currentTime();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        dateCalculation();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        calculateAge(sc);


        sc.close();
    }
}
