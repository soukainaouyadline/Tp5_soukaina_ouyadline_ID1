package exercice7;

abstract class Forme {

   
    public abstract double calculerSurface();

   
    public void afficherDescription() {
        System.out.println("Ceci est une forme géométrique");
    }

    public int comparerSurface(Forme f) {
        if (this.calculerSurface() > f.calculerSurface()) return 1;
        if (this.calculerSurface() < f.calculerSurface()) return -1;
        return 0;
    }
}