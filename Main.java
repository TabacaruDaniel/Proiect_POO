abstract class aparat{
    static double curent=425;
    abstract public void schimba_starea(rezultat a);
    abstract void cost_mentenanta(rezultat c);
}
class rezultat{
    protected double produs;
    protected double curent_consumat;
    protected float[] stare_perii;
    protected float volum_ramas;
    protected double functionare_ramasa;
    public rezultat(double produs,double curent_consumat,float[] stare_perii, float volum_ramas, float functionare_ramasa){
        this.produs=produs;
        this.curent_consumat=curent_consumat;
        this.stare_perii=stare_perii;
        this.volum_ramas=volum_ramas;
        this.functionare_ramasa=functionare_ramasa;
    }
}

class AparatCuratatPardoseli extends aparat {
    String CodIdentificare;
    String producator;
    int putereWati;
    double greutateKg;
    String ClasaEnergetica;
    int anFabricatie;
    double pretEuro;
    int DurataGarantieLuni;
    boolean EsteDisponibil;
    String Culoare;

    AparatCuratatPardoseli(rezultat c) {
        CodIdentificare = "";
        producator = "";
        putereWati = 0;
        greutateKg = 0;
        ClasaEnergetica = "";
        anFabricatie = 0;
        pretEuro = 0;
        DurataGarantieLuni = 0;
        EsteDisponibil = false;
        Culoare = "";
    }

    AparatCuratatPardoseli(String CodIdentificare, String producator, int putereWati, double greutateKg, String ClasaEnergetica, int anFabricatie, double pretEuro, int DurataGarantieLuni, boolean EsteDisponibil, String Culoare) {
        this.CodIdentificare = CodIdentificare;
        this.producator = producator;
        this.putereWati = putereWati;
        this.greutateKg = greutateKg;
        this.ClasaEnergetica = ClasaEnergetica;
        this.anFabricatie = anFabricatie;
        this.pretEuro = pretEuro;
        this.DurataGarantieLuni = DurataGarantieLuni;
        this.EsteDisponibil = EsteDisponibil;
        this.Culoare = Culoare;
    }

    AparatCuratatPardoseli(AparatCuratatPardoseli altAparat) {
        this.CodIdentificare = altAparat.CodIdentificare;
        this.producator = altAparat.producator;
        this.putereWati = altAparat.putereWati;
        this.greutateKg = altAparat.greutateKg;
        this.ClasaEnergetica = altAparat.ClasaEnergetica;
        this.anFabricatie = altAparat.anFabricatie;
        this.pretEuro = altAparat.pretEuro;
        this.DurataGarantieLuni = altAparat.DurataGarantieLuni;
    }

    public String getCodIdentificare() {
        return CodIdentificare;
    }

   public void setCodIdentificare(String CodIdentificare) {
        this.CodIdentificare = CodIdentificare;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public int getPutereWati() {
        return putereWati;
    }

    public void setPutereWati(int putereWati) {
        this.putereWati = putereWati;
    }

    public double getGreutateKg() {
        return greutateKg;
    }

    public void setPutereKg(double greutateKg) {
        this.greutateKg = greutateKg;
    }

    public String getClasaEnergetica() {
        return ClasaEnergetica;
    }

    public void setClasaEnergetica(String ClasaEnergetica) {
        this.ClasaEnergetica = ClasaEnergetica;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public double getPretEuro() {
        return pretEuro;
    }

    public void setPretEuro(double pretEuro) {
        this.pretEuro = pretEuro;
    }

    public int getDurataGarantieLuni() {
        return DurataGarantieLuni;
    }

    public void DurataGarantieLuni(int DurataGarantieLuni) {
        this.DurataGarantieLuni = DurataGarantieLuni;
    }

    public boolean getEsteDisponibil() {
        return EsteDisponibil;
    }

    public void setEsteDisponibil(boolean EsteDisponibil) {
        this.EsteDisponibil = EsteDisponibil;
    }

    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String Culoare) {
        this.Culoare = Culoare;
    }

    @Override
    public String toString() {
        String s = "";
        return s + CodIdentificare + " " + producator + " " + putereWati + " " + greutateKg + " " + ClasaEnergetica + " " + anFabricatie + " " + pretEuro + " " + DurataGarantieLuni + " " + EsteDisponibil + " " + Culoare + " ";
    }
}
class AparatCuratatGeamuri extends aparat{
    private String tipSolutieCuratare;
    private boolean functieAspirare;
    int autonomieBaterie;
    double latimeLaveta;
    String materialLaveta;
    int temperaturaMinimaFunctionare;
    int timpIncarcare;
    int nrAccesorii;
    String CuloareLedStatus;
    double tensiuneVibratie;

