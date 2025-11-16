package ProiectPOO;

class Masina_de_fum extends Aparat {
    private String denumire;
    private float productivitate;
    private float capacitate_baterie;
    private float nivel_baterie;
    private float sanatate_baterie;
    private int numar_leduri;
    private float[] stare_leduri;
    private float capacitate_rezervor;
    private float volum_curent;
    private double garantie_de_functionare;

    //float putere_totala;
    //float rotatie_perie;
    //loat viteza_deplasare;
    //float[] dimemsiuni;
    public void schimba_starea(Rezultat a) {
//            System.out.println("In urma utilizarii aparatului "+denumire+" aparatul a curatat "+a.produs+" metri patrati de suprafata\n" +
//                    " in consecinta s-a consumat "+a.curent_consumat+"W \nVolumul de solutie a ajuns la nivelul de "+a.volum_ramas+"l");
//            curent-=a.curent_consumat;
//            volum_curent=a.volum_liber;
//            stare_filtru=a.stare_filtru;
//            garantie_de_functionare=a.functionare_ramasa;
//        }
//        public void cost_mentenanta(rezultat c){
//            System.out.println(" te costa x pentru ");//neterminata
    }

    /*
    public double calcul_curent_consumat(float cerinta){
        double consum=alimentare*(cerinta/productivitate);
        return consum;
    }
     */
    public Masina_de_fum(Masina_de_fum a) {
        this.denumire = a.denumire;
        this.productivitate = a.productivitate;
        this.capacitate_baterie = a.capacitate_baterie;
        this.nivel_baterie = a.nivel_baterie;
        this.sanatate_baterie = a.sanatate_baterie;
        this.numar_leduri = a.numar_leduri;
        this.stare_leduri = a.stare_leduri;
        this.volum_curent = a.volum_curent;
        this.garantie_de_functionare = a.garantie_de_functionare;
    }

    //        public rezultat pornire(float cerinta){//neterminata
//
//            double consum=alimentare*(cerinta/productivitate);
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
//

    //            if(consum>curent) return null;
//            else curent-=consum;
//            return null;
//
//        }
    void cost_mentenanta(Rezultat c){
    }
    Masina_de_fum() {
        denumire = "";
        productivitate = 0;
        capacitate_baterie = 0;
        nivel_baterie = 0;
        sanatate_baterie = 0;
        numar_leduri = 0;
        stare_leduri = new float[numar_leduri];
        capacitate_rezervor = 0;
        volum_curent = 0;
        garantie_de_functionare = 0;
    }

    public Masina_de_fum(String denumire, float productivitate, float capacitate_baterie, float nivel_baterie, float sanatate_baterie, int numar_leduri, float[] stare_leduri, float capacitate_rezervor, float volum_curent, double garantie_de_functionare) {
        this.denumire = denumire;
        this.productivitate = productivitate;
        this.capacitate_baterie = capacitate_baterie;
        this.nivel_baterie = nivel_baterie;
        this.sanatate_baterie = sanatate_baterie;
        this.numar_leduri = numar_leduri;
        this.stare_leduri = stare_leduri;
        this.volum_curent = volum_curent;
        this.capacitate_rezervor = capacitate_rezervor;
        this.garantie_de_functionare = garantie_de_functionare;
    }

    public String toString() {
        String a = "";
        for (int i = 0; i < numar_leduri; i++) {
            a += stare_leduri[i] + " ";
        }
        return denumire + " " + productivitate + " " + capacitate_baterie + " " + nivel_baterie + " " + sanatate_baterie + " " + numar_leduri + " " + a  + " "
                + " " + volum_curent + " " + garantie_de_functionare;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getProductivitate() {
        return productivitate;
    }

    public float getCapacitate_baterie() {
        return capacitate_baterie;
    }

    public float[] getStare_leduri() {
        return stare_leduri;
    }

    public float getNivel_baterie() {
        return nivel_baterie;
    }

    public float getSanatate_baterie() {
        return sanatate_baterie;
    }

    public float getNumar_leduri() {
        return numar_leduri;
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

    public void setCapacitate_baterie(float capacitate_baterie) {
        this.capacitate_baterie = capacitate_baterie;
    }

    public void setNivel_baterie(int nivel_baterie) {
        this.nivel_baterie = nivel_baterie;
    }

    public void setSanatate_baterie(float sanatate_baterie) {
        this.sanatate_baterie = sanatate_baterie;
    }

    public void setNumar_leduri(int numar_leduri) {
        this.numar_leduri = numar_leduri;
    }

    public void setStare_leduri(float[] stare_leduri) {
        this.stare_leduri = new float[stare_leduri.length];
        int cont = 0;
        for (float i : stare_leduri) {
            stare_leduri[cont++] = i;
        }
    }

    public void setVolum_curent(float volum_curent) {
        this.volum_curent = volum_curent;
    }

    public void setGarantie_de_functionare(double garantie_de_functionare) {
        this.garantie_de_functionare = garantie_de_functionare;

    }
}
