package ProiectPOO;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Instante AparatSpalarePresiune");
        AparatSpalarePresiune aparat_1 = new AparatSpalarePresiune();
        aparat_1.setDenumire("Samsung");
        aparat_1.setPutere(1200);
        aparat_1.setPresiune(110);
        aparat_1.setDebit(6);
        aparat_1.setVolum_rezervor(15);
        aparat_1.setVolum_curent(15);
        aparat_1.setLungime_cablu(5);
        aparat_1.setAre_roti(true);
        aparat_1.setTip_motor("Electric");
        aparat_1.setNivel_zgomot(72);

        AparatSpalarePresiune aparat_2 =
                new AparatSpalarePresiune("Karcher K5", 1500, 130, 7.5f,
                        20, 20, 6, true, "Electric", 75);

        AparatSpalarePresiune aparat_3 = new AparatSpalarePresiune(aparat_2);
        aparat_2.setDenumire("Karcher K5-copie");

        System.out.println(aparat_1);
        System.out.println(aparat_2);
        System.out.println(aparat_3);


        System.out.println("\nInstante Suflanta");

        Suflanta suflanta_1 = new Suflanta();
        suflanta_1.setDenumire("Suflanta");
        suflanta_1.setPutere(800);
        suflanta_1.setViteza_aer(180);
        suflanta_1.setAre_aspirare(false);
        suflanta_1.setNivel_zgomot(78);
        suflanta_1.setGreutate(3.5f);
        suflanta_1.setAutonomie_baterie(25);
        suflanta_1.setTip_alimentare("Cablu");
        suflanta_1.setMaterial_carcasa("Plastic");
        suflanta_1.setFunctie_turbo(false);

        Suflanta suflanta_2 = new Suflanta("STIHL BR20", 900, 220, true,
                82, 3.1f, 40, "Baterie", "Metal", true);

        Suflanta suflanta_3 = new Suflanta(suflanta_2);
        suflanta_3.setDenumire("STIHL BR20 - copie");

        System.out.println(suflanta_1);
        System.out.println(suflanta_2);
        System.out.println(suflanta_3);


        System.out.println("\nVector AparatSpalarePresiune");

        AparatSpalarePresiune[] vector_aparat = new AparatSpalarePresiune[10];

        for (int i = 0; i < 10; i++) {
            vector_aparat[i] = new AparatSpalarePresiune(
                    "ASP" + i,
                    1200 + i * 20,
                    100 + i,
                    6 + i * 0.2f,
                    15 + i,
                    15 + i,
                    5 + i,
                    i % 2 == 0,
                    "Electric",
                    70 + i
            );
            System.out.println(vector_aparat[i]);
        }


        System.out.println("\nVector Suflanta");

        Suflanta[] vector_suf = new Suflanta[10];

        for (int i = 0; i < 10; i++) {
            vector_suf[i] = new Suflanta(
                    "SUF" + i,
                    700 + i * 30,
                    150 + i * 3,
                    i % 2 == 0,
                    75 + i,
                    3 + (i * 0.15f),
                    20 + i,
                    (i % 2 == 0) ? "Cablu" : "Baterie",
                    (i % 3 == 0) ? "Metal" : "Plastic",
                    i % 4 == 0
            );
            System.out.println(vector_suf[i]);
        }

        Scanner sc = new Scanner(System.in);

        //METODE PARCURGERE VECTOR

        // APARAT SPALARE PRESIUNE
        System.out.print("\nAre roti (true/false): ");
        boolean roti = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Tip motor: ");
        String motor = sc.nextLine();

        metodaAparate(vector_aparat, roti, motor);


// SUFLANTA
        System.out.print("\nTip alimentare (Cablu/Baterie): ");
        String alim = sc.nextLine();

        System.out.print("Tip carcasa (Metal/Plastic): ");
        String car = sc.nextLine(); 
        metodaSuflante(vector_suf, alim, car);
    }

    public static void metodaAparate(AparatSpalarePresiune[] v, boolean roti, String motor) {
        boolean gasit = false;

        for (AparatSpalarePresiune a : v) {
            if (a.isAre_roti() == roti && a.getTip_motor().equals(motor)) {
                System.out.println(a);
                gasit = true;
            }
        }

        if (!gasit)
            System.out.println("Nu exista niciun aparat cu aceste criterii!");
    }

    public static void metodaSuflante(Suflanta[] v, String alimentare, String carcasa) {
        boolean gasit = false;

        for (Suflanta s : v) {
            if (s.getTip_alimentare().equals(alimentare) && s.getMaterial_carcasa().equals(carcasa)) {
                System.out.println(s);
                gasit = true;
            }
        }

        if (!gasit)
            System.out.println("Nu exista nicio suflanta cu aceste criterii!");
    }
}
