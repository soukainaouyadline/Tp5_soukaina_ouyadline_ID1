package exercice10;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
      
        Document livre = new Livre("L01", "Le Dernier Jour d'un Condamné", "Victor Hugo", 250, "Roman");
        Document mag = new Magazine("M01", "Tech Mag", "Collectif", 45, LocalDate.of(2026, 4, 1));
        Document num = new DocumentNumerique("DN01", "Cours Java POO", "Pr. Cherradi", "PDF", 2.4);

       
        Utilisateur user = new Utilisateur("U01", "Soukaina");

        System.out.println(" TEST DES INFORMATIONS (Polymorphisme) ");
      
        livre.afficherInformations();
        mag.afficherInformations();
        num.afficherInformations();

        System.out.println(" TEST DES DURÉES D'EMPRUNT (Redéfinition) ");
        System.out.println("Durée Max Livre : " + livre.calculerDureeEmpruntMax() + " jours");
        System.out.println("Durée Max Magazine : " + mag.calculerDureeEmpruntMax() + " jours");

        System.out.println("TEST DES ACTIONS UTILISATEUR ");
       
        user.emprunterDocument(livre);
        user.emprunterDocument(mag);
        
     
    }
}