package exercice3;

	public class Tableau_if {

	    public static void accederElement(int[] tableau, int index) {

	        if (index >= 0 && index < tableau.length) {

	            System.out.println("Valeur : " + tableau[index]);

	        } else {

	            System.out.println("Erreur : index hors limites");
	        }
	    }
	}
