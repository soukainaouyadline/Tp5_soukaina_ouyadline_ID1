package exercice8;

class Avion implements Volant {

    private int altitude;

   
    public void voler() {
        System.out.println("L'avion  vole");
    }

   
    public void atterrir() {
        altitude = 0;
        System.out.println("L'avion atterrit");
    }

    
    public void changerAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println("Altitude de l'avion = " + altitude);
    }

   
    public void embarquerPassagers() {
        System.out.println("Les passagers embarquent");
    }

    public void afficherAltitude() {
        System.out.println("Altitude actuelle = " + altitude);
    }
}