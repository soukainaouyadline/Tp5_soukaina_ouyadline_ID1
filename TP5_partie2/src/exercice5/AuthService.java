package exercice5;

public class AuthService {

   
    public void login(String username, String password)
            throws AuthentificationException {

        
        String correctUsername = "admin";
        String correctPassword = "1234";

       
        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            throw new AuthentificationException("Identifiants incorrects");
        }

        System.out.println("Connexion réussie !");
    }
}