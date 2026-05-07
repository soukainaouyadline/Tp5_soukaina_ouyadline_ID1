package exercice9;

class VoitureElectrique extends Vehicule implements Electrique {

    private int batterie = 100;

   
    public void demarrer() {
        System.out.println("Voiture électrique démarre silencieusement");
    }

  
    public void charger() {
        batterie = 100;
        System.out.println("Voiture en charge...");
    }

  
    public void verifierBatterie() {
        System.out.println("Batterie = " + batterie + "%");
    }

  
    public void afficherAutonomie() {
        System.out.println("Autonomie estimée : 300 km");
    }

    public void optimiserConsommation() {
        System.out.println("Consommation optimisée");
    }
}
