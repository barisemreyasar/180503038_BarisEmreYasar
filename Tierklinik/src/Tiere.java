public class Tiere {
    public String tierArt="";
    public String geschlecht="";
    public String alter="";
    public String gewicht="";
    public String aktuelleBeschwerde="";
    public Arzt  behandelnderArtz;
    private String chipNummer="";
    public Besitzer besitzer;

    public Besitzer getBesitzer(){
        return besitzer;
    }

    public void setBesitzer(Besitzer besitzer) {
        this.besitzer = besitzer;
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

    public Arzt getBehandelnderArtz() {
        return behandelnderArtz;
    }

    public void setBehandelnderArtz(Arzt behandelnderArtz) {
        this.behandelnderArtz = behandelnderArtz;
    }

    public String getChipNummer() {
        return chipNummer;
    }

    public void setChipNummer(String chipNummer) {
        this.chipNummer = chipNummer;
    }

    public Tiere(String tierArt, String geschlecht, String alter, String gewicht, String aktuelleBeschwerde, Arzt behandelnderArtz, String chipNummer, Besitzer besitzer) {
        this.tierArt = tierArt;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.gewicht = gewicht;
        this.aktuelleBeschwerde = aktuelleBeschwerde;
        this.behandelnderArtz = behandelnderArtz;
        this.chipNummer = chipNummer;
        this.besitzer=besitzer;
    }
}
