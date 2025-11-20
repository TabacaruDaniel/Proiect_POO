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
                    int autonomie_baterie, String tip_alimentare,
                    String material_carcasa, boolean functie_turbo) {

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

    public Suflanta(Suflanta s1) {
        this(s1.denumire, s1.putere, s1.viteza_aer, s1.are_aspirare,
                s1.nivel_zgomot, s1.greutate, s1.autonomie_baterie,
                s1.tip_alimentare, s1.material_carcasa, s1.functie_turbo);
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getPutere() {
        return putere;
    }

    public void setPutere(double putere) {
        this.putere = putere;
    }

    public float getViteza_aer() {
        return viteza_aer;
    }

    public void setViteza_aer(float viteza_aer) {
        this.viteza_aer = viteza_aer;
    }

    public boolean isAre_aspirare() {
        return are_aspirare;
    }

    public void setAre_aspirare(boolean are_aspirare) {
        this.are_aspirare = are_aspirare;
    }

    public int getNivel_zgomot() {
        return nivel_zgomot;
    }

    public void setNivel_zgomot(int nivel_zgomot) {
        this.nivel_zgomot = nivel_zgomot;
    }

    public float getGreutate() {
        return greutate;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public int getAutonomie_baterie() {
        return autonomie_baterie;
    }

    public void setAutonomie_baterie(int autonomie_baterie) {
        this.autonomie_baterie = autonomie_baterie;
    }

    public String getTip_alimentare() {
        return tip_alimentare;
    }

    public void setTip_alimentare(String tip_alimentare) {
        this.tip_alimentare = tip_alimentare;
    }

    public String getMaterial_carcasa() {
        return material_carcasa;
    }

    public void setMaterial_carcasa(String material_carcasa) {
        this.material_carcasa = material_carcasa;
    }

    public boolean isFunctie_turbo() {
        return functie_turbo;
    }

    public void setFunctie_turbo(boolean functie_turbo) {
        this.functie_turbo = functie_turbo;
    }

    // ======================== METODE =============================

    @Override
    public void schimba_starea(Rezultat r) {
        curent -= r.curent_consumat;
        System.out.println("SUFLANTA " + denumire +
                "consum: " + r.curent_consumat +
                "curent total: " + curent);
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
