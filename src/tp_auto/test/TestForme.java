package tp_auto.test;
import tp_auto.classes.Cercle;
import tp_auto.classes.Rectangle;
import tp_auto.classes.Carre;
import tp_auto.classes.AffichageForme;

public class TestForme {
    public static void main(String[] args) {
        // Création d'instances de différentes formes
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Carre carre = new Carre(4);

        // Création d'une instance de la classe AffichageForme
        AffichageForme affichage = new AffichageForme();

        // Test de la méthode afficher avec différentes formes
        System.out.println("Cercle :");
        affichage.afficher(cercle);

        System.out.println("\nRectangle :");
        affichage.afficher(rectangle);

        System.out.println("\nCarré :");
        affichage.afficher(carre);
    }
}
