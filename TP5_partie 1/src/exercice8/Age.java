package exercice8;

public class Age {

   
    public static void verifierAge(int age) throws Exception {

        
        if (age < 18) {

            throw new Exception(
                "Erreur : âge inférieur à 18"
            );
        }

        System.out.println("Accès autorisé");
    }
}