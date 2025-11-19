package ProiectPOO;

public class RezultatSuflanta extends Rezultat {

    protected float viteza_medie;
    protected double timp;

    public RezultatSuflanta(double durata, double curent_consumat,
                            float viteza_medie, double timp) {
        super(durata, curent_consumat);
        this.viteza_medie = viteza_medie;
        this.timp = timp;
    }

    @Override
    public String toString() {
        return "RezultatSuflanta{" +
                "durata=" + produs +
                ", curent_consumat=" + curent_consumat +
                ", viteza_medie=" + viteza_medie +
                ", timp=" + timp +
                '}';
    }
}
