package FabrikMethode;

public class KonkretesProduktA
        implements Produkt {
    @Override
    public String print() {
        return "Konkretes Produkt A würde erzeugt.";
    }
}
