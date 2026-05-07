package exercice6;

public class Tableau {

   
    public static <T> void afficherTableau(T[] tableau) {

        for (T element : tableau) {
            System.out.println(element);
        }
    }

   
    public static <T> T getPremier(T[] tableau) {

        if (tableau == null || tableau.length == 0) {
            return null;
        }

        return tableau[0];
    }
}