    public AparatCuratatGeamuri(){
        tipSolutieCuratare = "";
        functieAspirare = false;
        autonomieBaterie = 0;
        latimeLaveta = 0;
        materialLaveta = "";
        temperaturaMinimaFunctionare = 0;
        timpIncarcare = 0;
        nrAccesorii = 0;
        CuloareLedStatus = "";
        tensiuneVibratie = 0;
    }
    public AparatCuratatGeamuri(String tipSolutieCuratare,boolean functieAspirare,int autonomieBaterie,double latimeLaveta
    ,String materialLaveta,int temperaturaMinimaFunctionare,int timpIncarcare,int nrAccesorii,String CuloareLedStatus,double tensiuneVibratie){
        this.tipSolutieCuratare = tipSolutieCuratare;
        this.functieAspirare = functieAspirare;
        this.autonomieBaterie = autonomieBaterie;
        this.latimeLaveta = latimeLaveta;
        this.materialLaveta = materialLaveta;
        this.temperaturaMinimaFunctionare = temperaturaMinimaFunctionare;
        this.timpIncarcare = timpIncarcare;
        this.nrAccesorii = nrAccesorii;
        this.CuloareLedStatus = CuloareLedStatus;
        this.tensiuneVibratie = tensiuneVibratie;
    }
    public AparatCuratatGeamuri(AparatCuratatGeamuri altAparat){
        this.tipSolutieCuratare = altAparat.tipSolutieCuratare;
        this.functieAspirare = altAparat.functieAspirare;
        this.autonomieBaterie = altAparat.autonomieBaterie;
        this.latimeLaveta = altAparat.latimeLaveta;
        this.materialLaveta = altAparat.materialLaveta;
        this.temperaturaMinimaFunctionare = altAparat.temperaturaMinimaFunctionare;
        this.timpIncarcare = altAparat.timpIncarcare;
        this.nrAccesorii = altAparat.nrAccesorii;
        this.CuloareLedStatus = altAparat.CuloareLedStatus;
        this.tensiuneVibratie = altAparat.tensiuneVibratie;
    }
    public String getTipSolutieCuratare() {
        return tipSolutieCuratare;
    }
    public void setTipSolutieCuratare(String tipSolutieCuratare) {
        this.tipSolutieCuratare = tipSolutieCuratare;
    }
    public boolean getFunctieAspirare() {
        return functieAspirare;
    }
    public void setFunctieAspirare(boolean functieAspirare) {
        this.functieAspirare = functieAspirare;
    }
    public int getAutonomieBaterie() {
        return autonomieBaterie;
    }
    public void setAutonomieBaterie(int autonomieBaterie) {
        this.autonomieBaterie = autonomieBaterie;
    }
    public double getLatimeLaveta() {
        return latimeLaveta;
    }
    public void setLatimeLaveta(double latimeLaveta) {
        this.latimeLaveta = latimeLaveta;
    }
    public String getMaterialLaveta() {
        return materialLaveta;
    }
    public void setMaterialLaveta(String materialLaveta) {
        this.materialLaveta = materialLaveta;
    }
    public int getTemperaturaMinimaFunctionare() {
        return temperaturaMinimaFunctionare;
    }
    public void setTemperaturaMinimaFunctionare(int temperaturaMinimaFunctionare) {
        this.temperaturaMinimaFunctionare = temperaturaMinimaFunctionare;
    }

    public double getTensiuneVibratie() {
        return tensiuneVibratie;
    }
    public void setTensiuneVibratie(double TensiuneVibratie) {
        this.tensiuneVibratie = TensiuneVibratie;
    }
    public int getNrAccesorii() {
        return nrAccesorii;
    }
    public void setNrAccesorii(int nrAccesorii) {
        this.nrAccesorii = nrAccesorii;
    }
    public String getCuloareLedStatus() {
        return CuloareLedStatus;
    }
    public void setCuloareLedStatus(String CuloareLedStatus) {
        this.CuloareLedStatus = CuloareLedStatus;
    }
    public int gettimpIncarcare() {
        return timpIncarcare;
    }
    public void settimpIncarcare(int timpIncarcare) {
        this.timpIncarcare = timpIncarcare;
    }
    @Override
    public String toString() {
        String aspirareStatus=functieAspirare?"DA":"NU";
        return super.toString()+"Tip:Geamuri,Solutie: "+tipSolutieCuratare+"Aspirare: "+aspirareStatus;
    }
}
    public class Main {
        public static void main(String[] args) {


        }
    }
