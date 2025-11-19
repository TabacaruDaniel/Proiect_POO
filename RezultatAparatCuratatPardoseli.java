package Proiect;

public class RezultatAparatCuratatPardoseli extends AparatCuratatPardoseli{
    protected double produs;
    protected double curent_consumat;;
    protected float volum_ramas;
    protected double functionare_ramasa;
    public RezultatAparatCuratatPardoseli(double produs,double curent_consumat, float volum_ramas, float functionare_ramasa){
        this.produs=produs;
        this.curent_consumat=curent_consumat;
        this.volum_ramas=volum_ramas;
        this.functionare_ramasa=functionare_ramasa;
    }
}
