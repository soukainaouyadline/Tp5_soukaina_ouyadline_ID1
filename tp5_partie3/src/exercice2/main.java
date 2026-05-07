package exercice2;

public class main {

    public static void main(String[] args) {

      
        Paire<String, Integer> p1 = new Paire<>("Age", 17);
        p1.afficherPaire();

       
        Paire<Integer, Double> p2 = new Paire<>(1, 8.5);
        p2.afficherPaire();

       
        Paire<String, String> p3 = new Paire<>("Nom", "soukaina");
        p3.afficherPaire();
    }
}