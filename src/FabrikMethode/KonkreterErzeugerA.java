package FabrikMethode;

public class KonkreterErzeugerA implements Erzeuger {

    public void operation() {
        fabrikMethode();
    }

    @Override
    public Produkt fabrikMethode() {
        return new KonkretesProduktA();
    }
}
