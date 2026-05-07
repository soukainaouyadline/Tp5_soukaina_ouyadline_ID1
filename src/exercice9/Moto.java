package exercice9;

class Moto extends Vehicule {

    private String type = "Sport";

   
    public void demarrer() {
        System.out.println("Moto démarre avec bruit moteur");
    }

    public void faireRoueArriere() {
        System.out.println("Moto fait une roue arrière !");
    }

    public void afficherTypeMoto() {
        System.out.println("Type de moto : " + type);
    }
}
