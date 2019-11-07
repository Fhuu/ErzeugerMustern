package FabrikMethode;

public class Main {
    private static Erzeuger e = null;
    private static Produkt p = null;

    public static void main(String[] args) {
        e = new KonkreterErzeugerA();
        p = e.fabrikMehtode();
        System.out.println(p.print());

        e = new KonkretesErzeugerB();
        p = e.fabrikMehtode();
        System.out.println(p.print());
        System.out.println("hasan");
    }
}
