package A;

import static A.ThreadColor.ANSI_PURPLE;
import static A.ThreadColor.ANSI_GREEN;

public class Driver {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread Thread1 = new MyThread();
        Thread1.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}
