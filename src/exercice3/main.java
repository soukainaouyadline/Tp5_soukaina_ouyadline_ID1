package exercice3;

public class main {
    public static void main(String[] args) {

        CompteCourant cc = new CompteCourant(1000);
        CompteEpargne ce = new CompteEpargne(2000);

        System.out.println("COMPTE COURANT");
        cc.afficher();
        cc.deposer(500);
        cc.retirer(200);
        cc.autoriserDecouvert();
        cc.calculerFrais();
        cc.afficher();

        System.out.println("COMPTE EPARGNE ");
        ce.afficher();
        ce.deposer(300);
        ce.ajouterInterets();
        ce.retirer(100);
        ce.afficher();
    }
}