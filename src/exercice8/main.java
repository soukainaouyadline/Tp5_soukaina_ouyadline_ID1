package exercice8;

public class main {
    public static void main(String[] args) {

        Oiseau o = new Oiseau();
        Avion a = new Avion();

        
        o.voler();
        o.changerAltitude(100);
        o.migrer();
        o.construireNid();
        o.atterrir();

      

      
        a.voler();
        a.changerAltitude(10000);
        a.afficherAltitude();
        a.embarquerPassagers();
        a.atterrir();
    }
}