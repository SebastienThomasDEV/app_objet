package java_obj_test;

import java_obj_entities.AdressePostale;

public class TestAdressePostale {
    public static AdressePostale[] create() {
        AdressePostale adressePostale = new AdressePostale(
                30,
                "rue du Marché",
                34070,
                "Montpellier"
        );
        AdressePostale adressePostale2 = new AdressePostale(
                34,
                "rue de l'Université",
                34000,
                "Montpellier"
        );
        return new AdressePostale[]{adressePostale, adressePostale2};

    }
}
