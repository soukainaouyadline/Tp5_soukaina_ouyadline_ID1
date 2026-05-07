package exercice1;

public class Boite<T> {

    private T contenu;

   
    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

   
    public T getContenu() {
        return contenu;
    }
}