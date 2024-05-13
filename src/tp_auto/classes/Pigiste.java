package tp_auto.classes;

import tp_auto.classes.model.Intervenant;

public class Pigiste extends Intervenant {
    private int joursTravailles;
    private double montantJournalier;

    // Constructeur
    public Pigiste(String nom, String prenom, int joursTravailles, double montantJournalier) {
        super(nom, prenom);
        this.joursTravailles = joursTravailles;
        this.montantJournalier = montantJournalier;
    }

    // Méthode pour obtenir le salaire
    @Override
    public double getSalaire() {
        return joursTravailles * montantJournalier;
    }
}
