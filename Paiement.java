package exercice9;



public class Paiement {

    private double plafond = 1000.0;
    private boolean carteExpiree;

   
    public Paiement(boolean carteExpiree) {
        this.carteExpiree = carteExpiree;
    }

  
    public void payer(double montant)
            throws PaiementRefuseException, CarteExpireeException {

       
        if (carteExpiree) {
            throw new CarteExpireeException("Carte expirée");
        }

       
        if (montant > plafond) {
            throw new PaiementRefuseException("Paiement refusé : plafond dépassé");
        }

        System.out.println("Paiement effectué : " + montant + " DH");
    }
}