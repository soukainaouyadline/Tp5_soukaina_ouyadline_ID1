package exercice3;
class CompteCourant extends Compte {

    public CompteCourant(double solde) {
        super(solde);
    }

    public void autoriserDecouvert() {
        System.out.println("Découvert autorisé jusqu'à -500");
    }

    public double calculerFrais() {
        double frais = solde * 0.01;
        System.out.println("Frais = " + frais);
        return frais;
    }

    @Override
    public void afficher() {
        System.out.println("Compte Courant - Solde = " + solde);
    }
}