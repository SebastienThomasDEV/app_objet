package tp_auto.test;
import tp_auto.classes.Pigiste;
import tp_auto.classes.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        // Création d'une instance de Salarie
        Salarie salarie = new Salarie("Dupont", "Jean", 2500.0);
        salarie.afficherDonnees();

        System.out.println();

        // Création d'une instance de Pigiste
        Pigiste pigiste = new Pigiste("Martin", "Luc", 20, 150.0);
        pigiste.afficherDonnees();
    }
}
