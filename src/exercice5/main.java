package exercice5;
public class main {
    public static void main(String[] args) {

        Cercle c = new Cercle(0, 0, 5);
        Triangle t = new Triangle(0, 0, 4, 3, 3, 4, 5);

        c.dessiner();
        t.dessiner();

        c.deplacer(10, 10);
        t.deplacer(5, 5);

        c.redimensionner(2);
        t.redimensionner(1.5);

        System.out.println("Surface cercle = " + c.calculerSurface());
        System.out.println("Surface triangle = " + t.calculerSurface());
    }
}