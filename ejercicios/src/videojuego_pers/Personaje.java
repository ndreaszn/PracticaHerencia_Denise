package videojuego_pers;

public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public int getAtaque() { return ataque; }
    public void setAtaque(int ataque) { this.ataque = ataque; }

    public int getDefensa() { return defensa; }
    public void setDefensa(int defensa) { this.defensa = defensa; }

    public void recibirDano(int danoRecibido) {
        int danoFinal = danoRecibido - defensa;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        vida = vida - danoFinal;
        System.out.println(" - " + nombre + " recibe " + danoFinal + " puntos de daño. Vida restante: " + vida);
    }

    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.getNombre());
        objetivo.recibirDano(ataque);
    }
}
