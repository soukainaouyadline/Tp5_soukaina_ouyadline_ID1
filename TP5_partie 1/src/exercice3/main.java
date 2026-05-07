package exercice3;


public class main {

    public static void main(String[] args) {

      
        int[] tableau = {10, 20, 30, 40, 50};

        //  if
        Tableau_if.accederElement(tableau, 5);
        Tableau_if.accederElement(tableau, 3);

        // try/catch
        Tableau_try.accederElement(tableau, 1);
        Tableau_try.accederElement(tableau, 4);
    }
}