package exercice5;

class Cercle extends Figure {

    private double rayon;

    public Cercle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

  
    public void dessiner() {
        System.out.println("Dessin d'un cercle");
    }

   
    public void redimensionner(double facteur) {
        rayon *= facteur;
        System.out.println("Rayon du cercle = " + rayon);
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}
