package ProiectPOO;

class Rezultat{
    protected double produs;
    protected double curent_consumat;
    protected double functionare_ramasa;
    public Rezultat(double produs,double curent_consumat){
        this.produs=produs;
        this.curent_consumat=curent_consumat;
        this.functionare_ramasa-=produs;
    }
}