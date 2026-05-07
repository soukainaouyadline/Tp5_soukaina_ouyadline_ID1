package exercice7;

public class main{

    public static void main(String[] args) {

        GestionTelechargement g = new GestionTelechargement();

        try {
            g.telechargerFichier(60);  
            g.telechargerFichier(430); 

        } catch (QuotaDepasseException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}