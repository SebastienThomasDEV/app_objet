package java_obj_entities;

public class Person {
    public String firstName;
    public String surName;
    public AdressePostale adressePostale;

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
    }

    public Person(String firstName, String surName, AdressePostale adr) {
        this(firstName, surName);
        this.adressePostale = adr;
    }

    public void show() {
        System.out.println("Le nom: " + this.firstName);
        System.out.println("\n");
        System.out.println("Le prénom: " + this.surName);
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }
}
