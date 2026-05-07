package exercice4;

public class main {
    public static void main(String[] args) {

        // utilisation d'un  Polymorphisme
        Animal a1 = new Chien();
        Animal a2 = new Chat();

        System.out.println(" Polymorphisme ");
        a1.crier(); 
        a2.crier(); 

        a1.manger();
        a2.dormir();


        Chien c = new Chien();
        c.garder();
        c.jouer();

        Chat ch = new Chat();
        ch.ronronner();
        ch.grimper();
    }
}