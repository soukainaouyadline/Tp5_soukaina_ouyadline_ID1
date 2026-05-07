 

package exercice9;

public class main {

    public static void main(String[] args) {

       
        Paiement p1 = new Paiement(true);

        try {
            p1.payer(200);

        } catch (PaiementRefuseException | CarteExpireeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

       
        Paiement p2 = new Paiement(false);

        try {
            p2.payer(2000);

        } catch (PaiementRefuseException | CarteExpireeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

       
        try {
            p2.payer(234);

        } catch (PaiementRefuseException | CarteExpireeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}