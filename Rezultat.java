package ProiectPOO;

public class Rezultat {
    protected double produs;            
    protected double curent_consumat;   

    public Rezultat(double produs, double curent_consumat) {
        this.produs = produs;
        this.curent_consumat = curent_consumat;
    }

    @Override
    public String toString() {
        return "Rezultat{" +
                "produs=" + produs +
                ", curent_consumat=" + curent_consumat +
                '}';
    }
}
