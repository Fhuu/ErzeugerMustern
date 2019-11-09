package FabrikMethode;

public class KonkreterErzeugerB extends Erzeuger{

    @Override
    public Produkt fabrikMethode() {
        return new KonkretesProduktB();
    }
}
