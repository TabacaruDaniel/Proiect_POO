package ProiectPOO;

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

    }
}

/*AparatSpalarePresiune[] vector_asp = {
        new AparatSpalarePresiune("ASP0",1200,110,6.0f,20,20,5,true,"Electric",70),
        new AparatSpalarePresiune("ASP1",1250,111,6.2f,21,21,5,true,"Electric",71),
        new AparatSpalarePresiune("ASP2",1300,112,6.4f,22,22,6,false,"Electric",72),
        new AparatSpalarePresiune("ASP3",1350,113,6.6f,23,23,6,true,"Electric",73),
        new AparatSpalarePresiune("ASP4",1400,114,6.8f,24,24,7,false,"Electric",74),
        new AparatSpalarePresiune("ASP5",1450,115,7.0f,25,25,7,true,"Electric",75),
        new AparatSpalarePresiune("ASP6",1500,116,7.2f,26,26,8,true,"Electric",76),
        new AparatSpalarePresiune("ASP7",1550,117,7.4f,27,27,8,false,"Electric",77),
        new AparatSpalarePresiune("ASP8",1600,118,7.6f,28,28,9,true,"Electric",78),
        new AparatSpalarePresiune("ASP9",1650,119,7.8f,29,29,9,false,"Electric",79)
}
for (AparatSpalarePresiune asp : vector_asp) {
    System.out.println(asp);
}

Suflanta[] sufl = {
        new Suflanta("SUF0",800,170,true,75,3.0f,20,"Baterie","Metal",true),
        new Suflanta("SUF1",820,172,false,76,3.1f,21,"Baterie","Plastic",false),
        new Suflanta("SUF2",840,174,true,77,3.2f,22,"Cablu","Metal",false),
        new Suflanta("SUF3",860,176,false,78,3.3f,23,"Cablu","Plastic",true),
        new Suflanta("SUF4",880,178,true,79,3.4f,24,"Baterie","Metal",false),
        new Suflanta("SUF5",900,180,false,80,3.5f,25,"Baterie","Plastic",false),
        new Suflanta("SUF6",920,182,true,81,3.6f,26,"Cablu","Metal",true),
        new Suflanta("SUF7",940,184,false,82,3.7f,27,"Cablu","Plastic",false),
        new Suflanta("SUF8",960,186,true,83,3.8f,28,"Baterie","Metal",false),
        new Suflanta("SUF9",980,188,false,84,3.9f,29,"Baterie","Plastic",true)
}
for (Suflanta s : sufl) {
    System.out.println(s);
}


 */

