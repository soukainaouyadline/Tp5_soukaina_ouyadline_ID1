package exercice9;

public class main {

    public static void main(String[] args) {

       
        Voiture<Integer> v1 = new Voiture<>(150);
        v1.afficherVitesse();

      
        Voiture<Double> v2 = new Voiture<>(122.5);
        v2.afficherVitesse();
    }
}