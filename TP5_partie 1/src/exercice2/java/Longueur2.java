package exercice2.java;

public class Longueur2 {

    
    public static void afficherLongueurAvecTry(String texte) {

        try {
            System.out.println("Longueur : " + texte.length());

        } catch (NullPointerException e) {
            System.out.println("Erreur : la chaîne est null");
        }
    }
}