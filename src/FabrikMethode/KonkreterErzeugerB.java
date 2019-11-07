package FabrikMethode;

public class KonkreterErzeugerB implements Erzeuger{


    @Override
    public void operation() {
        fabrikMethode();
    }

    @Override
    public Produkt fabrikMethode() {
        return new KonkretesProduktB();
    }
}
