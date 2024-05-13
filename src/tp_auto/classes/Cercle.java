package tp_auto.classes;
import tp_auto.classes.model.Forme;

public class Cercle  extends Forme {
    private double rayon;

    // Constructeur
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    // Méthodes abstraites implémentées
    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }
}