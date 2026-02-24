package videojuego_pers;

public class Mago extends Personaje {
    private int mana;
    private int poderMagico;

    public Mago(String nombre, int vida, int ataque, int defensa, int mana, int poderMagico) {
        super(nombre, vida, ataque, defensa);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }

    public int getPoderMagico() { return poderMagico; }
    public void setPoderMagico(int poderMagico) { this.poderMagico = poderMagico; }

    @Override
    public void atacar(Personaje objetivo) {
        if (mana >= 10) {
            System.out.println(getNombre() + " lanza una bola de fuego a " + objetivo.getNombre() + "!");
            mana = mana - 10;
            objetivo.recibirDano(getAtaque() + poderMagico);
        } else {
            System.out.println(getNombre() + " se quedó sin maná y solo da un golpe débil con su bastón.");
            objetivo.recibirDano(getAtaque());
        }
    }
}