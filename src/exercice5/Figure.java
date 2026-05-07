package exercice5;

abstract class Figure {

    protected int x, y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void dessiner();

    public void deplacer(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Figure déplacée vers (" + x + "," + y + ")");
    }

    public abstract void redimensionner(double facteur);
}