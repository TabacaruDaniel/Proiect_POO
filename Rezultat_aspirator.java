package ProiectPOO;

class Rezultat_aspirator extends Rezultat{
    protected float stare_filtru;
    protected float volum_liber;
    public Rezultat_aspirator(double produs,double curent_consumat,float stare_filtru, float volum_liber){
        super(produs,curent_consumat);
        this.stare_filtru=stare_filtru;
        this.volum_liber=volum_liber;
    }
}
