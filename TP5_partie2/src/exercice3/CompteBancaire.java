package exercice3;

public class CompteBancaire {

    private String code;
    private double solde;

   
    public CompteBancaire(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }

  
    public String getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

   
    public void verser(double montant) throws MontantInvalideException {
        if (montant <= 0) {
            throw new MontantInvalideException("Montant invalide : doit être > 0");
        }
        solde += montant;
    }

   
    public void retirer(double montant)
            throws MontantInvalideException, SoldeInsuffisantException {

        if (montant <= 0) {
            throw new MontantInvalideException("Montant invalide : doit être > 0");
        }

        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant");
        }

        solde -= montant;
    }

  
    public void afficher() {
        System.out.println("Compte: " + code + " | Solde: " + solde);
    }
}