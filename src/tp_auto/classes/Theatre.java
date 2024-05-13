package tp_auto.classes;
public class Theatre {
    private final int capaciteMax;
    private int totalClientsInscrits;
    private double recetteTotale;

    // Constructeur
    public Theatre(String nom, int capaciteMax) {
        this.capaciteMax = capaciteMax;
        this.totalClientsInscrits = 0;
        this.recetteTotale = 0.0;
    }

    // Méthode pour inscrire des clients
    public void inscrire(int nombreClients, double prixPlace) {
        if (totalClientsInscrits + nombreClients <= capaciteMax) {
            totalClientsInscrits += nombreClients;
            recetteTotale += nombreClients * prixPlace;
        } else {
            System.out.println("Capacité maximale atteinte. Impossible d'inscrire plus de clients.");
        }
    }

    // Getters pour les attributs
    public int getTotalClientsInscrits() {
        return totalClientsInscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}