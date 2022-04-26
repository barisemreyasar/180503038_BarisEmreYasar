public class Medikament {
    private final int id;
    private String name;
    private float kost;

    public Medikament(int id, String name, float kost) {
        this.id = id;
        this.name = name;
        this.kost = kost;
    }

    public int getId() {
        return id;
    }

    public void editMedikament(float kost) {
        this.kost = kost;
    }

    public void editMedikament(String name) {
        this.name = name;
    }
}
