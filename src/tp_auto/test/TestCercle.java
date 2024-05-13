package tp_auto.test;
import tp_auto.classes.Cercle;

public class TestCercle {
    public static void main(String[] args) {
        // Instanciation de 2 cercles différents
        Cercle cercle1 = new Cercle(5.0);
        Cercle cercle2 = new Cercle(3.0);

        // Affichage des résultats des méthodes de calcul
        System.out.println("Pour le cercle 1 :");
        System.out.println("Périmètre : " + cercle1.calculerPerimetre());
        System.out.println("Surface : " + cercle1.calculerSurface());

        System.out.println("\nPour le cercle 2 :");
        System.out.println("Périmètre : " + cercle2.calculerPerimetre());
        System.out.println("Surface : " + cercle2.calculerSurface());
    }
}
