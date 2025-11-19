package poo1.aparat;

public class RezultatTunsIarba extends rezultat {

    private double iarba_taiata;
    private double timp_folosit;

    public RezultatTunsIarba(double produs, double curent_consumat,
                             float[] stare_perii, float volum_ramas,
                             double functionare_ramasa,
                             double iarba_taiata, double timp_folosit) {

        super(produs, curent_consumat, stare_perii, volum_ramas, functionare_ramasa);
        this.iarba_taiata = iarba_taiata;
        this.timp_folosit = timp_folosit;
    }

    @Override
    public String toString() {
        return "RezultatTunsIarba{" +
                "produs=" + produs +
                ", curent_consumat=" + curent_consumat +
                ", volum_ramas=" + volum_ramas +
                ", functionare_ramasa=" + functionare_ramasa +
                ", iarba_taiata=" + iarba_taiata +
                ", timp_folosit=" + timp_folosit +
                '}';
    }
}
