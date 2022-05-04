package com.company;

import com.company.Person;

public class Besitzer extends Person {

    public Besitzer(int id, String name, String nachname,String telefonNummer) {
        super(id, name, nachname,telefonNummer);
    }
    public void editBesitzer(String name, String nachname,String email,String telefonNummer) {
        this.setName(name);
        this.setNachname(nachname);
        this.setName(email);
        this.setNachname(telefonNummer);
    }
}
