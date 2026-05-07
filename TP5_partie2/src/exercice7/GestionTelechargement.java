package exercice7;

public class GestionTelechargement {

    private double limite = 100.0; 

   
    public void telechargerFichier(double taille) throws QuotaDepasseException {

       
        if (taille > limite) {
            throw new QuotaDepasseException("Quota dépassé");
        }

        System.out.println("Téléchargement réussi : " + taille + " MB");
    }
}