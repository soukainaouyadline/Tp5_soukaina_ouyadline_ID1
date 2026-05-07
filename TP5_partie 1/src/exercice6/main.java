package exercice6;

public class main {

    public static void main(String[] args) {

        Machine machine = new Machine();

        try {

            machine.demarrer();
            machine.demarrer();

        } catch (IllegalStateException e) {

            System.out.println(e.getMessage());
        }
    }
}