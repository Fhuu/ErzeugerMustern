package Singleton;

public class ToolTipManager {

    private static ToolTipManager instance;

    private ToolTipManager() {
        System.out.println("Neues Singleton erzeugt.");
    }

    public static ToolTipManager getInstance() {
        if(instance != null) return instance;
        else return new ToolTipManager();
    }

    public String operation () {
        return "operation() aufgerufen.";
    }
}
