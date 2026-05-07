package exercice1;


public class Etudiant extends Personne {
    private String niveauEtude;
    private double moyenne;

   
    public Etudiant(String nom, String prenom, int age, String niveauEtude, double moyenne) {
        super(nom, prenom, age); 
        this.niveauEtude = niveauEtude;
        this.moyenne = moyenne;
    }

   
    public String calculerMention() {
        if (moyenne >= 16) return "Très Bien";
        else if (moyenne >= 14) return "Bien";
        else if (moyenne >= 12) return "Assez Bien";
        else if (moyenne >= 10) return "Passable";
        else return "Échec";
    }

    
    public boolean estAdmis() {
        return moyenne >= 12;
    }

   
    public void afficherProfil() {
        afficherInformations(); 
        System.out.println("Niveau d'étude : " + niveauEtude);
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Mention : " + calculerMention());
        System.out.println("Admis : " + (estAdmis() ? "Oui" : "Non"));
    }
}