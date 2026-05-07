package exercice4;

public class main {

    public static void main(String[] args) {

        utilisateur u = new utilisateur();

        try {
            u.inscrire("testgmail.com", 36); 

        } catch (EmailInvalideException | Exception_age e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            u.inscrire("test@gmail.com", 16); 

        } catch (EmailInvalideException |Exception_age e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            u.inscrire("test@gmail.com", 24);

        } catch (EmailInvalideException | Exception_age e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        u.afficher();
    }
}