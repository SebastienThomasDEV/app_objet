package tp_auto.classes.model;

public abstract class Intervenant {
    protected String nom;
    protected String prenom;

    // Constructeur
    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Méthode abstraite
    public abstract double getSalaire();

    // Méthode pour afficher les données de l'intervenant
    public void afficherDonnees() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Salaire : " + getSalaire());
        System.out.println("Statut : " + getClass().getSimpleName());
    }
}
