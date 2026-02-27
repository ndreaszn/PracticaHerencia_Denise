package gestion_coches;

public class CocheElectrico extends Coche {
    private int autonomia; // En kilómetros
    private double tiempoCarga; // En horas

    public CocheElectrico(String marca, String modelo, double precio, int velocidadMaxima, int autonomia, double tiempoCarga) {
        super(marca, modelo, precio, velocidadMaxima);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
    }

    public int getAutonomia() { return autonomia; }

    public void setAutonomia(int autonomia) { this.autonomia = autonomia; }

    public double getTiempoCarga() { return tiempoCarga; }

    public void setTiempoCarga(double tiempoCarga) { this.tiempoCarga = tiempoCarga; }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Eléctrico");
        System.out.println("Autonomía: " + autonomia + " km");
        System.out.println("Tiempo de carga: " + tiempoCarga + " horas");
        System.out.println("-----------------------------------");
    }
}
