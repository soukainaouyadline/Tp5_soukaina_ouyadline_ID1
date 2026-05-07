package exercice9;

public class Vehicule<T> {

    T vitesse;

    public Vehicule() {
    }

    public Vehicule(T vitesse) {
        this.vitesse = vitesse;
    }

    public T getVitesse() {
        return vitesse;
    }

    public void setVitesse(T vitesse) {
        this.vitesse = vitesse;
    }
}