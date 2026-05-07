package exercice8;
public class Formulaire {

    
    public void validerFormulaire(String nom, String email)
            throws ChampObligatoireException {

       
        if (nom == null || nom.trim().isEmpty()) {
            throw new ChampObligatoireException("Le champ nom est obligatoire");
        }

       
        if (email == null || email.trim().isEmpty()) {
            throw new ChampObligatoireException("Le champ email est obligatoire");
        }

        System.out.println("Formulaire valide !");
    }
}