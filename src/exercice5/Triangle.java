package exercice5;

class Triangle extends Figure {

    private double base;
    private double hauteur;
    private double cote1, cote2, cote3;

    public Triangle(int x, int y, double base, double hauteur,
                    double cote1, double cote2, double cote3) {
        super(x, y);
        this.base = base;
        this.hauteur = hauteur;
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    
    public void dessiner() {
        System.out.println("Dessin d'un triangle");
    }

   
    public void redimensionner(double facteur) {
        base *= facteur;
        hauteur *= facteur;
        cote1 *= facteur;
        cote2 *= facteur;
        cote3 *= facteur;
        System.out.println("Triangle redimensionné");
    }

    public double calculerPerimetre() {
        return cote1 + cote2 + cote3;
    }

    public double calculerSurface() {
        return (base * hauteur) / 2;
    }
}