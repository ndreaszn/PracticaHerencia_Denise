package videojuego_pers;

public class Main {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("p1", 100, 10, 5, 15, 10);

        Mago mago = new Mago("p2", 80, 5, 2, 20, 25);

        System.out.println("=== ¡COMIENZA EL COMBATE BUGISOFT! ===");
        System.out.println(guerrero.getNombre() + " VS " + mago.getNombre());
        System.out.println("--------------------------------------");

        guerrero.atacar(mago);
        System.out.println();

        mago.atacar(guerrero);
        System.out.println();

        guerrero.atacar(mago);
        System.out.println();

        mago.atacar(guerrero);
        System.out.println();

        mago.atacar(guerrero);
    }
}