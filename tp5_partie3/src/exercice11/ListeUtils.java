package exercice11;



import java.util.List;

public class ListeUtils {

    public static void afficherListe(List<?> liste) {

        for (Object element : liste) {
            System.out.println(element);
        }
    }
}