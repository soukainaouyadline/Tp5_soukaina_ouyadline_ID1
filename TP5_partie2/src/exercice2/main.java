package exercice2;

public class main {

    public static void main(String[] args) {

        CompteBancaire compte = new CompteBancaire("C002", 800);

        try {

            compte.verser(100);
            compte.verser(-30);   

        } catch (MontantInvalideException e) {

            System.out.println(e.getMessage());
        }

        try {

            compte.retirer(70);
            compte.retirer(0);    

        } catch (MontantInvalideException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("Solde final : " + compte.getSolde());
    }
}