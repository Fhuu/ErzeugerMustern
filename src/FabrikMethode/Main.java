package FabrikMethode;


public class Main {
    private static Erzeuger e = null;
    private static Produkt p = null;

    public static void main(String[] args) {
        e = new KonkreterErzeugerA();
        p = e.fabrikMethode();
        System.out.println(p.print());

        e = new KonkreterErzeugerB();
        p = e.fabrikMethode();
        System.out.println(p.print());
    }
}
