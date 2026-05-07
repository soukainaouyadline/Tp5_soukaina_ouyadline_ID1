package exercice4;

public class utilisateur {

    private String email;
    private int age;

    
    public void inscrire(String email, int age)
            throws EmailInvalideException, Exception_age {

      
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new EmailInvalideException("Email invalide");
        }

      
        if (age < 18) {
            throw new Exception_age("Âge invalide : doit être >= 18 ans");
        }

       
        this.email = email;
        this.age = age;

        System.out.println("Inscription réussie !");
    }

  
    public void afficher() {
        System.out.println("Email: " + email + " | Age: " + age);
    }
}