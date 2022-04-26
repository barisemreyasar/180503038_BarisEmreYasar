import java.util.ArrayList;

public class Tierklinik {
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

    public void deleteArzt(String id) {
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

    public Arzt searchArzt(String id) {
        for (Arzt arzt : arzte) {
            if (arzt.getId() == id) {
                return arzt;
            }
        }
        return null;
    }
}
