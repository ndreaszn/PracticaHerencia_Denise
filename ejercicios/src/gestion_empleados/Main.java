package gestion_empleados;

public class Main {
    public static void main(String[] args) {

        Programador dev = new Programador("Denise", "Name", 2000.0, "Informática", "Java", 10);

        Gerente jefe = new Gerente("Gerardo", "Romero", 3000.0, "Ventas", 500.0, 5);

        System.out.println("--- DATOS DE LOS EMPLEADOS ---");
        dev.mostrarInformacion();
        jefe.mostrarInformacion();
    }
}