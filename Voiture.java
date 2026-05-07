package exercice9;

public class Voiture<T> extends Vehicule<T> {

    public Voiture() {
        super();
    }

    public Voiture(T vitesse) {
        super(vitesse);
    }

    public void afficherVitesse() {
        System.out.println("Vitesse : " + getVitesse());
    }
}