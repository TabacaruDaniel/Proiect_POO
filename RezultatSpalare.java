package ProiectPOO;

public class RezultatSpalare extends Rezultat {

    protected float volum_folosit;
    protected float volum_ramas;
    protected double timp;

    public RezultatSpalare(double suprafata, double curent_consumat,
                           float volum_folosit, float volum_ramas, double timp) {
        super(suprafata, curent_consumat);
        this.volum_folosit = volum_folosit;
        this.volum_ramas = volum_ramas;
        this.timp = timp;
    }

    @Override
    public String toString() {
        return "RezultatSpalare{" +
                "suprafata=" + produs +
                ", curent_consumat=" + curent_consumat +
                ", volum_folosit=" + volum_folosit +
                ", volum_ramas=" + volum_ramas +
                ", timp=" + timp +
                '}';
    }
}
