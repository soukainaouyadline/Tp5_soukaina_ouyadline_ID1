package exercice3;

public class CalculInteger implements Calcul<Integer> {

    @Override
    public Integer addition(Integer a, Integer b) {
        return a + b;
    }
}