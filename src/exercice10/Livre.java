package exercice10;

class Livre extends Document implements Empruntable {
    private int nombreDePages;
    private String genre;     

    public Livre(String id, String titre, String auteur, int pages, String genre) {
        super(id, titre, auteur);
        this.nombreDePages = pages;
        this.genre = genre;
    }

    
    public int calculerDureeEmpruntMax() { return 21; } 

   
    public boolean estDisponible() { return disponible; }

 
    public void reserver() { System.out.println("Réservation effectuée pour le livre."); }

    public void recommander() { System.out.println("Ce livre est fortement recommandé !"); } 
}
