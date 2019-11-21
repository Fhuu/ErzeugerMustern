package Singleton;

public class ToolTipManager2 {
    private static ToolTipManager2 instance = new ToolTipManager2();

    private ToolTipManager2 () {
        System.out.println("ToolTipManager2 erzeugt.");
    }

    public static ToolTipManager2 getInstance() {
        System.out.println("ToolTipManager2::getInstance()");
        return instance;
    }

    public String operation() {
        return "operation() aufgerufen.";
    }
}
