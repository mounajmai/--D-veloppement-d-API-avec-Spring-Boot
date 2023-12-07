package com.gestion.immobiliere.demo.entity;

public class Owner {

    private long id;
    private String name;
    private String contactInformation;

    public Owner() {
        // Constructeur par défaut
        this.id = 0; // ou une valeur par défaut appropriée
        this.name = "";
        this.contactInformation = "";
    }

    public Owner(long id, String name, String contactInformation) {
        this.id = id;
        this.name = name;
        this.contactInformation = contactInformation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }
}
