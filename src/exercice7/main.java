package exercice7;
public class main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 5);
        Cercle c = new Cercle(3);

 
        r.afficherDescription();
        c.afficherDescription();

        System.out.println("Rectangle valide ? " + r.validerDimensions());
        System.out.println("Cercle valide ? " + c.validerDimensions());

     
        System.out.println("Surface rectangle = " + r.calculerSurface());
        System.out.println("Surface cercle = " + c.calculerSurface());

  
        System.out.println("Périmètre rectangle = " + r.calculerPerimetre());
        System.out.println("Périmètre cercle = " + c.calculerPerimetre());

       
        System.out.println("Comparaison (r vs c) = " + r.comparerSurface(c));
    }
}