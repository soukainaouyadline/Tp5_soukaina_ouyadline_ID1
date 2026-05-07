package exercice3;

public class main {

    public static void main(String[] args) {

        CompteBancaire compte = new CompteBancaire("C001", 9000);

        try {
            compte.verser(123);
            compte.retirer(345);
            compte.retirer(4000); 

        } catch (MontantInvalideException | SoldeInsuffisantException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        compte.afficher();
    }
}