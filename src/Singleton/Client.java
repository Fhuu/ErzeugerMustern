package Singleton;

public class Client {
    private ToolTipManager t = null;
    public static void main(String[] args) {
        ToolTipManager t = ToolTipManager.getInstance();
        System.out.println(t.operation());

    }
}
