package Proiect;
import java.util.ArrayList;
class AparatCuratatPardoseli extends Aparat {
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


    AparatCuratatPardoseli() {
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
    public void schimba_starea(Rezultat r) {
        // inversam disponibilitatea aparatului
        EsteDisponibil = !EsteDisponibil;
        // Afișăm starea curentă
        System.out.println("Aparatul " + CodIdentificare + " este acum " + (EsteDisponibil ? "disponibil" : "indisponibil"));
    }

    void cost_mentenanta(Rezultat r) {
        // costul de mentenanta = 5% din pretul aparatului
        double cost = pretEuro * 0.05;
        r.produs = cost; // salvam rezultatul în obiectul Rezultat
        System.out.println("Mentenanta aparatului " + CodIdentificare + " costa aproximativ: " + cost + " euro");
    }
    public static void afiseazaDupaConditii(ArrayList<AparatCuratatPardoseli> lista, double pretMinim, boolean disponibil) {
        System.out.println("Aparate pardoseli care respecta condițiile:");
        for (int i = 0; i < lista.size(); i++) {
            AparatCuratatPardoseli p= lista.get(i); // ia obiectul din lista de la poz i si il da variabilei p
            if (p.getPretEuro() >= pretMinim && p.getEsteDisponibil() == disponibil) {
                System.out.println(p);
            }
        }
    }

}