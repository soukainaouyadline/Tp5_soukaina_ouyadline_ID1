package exercice7;

public class Propagation {

   
    public static void methodeA() {

        try {

            methodeB();

        } catch (ArithmeticException e) {

            System.out.println(
                "Exception capturée dans A : " + e.getMessage()
            );
        }
    }

   
    public static void methodeB() {

        methodeC();
    }

   
    public static void methodeC() {

        throw new ArithmeticException(
            "Division par zéro"
        );
    }
}