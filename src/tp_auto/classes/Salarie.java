package tp_auto.classes;

import tp_auto.classes.model.Intervenant;

public class Salarie extends Intervenant {
    private double salaireMensuel;

    // Constructeur
    public Salarie(String nom, String prenom, double salaireMensuel) {
        super(nom, prenom);
        this.salaireMensuel = salaireMensuel;
    }

    // Méthode pour obtenir le salaire
    @Override
    public double getSalaire() {
        return salaireMensuel;
    }

    // Getters et setters (non inclus pour la concision)
}