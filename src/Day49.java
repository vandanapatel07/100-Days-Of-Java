public class Day49 {

    // Enum 1: Days
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Enum 2: Traffic Signal
    enum TrafficSignal {
        RED, YELLOW, GREEN
    }

    // Enum 3: Order Status
    enum OrderStatus {
        PLACED, CONFIRMED, SHIPPED, DELIVERED, CANCELLED
    }

    // Enum 4: Student Grade
    enum Grade {
        A, B, C, D, F
    }


    // Program 1: Days of Week
    static void dayExample() {

        Day today = Day.FRIDAY;

        System.out.println("Today: " + today);

        if (today == Day.FRIDAY) {
            System.out.println("Weekend is near!");
        }
    }


    // Program 2: Traffic Signal
    static void trafficExample() {

        TrafficSignal signal = TrafficSignal.RED;

        System.out.println("Traffic Signal: " + signal);

        switch (signal) {

            case RED:
                System.out.println("Stop");
                break;

            case YELLOW:
                System.out.println("Get Ready");
                break;

            case GREEN:
                System.out.println("Go");
                break;
        }
    }


    // Program 3: Order Status
    static void orderExample() {

        OrderStatus status = OrderStatus.SHIPPED;

        System.out.println("Order Status: " + status);

        switch (status) {

            case PLACED:
                System.out.println("Order has been placed.");
                break;

            case CONFIRMED:
                System.out.println("Order has been confirmed.");
                break;

            case SHIPPED:
                System.out.println("Order has been shipped.");
                break;

            case DELIVERED:
                System.out.println("Order has been delivered.");
                break;

            case CANCELLED:
                System.out.println("Order has been cancelled.");
                break;
        }
    }


    // Program 4: Student Grade
    static void gradeExample() {

        Grade grade = Grade.A;

        System.out.println("Student Grade: " + grade);

        switch (grade) {

            case A:
                System.out.println("Excellent Performance");
                break;

            case B:
                System.out.println("Very Good Performance");
                break;

            case C:
                System.out.println("Good Performance");
                break;

            case D:
                System.out.println("Needs Improvement");
                break;

            case F:
                System.out.println("Fail");
                break;
        }
    }


    public static void main(String[] args) {

        System.out.println("========== PROGRAM 1 ==========");
        dayExample();

        System.out.println("\n========== PROGRAM 2 ==========");
        trafficExample();

        System.out.println("\n========== PROGRAM 3 ==========");
        orderExample();

        System.out.println("\n========== PROGRAM 4 ==========");
        gradeExample();
    }
}
