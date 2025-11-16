package ProiectPOO;
import javax.swing.JOptionPane;
class Aspirator extends Aparat {
    private String denumire;
    private float productivitate;
    private float alimentare;
    private int calitate_filtru;
    private float stare_filtru;
    private float capacitate_sac;
    private float volum_curent;
    private double garantie_de_functionare;
    private double functionare_ramasa;
    private float pret;
    //float putere_totala;
    //float rotatie_perie;
    //loat viteza_deplasare;
    //float[] dimemsiuni;
    public void schimba_starea(Rezultat a) {
        Rezultat_aspirator b=(Rezultat_aspirator)a;
        JOptionPane.showMessageDialog(null,"In urma utilizarii aparatului " + denumire + " aparatul a curatat " + b.produs + " metri patrati de suprafata\n" +
                " in consecinta s-a consumat " + b.curent_consumat + "kW \nIn sac au ramas liberi " + b.volum_liber + "l");
        curent -= b.curent_consumat;
        volum_curent = b.volum_liber;
        stare_filtru = b.stare_filtru;
        functionare_ramasa -= b.produs;
    }

    public void cost_mentenanta(Rezultat c) {
        Rezultat_aspirator a=(Rezultat_aspirator)c;
        if(curent-a.curent_consumat<=0) {
            curent=Double.parseDouble(JOptionPane.showInputDialog("Aspiratorul s-a oprit din cauza epuizarii sursei de alimentare, introduceti valoarea de curent pe care doriti sa o adaugati"));
            JOptionPane.showMessageDialog(null,"Pretul pentru aprovizionarea facuta este de "+curent+" pret de 1 leu per kW");
        }
        if(a.volum_liber==0) {
            JOptionPane.showMessageDialog(null,"Aspiratorul s-a oprit din cauza ca sacul s-a umplut\nCostul pentru a achizitiona un sac nou este de 10 lei");
            volum_curent =capacitate_sac;
        }
        if(a.stare_filtru==0) {JOptionPane.showMessageDialog(null,"Aspiratorul s-a oprit din cauza ca filtrul s-a uzat prea tare, pentru a pastra garantia de functionare a aspiratorului este necesara schimbarea acestuia\nCostul pentru a achizitiona un filtru nou este de 65 lei");
        stare_filtru=calitate_filtru;
        }
        if(a.functionare_ramasa==0) {
            JOptionPane.showMessageDialog(null,"Aspiratorul s-a oprit din cauza ca piesele acestuia au inregistrat uzuri peste masura este necesara repararea\nCostul estimativ pentru reparatii este de "+pret/4);
            functionare_ramasa=garantie_de_functionare/8;
        }
    }

    /*
    public double calcul_curent_consumat(float cerinta){
        double consum=alimentare*(cerinta/productivitate);
        return consum;
    }
     */
    public Aspirator(Aspirator a) {
        this.pret=a.pret;
        this.functionare_ramasa=a.functionare_ramasa;
        this.calitate_filtru = a.calitate_filtru;
        this.capacitate_sac = a.capacitate_sac;
        this.denumire = a.denumire;
        this.productivitate = a.productivitate;
        this.alimentare = a.alimentare;
        this.stare_filtru = a.stare_filtru;
        this.volum_curent = a.volum_curent;
        this.garantie_de_functionare = a.garantie_de_functionare;
    }

    public Rezultat pornire(float cerinta) {//neterminata
        double moment_oprire;
        double consum = alimentare * (cerinta / productivitate);
//        float[] vector=new float[stare_perii.length];
//        int cont=0;
//        for(float i:stare_perii){
//            vector[cont++]=i;
//        }
//        for(int i=0;i< vector.length;i++)
//        {
//            if(vector[i]>(cerinta/productivitate))
//                vector[i]-=cerinta/productivitate;
//            else return null;
//        }
        if (consum < curent) moment_oprire=1;
        else {
            moment_oprire=curent/consum;
            JOptionPane.showMessageDialog(null,"oprire fortata cauzata de energia insuficienta");
        }
        if(cerinta < functionare_ramasa) moment_oprire=1;
        else {
            moment_oprire=functionare_ramasa/cerinta;
            JOptionPane.showMessageDialog(null,"oprire fortata cauzata de nivelul de uzura prea mare asupra pieselor");
        }
        if(stare_filtru> (cerinta/productivitate)) moment_oprire=1;
        else {
            JOptionPane.showMessageDialog(null,"oprire fortata cauzata de energia insuficienta");
            moment_oprire=stare_filtru*productivitate/cerinta;
        }
        if(volum_curent>(cerinta/productivitate)*3) moment_oprire=1;//la o ora de functionare sacul se umple cam 3 litri
        else moment_oprire=(volum_curent*productivitate)/(3*cerinta);
        Rezultat_aspirator rez=new Rezultat_aspirator(moment_oprire*cerinta,moment_oprire*consum, (float) (stare_filtru-((moment_oprire*cerinta)/productivitate)), (float) (volum_curent-((moment_oprire*cerinta)/productivitate)*3));
        return rez;

    }

    Aspirator() {//neterminata (constructor implicit)
        denumire = "";
        productivitate = 0;
        alimentare = 0;
        stare_filtru = 0;
        volum_curent = 0;
        garantie_de_functionare = 0;
    }

    Aspirator(String denumire, float productivitate, float alimentare, int calitate_filtru, float stare_filtru, float capacitate_sac, float volum_curent, double garantie_de_functionare) {
        this.denumire = denumire;
        this.productivitate = productivitate;
        this.alimentare = alimentare;
        this.calitate_filtru = calitate_filtru;
        this.stare_filtru = stare_filtru;
        this.capacitate_sac = capacitate_sac;
        this.volum_curent = volum_curent;
        this.garantie_de_functionare = garantie_de_functionare;
    }

    public String toString() {
        return denumire + " " + productivitate + " " + alimentare + " " + calitate_filtru + " " + stare_filtru + " "
                + capacitate_sac + " " + volum_curent + " " + garantie_de_functionare;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getProductivitate() {
        return productivitate;
    }

    public float getAlimentare() {
        return alimentare;
    }

    public int getCalitate_filtru() {
        return calitate_filtru;
    }

    public float getStare_filtru() {
        return stare_filtru;
    }

    public float getCapacitate_sac() {
        return capacitate_sac;
    }

    public float getVolum_curent() {
        return volum_curent;
    }

    public double getGarantie_de_functionare() {
        return garantie_de_functionare;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setProductivitate(float productivitate) {
        this.productivitate = productivitate;
    }

    public void setAlimentare(float alimentare) {
        this.alimentare = alimentare;
    }

    public void setCalitate_filtru(int calitate_filtru) {
        this.calitate_filtru = calitate_filtru;
    }

    public void setStare_filtru(float stare_filtru) {
        this.stare_filtru = stare_filtru;
    }

    public void setCapacitate_sac(float capacitate_sac) {
        this.capacitate_sac = capacitate_sac;
    }

    public void setVolum_curent(float volum_curent) {
        this.volum_curent = volum_curent;
    }

    public void setGarantie_de_functionare(double garantie_de_functionare) {
        this.garantie_de_functionare = garantie_de_functionare;

    }
}
