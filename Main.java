abstract class Aparat {
    private String CodIdentificare;
    private String producator;
    private int putereWati;
    private double greutateKg;
    private String ClasaEnergetica;
    private int anFabricatie;
    private double pretEuro;
    private int DurataGarantieLuni;
    private boolean EsteDisponibil;
    private String Culoare;

    public Aparat(){
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
    public Aparat(String CodIdentificare, String producator, int putereWati,double greutateKg,String ClasaEnergetica,int anFabricatie,double pretEuro,int DurataGarantieLuni, boolean EsteDisponibil,String Culoare){
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
    public Aparat(Aparat altAparat){
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
    public String getProducator(){
        return producator;
    }
    public void setProducator(String producator){
        this.producator=producator;
    }
    public int getPutereWati(){
        return putereWati;
    }
    public void setPutereWati(int putereWati){
        this.putereWati=putereWati;
    }
    public double getGreutateKg(){
        return greutateKg;
    }
    public void setPutereKg(double greutateKg){
        this.greutateKg=greutateKg;
    }
    public String getClasaEnergetica(){
        return ClasaEnergetica;
    }
    public void setClasaEnergetica(String ClasaEnergetica){
        this.ClasaEnergetica=ClasaEnergetica;
    }
    public int getAnFabricatie(){
        return anFabricatie;
    }
    public void setAnFabricatie(int anFabricatie){
        this.anFabricatie=anFabricatie;
    }
    public double getPretEuro(){
        return pretEuro;
    }
    public void setPretEuro(double pretEuro){
        this.pretEuro=pretEuro;
    }
    public int getDurataGarantieLuni(){
        return DurataGarantieLuni;
    }
    public void DurataGarantieLuni(int DurataGarantieLuni){
        this.DurataGarantieLuni=DurataGarantieLuni;
    }
    public boolean getEsteDisponibil(){
        return EsteDisponibil;
    }
    public void setEsteDisponibil(boolean EsteDisponibil){
        this.EsteDisponibil=EsteDisponibil;
    }
    public String getCuloare(){
        return Culoare;
    }
    public void setCuloare(String Culoare){
        this.Culoare=Culoare;
    }
    @Override
    public String toString(){
        String s="";
        return s+CodIdentificare+" "+ producator+" "+putereWati+" "+greutateKg+" "+ClasaEnergetica+" "+anFabricatie+" "+pretEuro+" "+DurataGarantieLuni+" "+EsteDisponibil+" "+Culoare+" ";
    }
}
class AparatCuratatPardoseli extends Aparat{
    private String tipPerie;
    private double CapacitateLitri;
    public AparatCuratatPardoseli() {
        super();
        tipPerie = " ";
        CapacitateLitri = 0.0;
    }
    public AparatCuratatPardoseli(String CodIdentificare,String producator,int putereWati,double greutateKg,String ClasaEnergetica,int anFabricatie,double pretEuro,int DurataGarantieLuni,boolean EsteDisponibil,String Culoare, String tipPerie, double CapacitateLitri) {
        super(CodIdentificare,producator,putereWati,greutateKg,ClasaEnergetica,anFabricatie,pretEuro,DurataGarantieLuni,EsteDisponibil,Culoare);
        this.tipPerie = tipPerie;
        this.CapacitateLitri = CapacitateLitri;
    }
    public AparatCuratatPardoseli(AparatCuratatPardoseli altAparat){
        super(altAparat);//copiaza campurile din superclasa
        this.tipPerie = altAparat.tipPerie;
        this.CapacitateLitri=altAparat.CapacitateLitri;
    }
    public String getTipPerie() {
        return tipPerie;
    }
    public void setTipPerie(String tipPerie) {
        this.tipPerie = tipPerie;
    }
    public double getCapacitateLitri() {
        return CapacitateLitri;
    }
    public void setCapacitateLitri(double capacitateLitri) {
        this.CapacitateLitri = capacitateLitri;
    }
    @Override
    public String toString() {
        return super.toString() +"Tip:Parsdoseli: ,tip perie: "+tipPerie+",CapacitateLitri: "+CapacitateLitri+"L";
    }
}
class AparatCuratatGeamuri extends Aparat{
    private String tipSolutieCuratare;
    private boolean functieAspirare;
    public AparatCuratatGeamuri(){
        super();
        this.tipSolutieCuratare = "";
        this.functieAspirare = false;
    }
    public AparatCuratatGeamuri(String CodIdentificare,String producator,int putereWati,double greutateKg,String ClasaEnergetica,int anFabricatie ,double pretEuro,int DurataGarantieLuni,boolean EsteDisponibil,String Culoare,String tipSolutieCuratare,boolean functieAspirare){
        super(CodIdentificare,producator,putereWati,greutateKg,ClasaEnergetica,anFabricatie ,pretEuro,DurataGarantieLuni,EsteDisponibil,Culoare) ;
        this.tipSolutieCuratare = tipSolutieCuratare;
        this.functieAspirare = functieAspirare;
    }
    public AparatCuratatGeamuri(AparatCuratatGeamuri altAparat){
        super(altAparat);
        this.tipSolutieCuratare = altAparat.tipSolutieCuratare;
        this.functieAspirare = altAparat.functieAspirare;
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
    @Override
    public String toString() {
        String aspirareStatus=functieAspirare?"DA":"NU";
        return super.toString()+"Tip:Geamuri,Solutie: "+tipSolutieCuratare+"Aspirare: "+aspirareStatus;
    }
}