package exercice7;

public class calcul{

  
    public static <T extends Number> double somme(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }
}