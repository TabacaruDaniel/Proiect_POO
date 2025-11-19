package Proiect;

public class RezultatAparatCuratatGeamuri extends AparatCuratatGeamuri{
    protected double produs;
    protected double curent_consumat;;
    protected float volum_ramas;
    protected double functionare_ramasa;
    public RezultatAparatCuratatGeamuri(double produs,double curent_consumat, float volum_ramas, float functionare_ramasa){
        this.produs=produs;
        this.curent_consumat=curent_consumat;
        this.volum_ramas=volum_ramas;
        this.functionare_ramasa=functionare_ramasa;
    }
}
