package exercice10;

class Utilisateur {
    private String identifiant; 
    private String nom;        

    public Utilisateur(String id, String nom) {
        this.identifiant = id;
        this.nom = nom;
    }

    public void emprunterDocument(Document d) {
        System.out.print(nom + " tente d'emprunter : ");
        d.emprunter();
    } 
}