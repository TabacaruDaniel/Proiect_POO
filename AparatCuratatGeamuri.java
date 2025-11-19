package Proiect;
class AparatCuratatGeamuri extends Aparat{
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
        String aspirareStatus = functieAspirare ? "DA" : "NU";

        return "TipSolutieCuratare: " + tipSolutieCuratare +
                ", FunctieAspirare: " + aspirareStatus +
                ", AutonomieBaterie: " + autonomieBaterie +
                ", LatimeLaveta: " + latimeLaveta +
                ", MaterialLaveta: " + materialLaveta +
                ", TemperaturaMinimaFunctionare: " + temperaturaMinimaFunctionare +
                ", TimpIncarcare: " + timpIncarcare +
                ", NrAccesorii: " + nrAccesorii +
                ", CuloareLedStatus: " + CuloareLedStatus +
                ", TensiuneVibratie: " + tensiuneVibratie;
    }

    public void schimba_starea(Rezultat r) {
        // inversam starea functiei de aspirare
        // dacă era pornită devine oprită și invers
        functieAspirare = !functieAspirare;

        // construim mesajul pentru utilizator
        String mesaj = functieAspirare ? "pornită" : "oprită";

        // afisam starea curenta a aparatului
        System.out.println("Starea funcției de aspirare a aparatului cu soluția "
                + tipSolutieCuratare + " este acum " + mesaj + ".");
    }
    void cost_mentenanta(Rezultat r) {
        // calculam un cost simplificat pe baza autonomiei bateriei
        r.produs = autonomieBaterie * 2;

        // afisam costul pentru întretinerea aparatului
        System.out.println("Cheltuielile pentru întreținerea aparatului cu soluția "
                + tipSolutieCuratare + " se ridică la " + r.produs + " euro.");
    }

}