public class Person {
    private String id="";
    protected String name= "";
    protected String nachname= "";
    protected String email= "";
    protected String telefonNummer= "";

    public Person(String id, String name, String nachname, String email, String telefonNummer) {
        this.id = id;
        this.name = name;
        this.nachname = nachname;
        this.email = email;
        this.telefonNummer = telefonNummer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        this.telefonNummer = telefonNummer;
    }
}
