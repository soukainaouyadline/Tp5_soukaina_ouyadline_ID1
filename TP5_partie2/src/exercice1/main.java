package exercice1;

public class main {

    public static void main(String[] args) {

        CompteBancaire compte = new CompteBancaire("C001", 100);

        compte.verser(200);

        try {

            compte.retirer(245);
            compte.retirer(88);

        } catch (SoldeInsuffisantException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Solde final : " + compte.getSolde());
    }
}