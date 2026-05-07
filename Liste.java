package exercice12;


import java.util.List;

public class Liste {

  
    public static void afficherNombres(List<? extends Number> liste) {

        for (Number n : liste) {
            System.out.println(n);
        }
    }
}