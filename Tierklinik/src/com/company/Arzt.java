package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Arzt extends Person{
    ArrayList<Termin> termine = new ArrayList<>();

    public Arzt(int id, String name, String nachname,String telefonNummer) {
        super(id, name, nachname,telefonNummer);
    }

    public void editArzt(String name, String nachname,String email,String telefonNummer) {
        this.setName(name);
        this.setNachname(nachname);
        this.setName(email);
        this.setNachname(telefonNummer);
    }

    public void addTermin(Termin t) {
        termine.add(t);
    }

    public ArrayList<Termin> getTermine() {
        return termine;
    }

    public Termin searchTermin(Date datum, LocalTime zeit) {
        Termin ter = new Termin(datum,zeit);
        for (Termin t : termine) {
            if (t.equals(ter)){
                return t;
            }
        }
        return null;
    }

    public static class Termin {
        private Date datum;
        private LocalTime zeit;

        public Termin(Date datum, LocalTime zeit) {
            this.datum = datum;
            this.zeit = zeit;
        }

        public Date getDatum() {
            return datum;
        }

        public LocalTime getZeit() {
            return zeit;
        }

        public void editTermin(Date datum) {
            this.datum = datum;
        }

        public void editTermin(LocalTime zeit) {
            this.zeit = zeit;
        }

        @Override
        public boolean equals(Object o) {
            Termin t = (Termin) o;
            if (o == this) {
                return true;
            }
            return this.datum.equals(t.datum) && this.zeit.equals(t.zeit);
        }
    }

    public static class Treatment {
        private Medikament medikament;
        private String notizen;

        public Treatment(Medikament m, String n) {
            this.medikament = m;
            this.notizen = n;
        }

        public void editMedikament(Medikament m) {
            this.medikament = m;
        }

        public void editNotizen(String n) {
            this.notizen = n;
        }

        public void addNotizen(String n) {
            this.notizen += " " + n;
        }
    }
}
