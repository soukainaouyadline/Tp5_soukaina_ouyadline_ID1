package exercice10;

abstract class Document {
    protected String identifiant; 
    protected String titre;      
    protected String auteur;      
    protected boolean disponible;

    public Document(String identifiant, String titre, String auteur) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.auteur = auteur;
        this.disponible = true;
    }

    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println("Le document '" + titre + "' a été emprunté.");
        } else {
            System.out.println("Désolé, '" + titre + "' n'est pas disponible.");
        }
    } 

    public void retourner() {
        disponible = true;
        System.out.println("Le document '" + titre + "' a été rendu.");
    }

    public void afficherInformations() {
        System.out.println("[" + identifiant + "] " + titre + " - " + auteur + 
                           " (Disponible: " + disponible + ")");
    } 

     
    public abstract int calculerDureeEmpruntMax();
}