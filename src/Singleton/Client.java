package Singleton;

public class Client {

    public static void main(String[] args) {
//        ToolTipManager t = ToolTipManager.getInstance();
//        System.out.println(t.operation());
//
//        ToolTipManager2 t2 = ToolTipManager2.getInstance();
//        System.out.println(t2.operation());

        SingletonThreadTest singletonThread = new SingletonThreadTest("singletonThread1");
        SingletonThreadTest singletonThread2 = new SingletonThreadTest("singletonThread2");
        SingletonThreadTest singletonThread3 = new SingletonThreadTest("singletonThread3");

        singletonThread.start();
        singletonThread2.start();
        singletonThread3.start();
    }
}
