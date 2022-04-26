public class Treatment {
    private Medikament medikament;
    private String notizen;

    public Treatment(Medikament m, String n) {
        this.medikament = m;
        this.notizen = n;
    }

    public void editMedikament(Medikament m) {
        this.medikament = m;
    }

    public void editNotizen(String n) {
        this.notizen = n;
    }

    public void addNotizen(String n) {
        this.notizen += " " + n;
    }
}
