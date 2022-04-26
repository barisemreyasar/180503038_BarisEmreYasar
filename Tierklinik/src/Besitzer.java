import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Besitzer extends Person{

    public Besitzer(String id, String name, String nachname, String email, String telefonNummer) {
        super(id, name, nachname, email, telefonNummer);
    }
    public void editBesitzer(String name, String nachname,String email,String telefonNummer) {
        this.setName(name);
        this.setNachname(nachname);
        this.setName(email);
        this.setNachname(telefonNummer);
    }
}
