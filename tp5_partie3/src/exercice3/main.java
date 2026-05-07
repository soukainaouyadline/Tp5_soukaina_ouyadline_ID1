package exercice3;

public class main {

    public static void main(String[] args) {

        
        Calcul<Integer> calcInt = new CalculInteger();
        System.out.println("Somme Integer : " + calcInt.addition(5, 2));

        // Test Double
        Calcul<Double> calcDouble = new CalculDouble();
        System.out.println("Somme Double : " + calcDouble.addition(7.5,8.3));
    }
}
