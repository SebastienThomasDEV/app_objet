package tp_auto.test;
import tp_auto.classes.Operations;
public class TestOperations {
    public static void main(String[] args) {
        double a = 10.0;
        double b = 5.0;

        char[] operateurs = {'+', '-', '*', '/'};

        for (char operateur : operateurs) {
            double resultat = Operations.calcul(a, b, operateur);
            System.out.println(a + " " + operateur + " " + b + " = " + resultat);
        }
    }
}
