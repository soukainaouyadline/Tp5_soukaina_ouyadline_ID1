package exercice4;

public class conversion {

    public static void convertir(String texte) {

      
        if (texte.matches("-?\\d+")) {

            int nombre = Integer.parseInt(texte);
            System.out.println("Nombre converti : " + nombre);

        } else {

            System.out.println("Erreur : la chaîne n'est pas un entier valide");
        }
    }
}