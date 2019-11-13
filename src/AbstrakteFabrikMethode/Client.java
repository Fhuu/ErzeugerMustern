package AbstrakteFabrikMethode;

public class Client {

    private static IAbstrakteFabrik fabrik = null;
    private static IAbstraktesProduktA PA = null;
    private static IAbstraktesProduktB PB = null;

    public static void main(String[] args) {
        fabrik = new KonkreteFabrik1();
        PA = fabrik.erzeugeProduktA();
        PB = fabrik.erzeugeProduktB();
        System.out.println(PA.print());
        System.out.println(PB.print());

        fabrik = new KonkreteFabrik2();
        PA = fabrik.erzeugeProduktA();
        PB = fabrik.erzeugeProduktB();
        System.out.println(PA.print());
        System.out.println(PB.print());
    }

}
