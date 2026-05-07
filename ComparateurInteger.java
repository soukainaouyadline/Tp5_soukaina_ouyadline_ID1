package exercice5;

public class ComparateurInteger implements Comparateur<Integer> {

    @Override
    public int comparer(Integer a, Integer b) {

      
        return a.compareTo(b);
    }
}