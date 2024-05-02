package java_obj_entities;

public class Person {
    public String name;
    public String surname;

    public AdressePostale adressePostale;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, AdressePostale adr) {
        this(name, surname);
        this.name = name;
        this.surname = surname;
    }
}
