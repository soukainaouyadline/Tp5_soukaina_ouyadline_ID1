package exercice10;


public class main {

    public static void main(String[] args) {

        UserRepository repo = new UserRepository();

        user u1 = new user("sakina");
        user u2 = new user("Salma");

        repo.save(u1);
        repo.save(u2);
    }
}