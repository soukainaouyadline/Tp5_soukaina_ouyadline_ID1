package exercice1;

public class main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("ouyadline", "soukaina", 21, "Licence ", 16.5);

        System.out.println(e1.sePresenter());
        System.out.println("Majeur : " + e1.estMajeur());

        e1.afficherProfil();
        
        System.out.println("Mention e1 : " + e1.calculerMention());
        System.out.println("Admis e1 : " + e1.estAdmis());
    }
}
