package exercice8;

public class Animal<T> {

    T nom;

    public Animal() {
    }

    public Animal(T nom) {
        this.nom = nom;
    }

    public T getNom() {
        return nom;
    }

    public void setNom(T nom) {
        this.nom = nom;
    }
}