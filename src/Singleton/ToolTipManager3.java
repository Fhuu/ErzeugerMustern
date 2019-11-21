package Singleton;

public class ToolTipManager3 {

    private static ToolTipManager3 instance = new ToolTipManager3();

    private ToolTipManager3() {
        System.out.println("ToolTipManager3 erzeugt.");
    }

    public static ToolTipManager3 getInstance() {
        if(instance == null) instance = new ToolTipManager3();
        return instance;
    }

    public String operation () {
        return "operation() aufgerufen.";
    }
}
