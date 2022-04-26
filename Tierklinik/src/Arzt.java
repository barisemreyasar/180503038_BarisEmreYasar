import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Arzt extends Person{
    ArrayList<Termin> termine = new ArrayList<>();

    public Arzt(String id, String name, String nachname, String email, String telefonNummer) {
        super(id, name, nachname, email,telefonNummer);
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
}
