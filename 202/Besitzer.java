public class Besitzer extends Person{
    private String besitzerID="";

    ArrayList<Termin> termine = new ArrayList<>();


    public Besitzer(String besitzerID) {
        this.besitzerID = besitzerID;
    }
    public Besitzer(String BesitzerID,String name,String nachname, String email, String telefonNummer) {
        this.BesitzerID = BesitzerID;
        this.name= name;
        this.nachname= nachname;
        this.email= email;
        this.telefonNummer= telefonNummer;
    }

    public String getBesitzerID() {
        return besitzerID;
    }

    public void setBesitzerID(String besitzerID) {
        this.besitzerID = besitzerID;
    }

    public void addTermin(Termin t) {
        termine.add(t);
    }

    public void deleteTermin(Termin t) {
        termine.remove(searchTermin(t.getDatum(),t.getZeit()));
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

    public ArrayList<Termin> getTermine() {
        return termine;
    }

}
