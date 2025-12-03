package Proiect;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ArrayList<AparatCuratatPardoseli> pardoseli = new ArrayList<>();

        AparatCuratatPardoseli p1 = new AparatCuratatPardoseli();
        System.out.println(p1);
        pardoseli.add(p1);

        AparatCuratatPardoseli p2 = new AparatCuratatPardoseli("P1002", "Tennant", 4554, 550d, "D", 2020, 4006, 24, true, "Rosu");
        System.out.println(p2);
        pardoseli.add(p2);

        AparatCuratatPardoseli p3 = new AparatCuratatPardoseli();
        System.out.println(p3);
        pardoseli.add(p3);

        AparatCuratatPardoseli p4 = new AparatCuratatPardoseli("P1004", "Bosch", 2100, 200d, "C", 2016, 2500, 24, true, "Verde");
        System.out.println(p4);
        pardoseli.add(p4);

        AparatCuratatPardoseli p5 = new AparatCuratatPardoseli();
        System.out.println(p5);
        pardoseli.add(p5);

        AparatCuratatPardoseli p6 = new AparatCuratatPardoseli("P1006", "Karcher", 3500, 320d, "B", 2019, 3300, 24, false, "Negru");
        System.out.println(p6);
        pardoseli.add(p6);

        AparatCuratatPardoseli p7 = new AparatCuratatPardoseli();
        System.out.println(p7);
        pardoseli.add(p7);

        AparatCuratatPardoseli p8 = new AparatCuratatPardoseli("P1008", "Tennant", 5001, 620d, "A", 2022, 4600, 24, true, "Galben");
        System.out.println(p8);
        pardoseli.add(p8);

        AparatCuratatPardoseli p9 = new AparatCuratatPardoseli();
        System.out.println(p9);
        pardoseli.add(p9);

        AparatCuratatPardoseli p10 = new AparatCuratatPardoseli("P1010", "Bosch", 2500, 270d, "C", 2016, 2800, 24, true, "Rosu");
        System.out.println(p10);
        pardoseli.add(p10);

        ArrayList<AparatCuratatGeamuri> geamuri = new ArrayList<>();

        AparatCuratatGeamuri g1 = new AparatCuratatGeamuri();
        System.out.println(g1);
        geamuri.add(g1);

        AparatCuratatGeamuri g2 = new AparatCuratatGeamuri("Solutie1", true, 14, 27.0, "bumbac", 6, 55, 2, "Albastru", 230.0);
        System.out.println(g2);
        geamuri.add(g2);

        AparatCuratatGeamuri g3 = new AparatCuratatGeamuri();
        System.out.println(g3);
        geamuri.add(g3);

        AparatCuratatGeamuri g4 = new AparatCuratatGeamuri("Solutie2", true, 15, 26.5, "bumbac", 5, 65, 3, "Verde", 225.0);
        System.out.println(g4);
        geamuri.add(g4);

        AparatCuratatGeamuri g5 = new AparatCuratatGeamuri();
        System.out.println(g5);
        geamuri.add(g5);

        AparatCuratatGeamuri g6 = new AparatCuratatGeamuri("Solutie3", true, 13, 26.0, "bumbac", 5, 55, 3, "Portocaliu", 215.0);
        System.out.println(g6);
        geamuri.add(g6);

        AparatCuratatGeamuri g7 = new AparatCuratatGeamuri();
        System.out.println(g7);
        geamuri.add(g7);

        AparatCuratatGeamuri g8 = new AparatCuratatGeamuri("Solutie4", false, 12, 24.5, "bumbac", 6, 50, 3, "Albastru", 210.0);
        System.out.println(g8);
        geamuri.add(g8);

        AparatCuratatGeamuri g9 = new AparatCuratatGeamuri();
        System.out.println(g9);
        geamuri.add(g9);

        AparatCuratatGeamuri g10 = new AparatCuratatGeamuri("Solutie5", true, 12, 25.0, "bumbac", 6, 60, 3, "Negru", 220.0);
        System.out.println(g10);
        geamuri.add(g10);

        System.out.println("Afisez obiectele de pardoseli: ");
        for (int i = 0; i < pardoseli.size(); i++) {
            System.out.println(pardoseli.get(i));
        }

        System.out.println("\nAfisez obiectele de geamuri: ");
        for (int i = 0; i < geamuri.size(); i++) {
            System.out.println(geamuri.get(i));
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti pretul minim pentru pardoseli: ");
        double pretMinim = sc.nextDouble();
        System.out.print("Sa fie disponibil? (true/false): ");
        boolean disponibil = sc.nextBoolean();
        AparatCuratatPardoseli.afiseazaDupaConditii(pardoseli, pretMinim, disponibil);

        System.out.print("Introduceti autonomia minimă pentru geamuri: ");
        int autonomieMinima = sc.nextInt();
        System.out.print("Trebuie sa aiba functie aspirare? (true/false): ");
        boolean aspirare = sc.nextBoolean();
        AparatCuratatGeamuri.afiseazaDupaConditii(geamuri, autonomieMinima, aspirare);
//dau comanda
        scrieFisierPardoseli(pardoseli, "pardoseli.txt");
        scrieFisierGeamuri(geamuri, "geamuri.txt");
    }

    public static void scrieFisierPardoseli(ArrayList<AparatCuratatPardoseli> lista, String numeFisier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier))) {
            for (AparatCuratatPardoseli p : lista) {
                String linie = p.getCodIdentificare() + "," +
                        p.getProducator() + "," +
                        p.getPutereWati() + "," +
                        p.getGreutateKg() + "," +
                        p.getClasaEnergetica() + "," +
                        p.getAnFabricatie() + "," +
                        p.getPretEuro() + "," +
                        p.getDurataGarantieLuni() + "," +
                        p.getEsteDisponibil() + "," +
                        p.getCuloare();
                writer.write(linie);
                writer.newLine();
            }
            System.out.println("Fisierul " + numeFisier + " a fost salvat cu succes!");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fisierului pardoseli: " + e.getMessage());
        }
    }

    public static void scrieFisierGeamuri(ArrayList<AparatCuratatGeamuri> lista, String numeFisier) {
        //aici creez propriu zis
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(numeFisier))) {
            for (AparatCuratatGeamuri g : lista) {
                String solutie = (g.getTipSolutieCuratare() == null || g.getTipSolutieCuratare().isEmpty()) ? "N/A" : g.getTipSolutieCuratare();

                String linie = solutie + "," +
                        g.getFunctieAspirare() + "," +
                        g.getAutonomieBaterie() + "," +
                        g.getLatimeLaveta() + "," +
                        g.getMaterialLaveta() + "," +
                        g.getTemperaturaMinimaFunctionare() + "," +
                        g.gettimpIncarcare() + "," +
                        g.getNrAccesorii() + "," +
                        g.getCuloareLedStatus() + "," +
                        g.getTensiuneVibratie();
                writer.write(linie);
                writer.newLine();
            }
            System.out.println("Fisierul " + numeFisier + " a fost salvat cu succes!");
        } catch (IOException e) {
            System.out.println("Eroare la scrierea fisierului geamuri: " + e.getMessage());
        }
    }
}