package exercice10;

public class user {

    private String nom;

    public user(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "User{nom='" + nom + "'}";
    }
}