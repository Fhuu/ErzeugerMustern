package FabrikMethode;

public class KonkreterErzeugerA implements Erzeuger {

    public void operation() {
        fabrikMehtode();
    }

    @Override
    public Produkt fabrikMehtode() {
        return new KonkretesProduktA();
    }
}
