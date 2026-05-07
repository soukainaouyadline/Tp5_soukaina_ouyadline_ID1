package exercice3;

public class Tableau_try {

    public static void accederElement(int[] tableau, int index) {

        try {

            System.out.println("Valeur : " + tableau[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Erreur : index hors limites");
        }
    }
}