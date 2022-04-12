public class Tiere {
    public String tierArt="";
    public String geschlecht="";
    public String alter="";
    public String gewicht="";
    public String aktuelleBeschwerde="";
    public String  behandelnderArtz="";
    private String chipNummer="";

    public Tiere(String chipNummer) {
        this.chipNummer = chipNummer;
    }

    public Tiere(String tierArt, String geschlecht, String alter, String gewicht, String aktuelleBeschwerde, String behandelnderArtz, String chipNummer) {
        this.tierArt = tierArt;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.gewicht = gewicht;
        this.aktuelleBeschwerde = aktuelleBeschwerde;
        this.behandelnderArtz = behandelnderArtz;
        this.chipNummer = chipNummer;
    }

    public String getTierArt() {
        return tierArt;
    }

    public void setTierArt(String tierArt) {
        this.tierArt = tierArt;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getGewicht() {
        return gewicht;
    }

    public void setGewicht(String gewicht) {
        this.gewicht = gewicht;
    }

    public String getAktuelleBeschwerde() {
        return aktuelleBeschwerde;
    }

    public void setAktuelleBeschwerde(String aktuelleBeschwerde) {
        this.aktuelleBeschwerde = aktuelleBeschwerde;
    }

    public String getBehandelnderArtz() {
        return behandelnderArtz;
    }

    public void setBehandelnderArtz(String behandelnderArtz) {
        this.behandelnderArtz = behandelnderArtz;
    }

    public String getChipNummer() {
        return chipNummer;
    }

    public void setChipNummer(String chipNummer) {
        this.chipNummer = chipNummer;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tiere{" +
                "tierArt='" + tierArt + '\'' +
                ", geschlecht='" + geschlecht + '\'' +
                ", alter='" + alter + '\'' +
                ", gewicht='" + gewicht + '\'' +
                ", aktuelleBeschwerde='" + aktuelleBeschwerde + '\'' +
                ", behandelnderArtz='" + behandelnderArtz + '\'' +
                ", chipNummer='" + chipNummer + '\'' +
                '}';
    }
}
