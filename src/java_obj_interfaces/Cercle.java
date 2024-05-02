package java_obj_interfaces;

public class Cercle implements ObjetGeometrique {
    double rayon;
    public Cercle(double rayon) {
        this.rayon = rayon;
    }


    @Override
    public double perimetre() {
        return this.rayon * 2;
    }

    @Override
    public double surface() {
        return (this.rayon * this.rayon) * Math.PI;
    }
}
