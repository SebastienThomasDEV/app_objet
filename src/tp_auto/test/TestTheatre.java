package tp_auto.test;
import tp_auto.classes.Theatre;
public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Théâtre ABC", 100);

        // Inscrivez plusieurs fois des clients jusqu'à atteindre la capacité maximale
        for (int i = 0; i < 110; i++) {
            theatre.inscrire(1, 20.0); // Supposons que le prix de la place est de 20.0 euros
        }

        // Affichez le total de clients inscrits
        System.out.println("Total de clients inscrits : " + theatre.getTotalClientsInscrits());

        // Affichez la recette totale de l'établissement
        System.out.println("Recette totale de l'établissement : " + theatre.getRecetteTotale() + " euros");
    }
}
