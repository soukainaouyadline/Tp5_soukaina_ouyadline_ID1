package exercice5;

public class math {

    public static int racineCarree(int x) {

      
        if (x < 0) {

            throw new IllegalArgumentException(
                "Erreur : x doit être positif ou nul"
            );
        }

      
        return (int) Math.sqrt(x);
    }
}