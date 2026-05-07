package exercice3;


class Compte {

    protected double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;
        System.out.println("Dépôt : " + montant);
    }

    public void retirer(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait : " + montant);
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public double consulterSolde() {
        return solde;
    }

    public void afficher() {
        System.out.println("Compte - Solde = " + solde);
    }
}