package exercice4;

public class conversion_try {

    public static void convertir(String texte) {

        try {

            int nombre = Integer.parseInt(texte);
            System.out.println("Nombre converti : " + nombre);

        } catch (NumberFormatException e) {

            System.out.println("Erreur : impossible de convertir en entier");
        }
    }
}