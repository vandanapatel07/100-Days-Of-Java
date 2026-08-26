public class Day36 {

    // ================= Program 1 =================
    // Creating Thread using Thread Class

    static class MyThread extends Thread {

        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 : " + i);
            }
        }
    }


    // ================= Program 2 =================
    // Creating Thread using Runnable

    static class MyRunnable implements Runnable {

        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Runnable Thread : " + i);
            }
        }
    }


    // ================= Program 3 =================
    // Two Threads Running Together

    static class NumberThread extends Thread {

        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Number Thread : " + i);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
        }
    }

    static class MessageThread extends Thread {

        @Override
        public void run() {

            for (int i = 1; i <= 5; i++) {
                System.out.println("Message Thread : Hello");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
        }
    }


    // ================= Program 4 =================
    // User Input with Thread

    static class CountThread extends Thread {

        private int limit;

        CountThread(int limit) {
            this.limit = limit;
        }

        @Override
        public void run() {

            for (int i = 1; i <= limit; i++) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " : " + i
                );
            }
        }
    }


    // ================= Main Method =================

    public static void main(String[] args) {

        // ---------- Program 1 ----------

        System.out.println("========== PROGRAM 1 ==========");

        MyThread thread1 = new MyThread();

        thread1.start();


        // ---------- Program 2 ----------

        System.out.println("\n========== PROGRAM 2 ==========");

        MyRunnable runnable = new MyRunnable();

        Thread thread2 = new Thread(runnable);

        thread2.start();


        // ---------- Program 3 ----------

        System.out.println("\n========== PROGRAM 3 ==========");

        NumberThread numberThread = new NumberThread();
        MessageThread messageThread = new MessageThread();

        numberThread.start();
        messageThread.start();


        // ---------- Program 4 ----------

        System.out.println("\n========== PROGRAM 4 ==========");

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter counting limit : ");
        int limit = sc.nextInt();

        CountThread countThread = new CountThread(limit);

        countThread.setName("User Thread");

        countThread.start();

        sc.close();
    }
}

