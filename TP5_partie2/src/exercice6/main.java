package exercice6;

public class main {

    public static void main(String[] args) {

        Produit p = new Produit("PC", 10);

        try {
            p.retirerDuStock(5);   
            p.retirerDuStock(20);  

        } catch (StockInsuffisantException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        p.afficher();
    }
}