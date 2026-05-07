package exercice9;

abstract class Vehicule {

    protected int vitesse = 0;

    public void accelerer() {
        vitesse += 10;
        System.out.println("Vitesse = " + vitesse);
    }

    public void freiner() {
        vitesse = Math.max(0, vitesse - 10);
        System.out.println("Vitesse = " + vitesse);
    }

    public abstract void demarrer();
}
