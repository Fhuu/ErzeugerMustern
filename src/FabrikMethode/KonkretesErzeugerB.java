package FabrikMethode;

public class KonkretesErzeugerB implements Erzeuger{


    @Override
    public void operation() {
        fabrikMehtode();
    }

    @Override
    public Produkt fabrikMehtode() {
        return new KonkretesProduktB();
    }
}
