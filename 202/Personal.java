public class Personal extends Person {
    private String personalID="";

    public Personal(String personalID) {
        this.personalID = personalID;
    }
    public Personal(String personalID,String name,String nachname, String email, String telefonNummer){
        this.personalID= personalID;
        this.name= name;
        this.nachname= nachname;
        this.email= email;
        this.telefonNummer= telefonNummer;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
    }
}
