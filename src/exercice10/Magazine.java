package exercice10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Magazine extends Document implements Empruntable {
  
    private int numero;
    private LocalDate datePublication;

   
    public Magazine(String id, String titre, String auteur, int numero, LocalDate datePublication) {
        super(id, titre, auteur); 
        this.numero = numero;
        this.datePublication = datePublication;
    }

   
   
    public int calculerDureeEmpruntMax() {
        return 10; 
    }

    public boolean estRecent() {
        long jours = ChronoUnit.DAYS.between(this.datePublication, LocalDate.now());
        return jours < 30;
    }

   
    public void afficherEdition() {
        System.out.println("Magazine N°: " + numero + " publié le : " + datePublication);
    }




    public boolean estDisponible() {
        return disponible; 
    }

   
    public void reserver() {
        if (disponible) {
            System.out.println("Le magazine n°" + numero + " a été réservé.");
        } else {
            System.out.println("Impossible de réserver, le magazine est déjà emprunté.");
        }
    }

    public void afficherInformations() {
        super.afficherInformations();
        afficherEdition();
    }
}