package exercice5;


public class main {

    public static void main(String[] args) {

        AuthService auth = new AuthService();

        try {
            auth.login("user", "0000"); 

        } catch (AuthentificationException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            auth.login("admin", "1234"); 

        } catch (AuthentificationException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}