package exercice8;

public class main {

    public static void main(String[] args) {

        Formulaire f = new Formulaire();

        try {
            f.validerFormulaire("", "test@gmail.com");

        } catch (ChampObligatoireException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            f.validerFormulaire("sakina", ""); 

        } catch (ChampObligatoireException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            f.validerFormulaire("sakina", "test@gmail.com"); 

        } catch (ChampObligatoireException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}