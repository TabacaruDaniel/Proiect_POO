package ProiectPOO;

class Rezultat_masina_fum extends Rezultat{
    protected float[] stare_leduri;
    protected float volum_ramas;
    protected double functionare_ramasa;
    public Rezultat_masina_fum(double produs,double curent_consumat,float[] stare_leduri, float volum_ramas, float functionare_ramasa){
        super(produs,curent_consumat);
        this.stare_leduri=stare_leduri;
        this.volum_ramas=volum_ramas;
        this.functionare_ramasa=functionare_ramasa;
    }
}