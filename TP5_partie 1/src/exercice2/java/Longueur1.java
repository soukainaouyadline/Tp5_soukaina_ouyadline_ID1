package exercice2.java;

public class Longueur1 {

    // sans try/catch
    public static void afficherLongueur(String texte) {

        if (texte == null) {
            System.out.println("La chaîne est null");
        } else {
            System.out.println("Longueur : " + texte.length());
        }
    }
}