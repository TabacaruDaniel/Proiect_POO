

//neterminata





package poo1.aparat;

public class RezultatMotosapa extends rezultat {

    private double pamant_lucrat;
    private double timp_lucru;
    private float[] stare_perii;
    private float volum_ramas;
    double functionare_ramasa;


    public RezultatMotosapa(double produs, double curent_consumat,float[] stare_perii, float volum_ramas, double functionare_ramasa, double pamant_lucrat, double timp_lucru) {

        super(produs, curent_consumat);
        this.pamant_lucrat = pamant_lucrat;
        this.timp_lucru = timp_lucru;

 // de terminat co ul




        
    }

    @Override
    public String toString() {
        return "RezultatMotosapa: " + "produs=" + produs +", curent_consumat=" + curent_consumat + ", volum_ramas=" + volum_ramas +", functionare_ramasa=" + functionare_ramasa +  ", pamant_lucrat=" + pamant_lucrat +  ", timp_lucru=" + timp_lucru;
    }
}
