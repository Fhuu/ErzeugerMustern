package Singleton;

import javax.tools.Tool;

public class SingletonThreadTest extends Thread {
    public String threadName;
    
    public SingletonThreadTest(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(threadName + " - call 1");
            ToolTipManager.getInstance().operation();
            Thread.sleep(500);
            System.out.println(threadName + " - call 2");
            ToolTipManager.getInstance().operation();
            Thread.sleep(500);
            System.out.println(threadName + " - call 3");
            ToolTipManager.getInstance().operation();
        } catch (InterruptedException ie) {
            System.out.println(threadName + " - interupted.");
        }

    }
}
