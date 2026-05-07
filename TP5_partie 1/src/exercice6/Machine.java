package exercice6;

public class Machine {

   
    private boolean allumee = false;

    public void demarrer() {

      
        if (allumee) {

            throw new IllegalStateException(
                "Erreur : la machine est déjà démarrée"
            );
        }

     
        allumee = true;

        System.out.println(" Machine démarrée");
    }
}