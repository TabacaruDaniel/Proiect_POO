package ProiectPOO;

public class Motosapa extends Aparat {
    // datele membre: 
    
    private String marca;
    private String model;
    private double putere;
    private double latimeLucru;
    private double adancimeLucru;
    private double greutate;
    private int vitezeInainte;
    private int vitezeInapoi;
    private boolean pornireElectrica;
    private double garantie;
    
    
    
    // co fara arg
     public Motosapa()
     {
        this.marca = "";
        this.model = "";
        this.putere = 0;
        this.latimeLucru = 0;
        this.adancimeLucru = 0;
        this.greutate = 0;
        this.vitezeInainte = 0;
        this.vitezeInapoi = 0;
        this.pornireElectrica = false;
        this.garantie = 0;
    }

     
     // co cu arg
       public Motosapa(String marca, String model, double putere, double latimeLucru, double adancimeLucru, double greutate, int vitezeInainte, int vitezeInapoi, boolean pornireElectrica, double garantie) 
       {
        this.marca = marca;
        this.model = model;
        this.putere = putere;
        this.latimeLucru = latimeLucru;
        this.adancimeLucru = adancimeLucru;
        this.greutate = greutate;
        this.vitezeInainte = vitezeInainte;
        this.vitezeInapoi = vitezeInapoi;
        this.pornireElectrica = pornireElectrica;
        this.garantie = garantie;
    }
       // co de copiere tot asa
       public Motosapa(Motosapa motosapa)
       
       {
        this.marca = motosapa.marca;
        this.model = motosapa.model;
        this.putere = motosapa.putere;
        this.latimeLucru = motosapa.latimeLucru;
        this.adancimeLucru = motosapa.adancimeLucru;
        this.greutate = motosapa.greutate;
        this.vitezeInainte = motosapa.vitezeInainte;
        this.vitezeInapoi = motosapa.vitezeInapoi;
        this.pornireElectrica = motosapa.pornireElectrica;
        this.garantie = motosapa.garantie;
           
       }
       
       // metode de set si get
    //1   
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    
    //2
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    //3
    public double getPutere() { return putere; }
    public void setPutere(double putere) { this.putere = putere; }

    //4
    public double getLatimeLucru() { return latimeLucru; }
    public void setLatimeLucru(double latimeLucru) { this.latimeLucru = latimeLucru; }
    
    //5
    public double getAdancimeLucru() { return adancimeLucru; }
    public void setAdancimeLucru(double adancimeLucru) { this.adancimeLucru = adancimeLucru; }
    
    
    //6
    public double getGreutate() { return greutate; }
    public void setGreutate(double greutate) { this.greutate = greutate; }
    //7
    public int getVitezeInainte() { return vitezeInainte; }
    public void setVitezeInainte(int vitezeInainte) { this.vitezeInainte = vitezeInainte; }

    //8
    public int getVitezeInapoi() { return vitezeInapoi; }
    public void setVitezeInapoi(int vitezeInapoi) { this.vitezeInapoi = vitezeInapoi; }

    //9
    public boolean arePornireElectrica() { return pornireElectrica; }
    public void setPornireElectrica(boolean pornireElectrica) { this.pornireElectrica = pornireElectrica; }

    //10
    public double getGarantie() { return garantie; }
    public void setGarantie(double garantie) { this.garantie = garantie; }
/*
 //sa se afiseze motosapele cu o greutate maxima data si daca are o pornire electrica
     public static void conditiiMotosapa( ArrayList<Motosapa> motosapa, double greutateMaxima, boolean pornireElectrica){
   for(int i=0;i<motosapa.size(); i++){
       Motosapa m2= motosapa.get(i);
       if(m2.getGreutate()<=greutateMaxima && m2.arePornireElectrica()==pornireElectrica)
       { System.out.println(m2); }
   }
     }
     
     //metoda 2 pentru motosapa - motosape recomandate pentru suprafete mari
     // conditii:   sa aiba puterea mai mare de 1600W + latime  > 45
     
     public static void MotosapaRecomandate(ArrayList<Motosapa> motosapa, double putereMinima, double latimeMinima){
         for(int i=0; i<motosapa.size();i++){
             Motosapa m3=motosapa.get(i);
             if(m3.getPutere()>putereMinima && m3.getLatimeLucru()>latimeMinima){
                 System.out.println(m3);
             }
         }
     }
}
    */
    // metode abstracte
     @Override
    public void schimba_starea(rezultat a) {
        System.out.println("Masina " + marca + " " + model + " a tuns " + a.produs + " mp de iarba.");
        curent -= a.curent_consumat;
    }
    
      @Override
    public void cost_mentenanta(Rezultat c) {
        double cost = (c.functionare_ramasa < 20) ? 100 : 40;
        System.out.println("Cost mentenanta pentru motosapa " + marca + " este " + cost + " lei.");
    }
    // toString pt afis
     @Override
    public String toString() {
        return "Motosapa:" +
                "marca=" + marca + '\'' +
                ", model=" + model + '\'' +
                ", putere=" + putere +
                ", latimeLucru=" + latimeLucru +
                ", adancimeLucru=" + adancimeLucru +
                ", greutate=" + greutate +
                ", vitezeInainte=" + vitezeInainte +
                ", vitezeInapoi=" + vitezeInapoi +
                ", pornireElectrica=" + pornireElectrica +
                ", garantie=" + garantie + '\t' ;               
    }
}
