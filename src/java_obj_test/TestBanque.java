package java_obj_test;

import java_obj_banque.entities.Compte;
import java_obj_banque.entities.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(12312313, 374.7);
        CompteTaux compte2 = new CompteTaux(12312313, 374.7, 0.7);
        Compte[] comptes = new Compte[]{compte1, compte2};
        for (int i = 0; i < comptes.length; i++) {
            System.out.println(comptes[i]);
        }
//        System.out.println(comptes);
    }
}
