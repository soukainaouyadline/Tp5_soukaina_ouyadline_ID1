package exercice4;

public class main {

    public static void main(String[] args) {

       
        Comparateur<Integer> compInt = new ComparateurInteger();

        System.out.println("Comparaison Integer (23, 2) : "
                + compInt.comparer(23, 2));

     
        Comparateur<String> compString = new ComparateurString();

        System.out.println("Comparaison String (\"salut\", \"bonjour\") : "
                + compString.comparer("salut", "hi"));
    }
}
