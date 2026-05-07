package exercice2;


public class Paire<T, U> {

    private T premier;
    private U second;

   
    public Paire(T premier, U second) {
        this.premier = premier;
        this.second = second;
    }

   
    public void afficherPaire() {
        System.out.println("Premier : " + premier + " | Second : " + second);
    }
}