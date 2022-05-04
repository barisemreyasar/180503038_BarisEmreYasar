package com.company;

public class Person {
    private int id;
    protected String name= "";
    protected String nachname= "";
    protected String telefonNummer= "";

    public Person(int id, String name, String nachname,String telefonNummer) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.telefonNummer = telefonNummer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }
}
