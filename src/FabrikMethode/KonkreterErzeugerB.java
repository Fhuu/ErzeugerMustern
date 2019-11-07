package FabrikMethode;

public class KonkreterErzeugerB implements Erzeuger{


    @Override
    public void operation() {
        fabrikMehtode();
    }

    @Override
    public Produkt fabrikMehtode() {
        return new KonkretesProduktB();
    }
}
