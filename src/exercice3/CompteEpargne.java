package exercice3;

class CompteEpargne extends Compte {

    private double taux = 0.05;

    public CompteEpargne(double solde) {
        super(solde);
    }

    public double calculerInterets() {
        return solde * taux;
    }

    public void ajouterInterets() {
        double interets = calculerInterets();
        solde += interets;
        System.out.println("Intérêts ajoutés : " + interets);
    }

   
    public void afficher() {
        System.out.println("Compte Épargne - Solde = " + solde);
    }
}