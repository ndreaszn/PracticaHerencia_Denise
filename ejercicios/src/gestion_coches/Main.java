package gestion_coches;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- CONCESIONARIO MULTIMARCA ---\n");

        CocheElectrico tesla = new CocheElectrico("Tesla", "Model 3", 45000.0, 225, 500, 6.5);

        CocheDeportivo porsche = new CocheDeportivo("Porsche", "911 Carrera", 120000.0, 290, 385);

        porsche.activarModoCarrera();
        System.out.println();

        tesla.mostrarInformacion();
        porsche.mostrarInformacion();
    }
}