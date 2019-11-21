package Singleton;

public class ToolTipManager {

    private static ToolTipManager instance;

    private ToolTipManager() {
        System.out.println("Neues Singleton erzeugt.");
    }

    public static ToolTipManager getInstance() {
        if(instance == null) instance = new ToolTipManager();
        return instance;
    }

    public String operation () {
        return "operation() aufgerufen.";
    }
}
