package java_obj_test;

import java_obj_entities.AdressePostale;
import java_obj_entities.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Sebastien", "THOMAS");
        Person person2 = new Person("Victor", "MARTIN");
        AdressePostale[] adrs = TestAdressePostale.create();
        person1.adressePostale = adrs[0];
        person2.adressePostale = adrs[1];

        System.out.println(person1.adressePostale.codePostal);
        System.out.println(person2.adressePostale.codePostal);

    }
}
