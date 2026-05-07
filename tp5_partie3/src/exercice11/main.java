package exercice11;


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

      
        List<String> noms = new ArrayList<>();
        noms.add("Ayman");
        noms.add("sakina");

      
        List<Integer> nombres = new ArrayList<>();
        nombres.add(12);
        nombres.add(20);

        System.out.println("Liste String :");
        ListeUtils.afficherListe(noms);

        System.out.println("Liste Integer :");
        ListeUtils.afficherListe(nombres);
    }
}