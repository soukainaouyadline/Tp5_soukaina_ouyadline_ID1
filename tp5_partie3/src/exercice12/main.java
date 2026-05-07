package exercice12;


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

       
        List<Integer> entiers = new ArrayList<>();
        entiers.add(23);
        entiers.add(2);

       
        List<Double> reels = new ArrayList<>();
        reels.add(5.5);
        reels.add(2.3);

        System.out.println("Liste Integer :");
        Liste.afficherNombres(entiers);

        System.out.println("Liste Double :");
        Liste.afficherNombres(reels);
    }
}