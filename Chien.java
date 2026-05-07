package exercice8;


public class Chien extends Animal<String> {

    public Chien() {
        super();
    }

    public Chien(String nom) {
        super(nom);
    }

    public void aboyer() {
        System.out.println(getNom() + " aboie : hho hhoo !");
    }
}