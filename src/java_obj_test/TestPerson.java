package java_obj_test;

import java_obj_entities.AdressePostale;
import java_obj_entities.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Sebastien", "THOMAS");
        Person person2 = new Person("Victor", "MARTIN");
        Person person3 = new Person("Nicolas", "Soulay", new AdressePostale(
                34,
                "rue de Préfecture",
                34000,
                "Montpellier"
        ));
        AdressePostale[] adrs = TestAdressePostale.create();
        person1.adressePostale = adrs[0];
        person2.adressePostale = adrs[1];
        // écrase l'ancienne adresse
        person1.setAdressePostale(adrs[1]);
        System.out.println(person1.adressePostale.codePostal);
        System.out.println(person2.adressePostale.codePostal);

    }


}
