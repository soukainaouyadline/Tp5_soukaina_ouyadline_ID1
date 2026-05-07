package exercice5;

public class main {

    public static void main(String[] args) {

       
        Comparateur<Integer> c1 = new ComparateurInteger();

        System.out.println("Comparaison Integer (10, 20) : "
                + c1.comparer(10, 20));

     
        Comparateur<String> c2 = new ComparateurString();

        System.out.println("Comparaison String (\"Java\", \"Bonjour\") : "
                + c2.comparer("Java", "c"));
    }
}