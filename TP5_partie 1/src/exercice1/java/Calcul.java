package exercice1.java;

public class Calcul {

	public  static int Diviser(int a,int b) {
		if (b == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        return a / b;
	
	}

}
