package FabrikMethode;

public class KonkreterErzeugerA extends Erzeuger {

    @Override
    public Produkt fabrikMethode() {
        return new KonkretesProduktA();
    }
}
