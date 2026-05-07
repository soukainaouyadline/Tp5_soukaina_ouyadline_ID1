package exercice6;

public class main {

    public static void main(String[] args) {

      
        String[] noms = {"omar", "adnane", "malak"};

        System.out.println("Affichage tableau String :");
        Tableau.afficherTableau(noms);

        System.out.println("Premier élément : " 
                + Tableau.getPremier(noms));

       
        Integer[] nombres = {10, 20, 30};

        System.out.println("\nAffichage tableau Integer :");
        Tableau.afficherTableau(nombres);

        System.out.println("Premier élément : " 
                + Tableau.getPremier(nombres));
    }
}