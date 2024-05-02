package java_obj_test;

import java_obj_banque.entities.*;

import java.util.Date;
import java.util.Objects;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(12312313, 374.7);
        CompteTaux compte2 = new CompteTaux(12312313, 374.7, 0.7);
        Compte[] comptes = new Compte[]{compte1, compte2};
        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
        Operation[] debits = {
                new Debit(new Date(), 3.4),
                new Debit(new Date(), 25),
                new Debit(new Date(), 18),
                new Debit(new Date(), 12)
        };
        Operation[] credits = {
                new Credit(new Date(), 3.4),
                new Credit(new Date(), 25),
                new Credit(new Date(), 18),
                new Credit(new Date(), 12)
        };
        double result = 0;
        for (Operation operation : debits) {
            System.out.println(operation);
            if (Objects.equals(operation.getType(), "CREDIT")) {
                result += operation.amount;
            } else {
                result -= operation.amount;
            }
        }
        System.out.println(result);
//        System.out.println(comptes);
    }
}
