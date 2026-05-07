package exercice10;

class DocumentNumerique extends Document implements Consultable {
    private String format;     
    private double tailleFichier;

    public DocumentNumerique(String id, String titre, String auteur, String format, double taille) {
        super(id, titre, auteur);
        this.format = format;
        this.tailleFichier = taille;
    }

   
    public int calculerDureeEmpruntMax() { return 0; } 

  
    public void consulter() { System.out.println("Ouverture du document " + format + "..."); }

   
    public void afficherResume() { System.out.println("Résumé du document numérique..."); }

    public void telecharger() { System.out.println("Téléchargement de " + tailleFichier + " Mo..."); }
}