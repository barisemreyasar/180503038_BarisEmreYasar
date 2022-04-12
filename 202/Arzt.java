public class Arzt extends Person{
    ArrayList<Termin> termine = new ArrayList<>();
    private String arztID="";

    public Arzt(String arztID) {
        this.arztID = arztID;
    }
    public Arzt(String arztID,String name,String nachname, String email, String telefonNummer) {
        this.arztID = arztID;
        this.name= name;
        this.nachname= nachname;
        this.email= email;
        this.telefonNummer= telefonNummer;
    }

    public String getArztID() {
        return arztID;
    }

    public void setArztID(String arztID) {
        this.arztID = arztID;
    }

    public void addTermin(Termin t) {
        termine.add(t);
    }

    public ArrayList<Termin> getTermine() {
        return termine;
    }
}
