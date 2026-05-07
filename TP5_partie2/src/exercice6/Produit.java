package exercice6;


public class Produit {

    private String nom;
    private int stock;

  
    public Produit(String nom, int stock) {
        this.nom = nom;
        this.stock = stock;
    }

   
    public void retirerDuStock(int quantite) throws StockInsuffisantException {

       
        if (quantite > stock) {
            throw new StockInsuffisantException("Stock insuffisant");
        }

     
        stock -= quantite;
    }

   
    public void afficher() {
        System.out.println("Produit: " + nom + " | Stock: " + stock);
    }
}