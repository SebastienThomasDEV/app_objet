package java_obj_banque.entities;

public class Compte {
    int accountNumber;
    double solde;

    public Compte(int accountNumber, double solde) {
        this.accountNumber = accountNumber;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "\naccountNumber=" + accountNumber
                + "\nsolde=" + solde;
    }
}
