package tp_auto.classes;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] tableau;
    private int taille;

    // Constructeur
    public CalculMoyenne() {
        int capaciteInitiale = 10;
        this.tableau = new double[capaciteInitiale];
        this.taille = 0;
    }

    // Méthode pour ajouter un double au tableau
    public void ajout(double valeur) {
        if (taille == tableau.length) {
            // Agrandir le tableau si nécessaire
            tableau = Arrays.copyOf(tableau, taille * 2);
        }
        tableau[taille++] = valeur;
    }

    // Méthode pour calculer la moyenne des éléments du tableau
    public double calcul() {
        if (taille == 0) {
            throw new IllegalArgumentException("Le tableau est vide");
        }
        double somme = 0;
        for (int i = 0; i < taille; i++) {
            somme += tableau[i];
        }
        return somme / taille;
    }
}
