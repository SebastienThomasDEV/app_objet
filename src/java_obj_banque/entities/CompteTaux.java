package java_obj_banque.entities;

public class CompteTaux extends Compte {

    double tauxRemuneration;

    public CompteTaux(int accountNumber, double solde, double tauxRemuneration) {
        super(accountNumber, solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() + "\ntauxRemuneration=" + tauxRemuneration;
    }
}
