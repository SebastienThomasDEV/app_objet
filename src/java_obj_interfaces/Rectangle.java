package java_obj_interfaces;

public class Rectangle implements ObjetGeometrique {
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (this.longueur + this.largeur) *  2;
    }

    @Override
    public double surface() {
        return this.largeur * this.largeur;
    }
}
