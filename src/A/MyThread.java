package A;

import static A.ThreadColor.ANSI_RED;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_RED+"Message from "+this.getName()+" .");
    }
}
