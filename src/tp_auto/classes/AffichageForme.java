package tp_auto.classes;
import tp_auto.classes.model.Forme;
public class AffichageForme {
    public void afficher(Forme forme) {
        System.out.println("Périmètre : " + forme.calculerPerimetre());
        System.out.println("Surface : " + forme.calculerSurface());
    }
}
