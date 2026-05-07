package exercice10;


public class Repository<T> {

 
    public void save(T obj) {
        System.out.println("Objet sauvegardé : " + obj);
    }
}