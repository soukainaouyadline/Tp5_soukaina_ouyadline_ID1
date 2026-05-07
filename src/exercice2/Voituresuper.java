package exercice2;

public class Voituresuper extends Vehicule {
    private int nbPortes;
    private String carburant;

    public Voituresuper(String marque, int nbPortes, String carburant) {
        super(marque); //on a ici utilisation de super
        this.nbPortes = nbPortes;
        this.carburant = carburant;
    }

    public void afficherDetails() {
        afficherMarque();
        System.out.println("Portes : " + nbPortes);
        System.out.println("Carburant : " + carburant);
    }

    public void klaxonner() {
        System.out.println("pip pip !");
    }
}