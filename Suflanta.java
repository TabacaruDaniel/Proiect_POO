package ProiectPOO;

public class Suflanta extends Aparat {

    private String denumire;
    private double putere;
    private float viteza_aer;
    private boolean are_aspirare;
    private int nivel_zgomot;
    private float greutate;
    private int autonomie_baterie;
    private String tip_alimentare;
    private String material_carcasa;
    private boolean functie_turbo;

    public Suflanta() {}

    public Suflanta(String denumire, double putere, float viteza_aer,
                    boolean are_aspirare, int nivel_zgomot, float greutate,
                    int autonomie_baterie, String tip_alimentare, String material_carcasa,
                    boolean functie_turbo) {

        this.denumire = denumire;
        this.putere = putere;
        this.viteza_aer = viteza_aer;
        this.are_aspirare = are_aspirare;
        this.nivel_zgomot = nivel_zgomot;
        this.greutate = greutate;
        this.autonomie_baterie = autonomie_baterie;
        this.tip_alimentare = tip_alimentare;
        this.material_carcasa = material_carcasa;
        this.functie_turbo = functie_turbo;
    }

    public Suflanta(Suflanta other) {
        this(other.denumire, other.putere, other.viteza_aer, other.are_aspirare,
             other.nivel_zgomot, other.greutate, other.autonomie_baterie,
             other.tip_alimentare, other.material_carcasa, other.functie_turbo);
    }

    public RezultatSuflanta sufla(float durata) {
        double curent = putere * (durata / 60);
        return new RezultatSuflanta(durata, curent, viteza_aer, durata);
    }

    @Override
    public void schimba_starea(Rezultat r) {
        curent -= r.curent_consumat;
        System.out.println("[SUFLANTA] " + denumire +
                " | consum: " + r.curent_consumat +
                " | curent total: " + curent);
    }

    @Override
    public void cost_mentenanta(Rezultat r) {
        System.out.println("Mentenanta suflanta: " + (r.curent_consumat * 0.03));
    }

    @Override
    public String toString() {
        return "Suflanta{" +
                "denumire='" + denumire + '\'' +
                ", putere=" + putere +
                ", viteza_aer=" + viteza_aer +
                ", are_aspirare=" + are_aspirare +
                ", nivel_zgomot=" + nivel_zgomot +
                ", greutate=" + greutate +
                ", autonomie_baterie=" + autonomie_baterie +
                ", tip_alimentare='" + tip_alimentare + '\'' +
                ", material_carcasa='" + material_carcasa + '\'' +
                ", functie_turbo=" + functie_turbo +
                '}';
    }
}
