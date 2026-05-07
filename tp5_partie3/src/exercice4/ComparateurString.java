package exercice4;

public class ComparateurString implements Comparateur<String> {

    @Override
    public int comparer(String a, String b) {

        return Integer.compare(a.length(), b.length());
    }
}