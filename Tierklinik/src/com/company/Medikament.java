package com.company;

import java.util.ArrayList;

public class Medikament {
    private final int id;
    private String name;
    private float kost;

    public Medikament(int id, String name, float kost) {
        this.id = id;
        this.name = name;
        this.kost = kost;
    }

    public int getId() {
        return id;
    }

    public void editMedikament(float kost) {
        this.kost = kost;
    }

    public void editMedikament(String name) {
        this.name = name;
    }

    public static class Tierklinik {
        private final ArrayList<Medikament> medikamente = new ArrayList<>();
        private final ArrayList<Tiere> tiere = new ArrayList<>();
        private final ArrayList<Arzt> arzte = new ArrayList<>();

        public void addMedikament(int id, String name, float kost) {
            medikamente.add(new Medikament(id, name, kost));

        }

        public void deleteMedikament(int id) {
            for (Medikament meds : medikamente) {
                if (meds.getId() == id) {
                    medikamente.remove(meds);
                    return;
                }
            }
        }

        public void addTiere(Tiere t) {
            tiere.add(t);
        }

        public void deleteTiere(String id) {
            tiere.remove(this.searchTiere(id));
        }

        public void addArzt(Arzt a) {
            arzte.add(a);
        }

        public void deleteArzt(int id) {
            arzte.remove(this.searchArzt(id));
        }

        public Tiere searchTiere(String cn) {
            for (Tiere t : tiere) {
                if (t.getChipNummer() == cn) {
                    return t;
                }
            }
            return null;
        }

        public Arzt searchArzt(int id) {
            for (Arzt arzt : arzte) {
                if (arzt.getId() == id) {
                    return arzt;
                }
            }
            return null;
        }
    }
}
