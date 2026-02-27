package gestion_coches;

public class Coche {
    private String marca;
    private String modelo;
    private double precio;
    private int velocidadMaxima;
    private Rueda[] ruedas;

    public Coche(String marca, String modelo, double precio, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidadMaxima = velocidadMaxima;

        // 4 ruedas nuevas por defecto
        this.ruedas = new Rueda[4];
        for (int i = 0; i < 4; i++) {
            this.ruedas[i] = new Rueda(0.0, "Nuevo");
        }
    }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) { this.precio = precio; }

    public int getVelocidadMaxima() { return velocidadMaxima; }

    public void setVelocidadMaxima(int velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    public void mostrarInformacion() {
        System.out.println("Vehículo: " + marca + " " + modelo);
        System.out.println("Precio: " + precio + "€");
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Estado de las ruedas:");

        // ver las 4 ruedas
        for (int i = 0; i < 4; i++) {
            ruedas[i].mostrarInfoRueda();
        }
    }
}
