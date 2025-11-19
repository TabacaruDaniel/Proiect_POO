package ProiectPOO;

public class AparatSpalarePresiune extends Aparat {

    private String denumire;
    private double putere;
    private float presiune;
    private float debit;
    private float volum_rezervor;
    private float volum_curent;
    private int lungime_cablu;
    private boolean are_roti;
    private String tip_motor;
    private int nivel_zgomot;

    public AparatSpalarePresiune() {}

    public AparatSpalarePresiune(String denumire, double putere, float presiune, float debit,
                                 float volum_rezervor, float volum_curent,
                                 int lungime_cablu, boolean are_roti,
                                 String tip_motor, int nivel_zgomot) {

        this.denumire = denumire;
        this.putere = putere;
        this.presiune = presiune;
        this.debit = debit;
        this.volum_rezervor = volum_rezervor;
        this.volum_curent = volum_curent;
        this.lungime_cablu = lungime_cablu;
        this.are_roti = are_roti;
        this.tip_motor = tip_motor;
        this.nivel_zgomot = nivel_zgomot;
    }

    public AparatSpalarePresiune(AparatSpalarePresiune other) {
        this(other.denumire, other.putere, other.presiune, other.debit,
             other.volum_rezervor, other.volum_curent, other.lungime_cablu,
             other.are_roti, other.tip_motor, other.nivel_zgomot);
    }

    public RezultatSpalare spala(float suprafata) {
        double timp = suprafata / 10;
        double curent = putere * (timp / 60);
        float volum_folosit = (float)(suprafata * 0.25);
        float volum_ramas = volum_curent - volum_folosit;

        return new RezultatSpalare(suprafata, curent, volum_folosit, volum_ramas, timp);
    }

    @Override
    public void schimba_starea(Rezultat r) {
        curent -= r.curent_consumat;
        System.out.println("[ASP] " + denumire +
                " | consum: " + r.curent_consumat +
                " | curent total: " + curent);
    }

    @Override
    public void cost_mentenanta(Rezultat r) {
        System.out.println("Mentenanta ASP: " + (r.curent_consumat * 0.05));
    }

    @Override
    public String toString() {
        return "AparatSpalarePresiune{" +
                "denumire='" + denumire + '\'' +
                ", putere=" + putere +
                ", presiune=" + presiune +
                ", debit=" + debit +
                ", volum_rezervor=" + volum_rezervor +
                ", volum_curent=" + volum_curent +
                ", lungime_cablu=" + lungime_cablu +
                ", are_roti=" + are_roti +
                ", tip_motor='" + tip_motor + '\'' +
                ", nivel_zgomot=" + nivel_zgomot +
                '}';
    }
}
