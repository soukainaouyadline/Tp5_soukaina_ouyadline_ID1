package exercice7;

class Cercle extends Forme {

    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

  
    public boolean validerDimensions() {
        return rayon > 0;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}