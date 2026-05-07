package exercice2;

public class CompteBancaire {

    private String code;
    private double solde;

    public CompteBancaire(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }

 
    public void verser(double montant) throws MontantInvalideException {

        if (montant <= 0) {
            throw new MontantInvalideException(
                "Montant invalide : doit être > 0"
            );
        }

        solde += montant;
        System.out.println("Versement : " + montant);
    }

   
    public void retirer(double montant)
            throws MontantInvalideException {

        if (montant <= 0) {
            throw new MontantInvalideException(
                "Montant invalide : doit être > 0"
            );
        }

        if (montant > solde) {
            System.out.println("Solde insuffisant");
            return;
        }

        solde -= montant;
        System.out.println("Retrait : " + montant);
    }

    public double getSolde() {
        return solde;
    }
}