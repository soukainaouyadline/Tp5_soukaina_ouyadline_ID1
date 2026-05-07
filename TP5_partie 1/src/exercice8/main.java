package exercice8;

public class main {

    public static void main(String[] args) {

        try {

            Age.verifierAge(22);
            Age.verifierAge(4);

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}