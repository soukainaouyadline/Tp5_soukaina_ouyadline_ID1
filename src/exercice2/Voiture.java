package exercice2;


public class Voiture extends Vehicule {
    private int nbPortes;
    private String carburant;

    //sans utilisation de super 
    public Voiture( int nbPortes, String carburant) {
        this.nbPortes = nbPortes;
        this.carburant = carburant;
    

    public void afficherDetails() {
        afficherMarque();
        System.out.println("Portes : " + nbPortes);
        System.out.println("Carburant : " + carburant);
    }

    public void klaxonner() {
        System.out.println("pip pip !");
    }
}
