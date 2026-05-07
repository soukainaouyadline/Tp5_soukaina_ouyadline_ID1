package exercice1;


public class CompteBancaire {

    private String code;
    private double solde;

    public CompteBancaire(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }

   
    public void verser(double montant) {

        if (montant > 0) {
            solde += montant;
            System.out.println("Versement effectué : " + montant);
        }
    }

   
    public void retirer(double montant) throws SoldeInsuffisantException {

        if (montant > solde) {
            throw new SoldeInsuffisantException(
                "Solde insuffisant : opération refusée"
            );
        }

        solde -= montant;
        System.out.println("Retrait effectué : " + montant);
    }

    public double getSolde() {
        return solde;
    }
}