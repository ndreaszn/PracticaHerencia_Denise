package videojuego_pers;

public class Guerrero extends Personaje {
    private int fuerza;
    private int armadura;

    public Guerrero(String nombre, int vida, int ataque, int defensa, int fuerza, int armadura) {
        super(nombre, vida, ataque, defensa);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    public int getFuerza() { return fuerza; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    public int getArmadura() { return armadura; }
    public void setArmadura(int armadura) { this.armadura = armadura; }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(getNombre() + " da un espadazo brutal a " + objetivo.getNombre() + "!");
        objetivo.recibirDano(getAtaque() + fuerza);
    }

    @Override
    public void recibirDano(int danoRecibido) {
        int defensaTotal = getDefensa() + armadura;
        int danoFinal = danoRecibido - defensaTotal;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        setVida(getVida() - danoFinal);
        System.out.println(" - " + getNombre() + " bloquea con su armadura y recibe " + danoFinal + " de daño. Vida restante: " + getVida());
    }
}
