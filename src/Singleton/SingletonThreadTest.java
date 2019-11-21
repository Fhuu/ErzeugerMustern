package Singleton;

public class SingletonThreadTest extends Thread {
    public String threadName;

    public SingletonThreadTest(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(threadName + " - call 1");
            System.out.println(ToolTipManager2.getInstance().operation());
            Thread.sleep(500);
            System.out.println(threadName + " - call 2");
            System.out.println(ToolTipManager2.getInstance().operation());
            Thread.sleep(500);
            System.out.println(threadName + " - call 3");
            System.out.println(ToolTipManager2.getInstance().operation());
        } catch (InterruptedException ie) {
            System.out.println(threadName + " - interupted.");
        }

    }
}
