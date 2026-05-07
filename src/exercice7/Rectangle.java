package exercice7;

class Rectangle extends Forme {

    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

   
    public boolean validerDimensions() {
        return longueur > 0 && largeur > 0;
    }

  
    public double calculerSurface() {
        return longueur * largeur;
    }

    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
}