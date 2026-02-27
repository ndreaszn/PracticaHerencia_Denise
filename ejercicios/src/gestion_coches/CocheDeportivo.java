package gestion_coches;

public class CocheDeportivo extends Coche {
    private int caballos;
    private boolean modoCarrera;

    public CocheDeportivo(String marca, String modelo, double precio, int velocidadMaxima, int caballos) {
        super(marca, modelo, precio, velocidadMaxima);
        this.caballos = caballos;
        this.modoCarrera = false;
    }

    public int getCaballos() { return caballos; }

    public void setCaballos(int caballos) { this.caballos = caballos; }

    public boolean isModoCarrera() { return modoCarrera; }

    public void setModoCarrera(boolean modoCarrera) { this.modoCarrera = modoCarrera; }

    public void activarModoCarrera() {
        this.modoCarrera = true;
        System.out.println("Modo carrera activado en el " + getMarca() + " " + getModelo() + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Deportivo");
        System.out.println("Caballos de fuerza: " + caballos);
        String estadoModo = modoCarrera ? "Activado" : "Desactivado";
        System.out.println("Modo Carrera: " + estadoModo);
        System.out.println("-----------------------------------");
    }
}
