package tp_auto.test;
import tp_auto.classes.CalculMoyenne;
public class TestCalculMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calculMoyenne = new CalculMoyenne();

        // Test 1 : Ajout de valeurs et calcul de la moyenne
        calculMoyenne.ajout(10);
        calculMoyenne.ajout(15);
        calculMoyenne.ajout(20);
        System.out.println("Moyenne 1 : " + calculMoyenne.calcul());

        // Test 2 : Ajout d'autres valeurs et recalcul de la moyenne
        calculMoyenne.ajout(25);
        calculMoyenne.ajout(30);
        System.out.println("Moyenne 2 : " + calculMoyenne.calcul());
    }
}
