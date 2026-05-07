package exercice9;

public class main {
    public static void main(String[] args) {

        VoitureElectrique v = new VoitureElectrique();
        Moto m = new Moto();

        System.out.println(" VOITURE ÉLECTRIQUE");
        v.demarrer();
        v.accelerer();
        v.verifierBatterie();
        v.afficherAutonomie();
        v.optimiserConsommation();
        v.freiner();
        v.charger();

        System.out.println("MOTO");
        m.demarrer();
        m.accelerer();
        m.faireRoueArriere();
        m.afficherTypeMoto();
        m.freiner();
    }
}