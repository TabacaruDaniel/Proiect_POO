package ProiectPOO;

public class Test {
    public static void main(String[] args) {

        System.out.println("INSTANTE ASPIRATOR");

        AparatSpalarePresiune Aspirator_1 = new AparatSpalarePresiune();
        Aspirator_1.setDenumire("Model Basic");

        AparatSpalarePresiune Aspirator_2 =
                new AparatSpalarePresiune("K1", 1500, 120, 7,
                        15, 15, 5, true, "Electric", 75);

        AparatSpalarePresiune Aspirator_3 = new AparatSpalarePresiune(asp2);

        System.out.println(Aspirator_1);
        System.out.println(Aspirator_2);
        System.out.println(Aspirator_3);


        System.out.println("\nINSTANTE SUFLANTA");

        Suflanta Suflanta_1 = new Suflanta();
        Suflanta Suflanta_2 = new Suflanta("S1", 900, 200, false, 80,
                3.5f, 25, "Baterie", "Plastic", true);
        Suflanta Suflanta_3 = new Suflanta(s2);

        System.out.println(Suflanta_1);
        System.out.println(Suflanta_2);
        System.out.println(Suflanta_3);


        System.out.println("\VECTOR 10 ASP =====");

        AparatSpalarePresiune[] v1 = new AparatSpalarePresiune[10];

        for (int i = 0; i < 10; i++) {
            v1[i] = new AparatSpalarePresiune(
                    "A" + i, 1200 + i * 50, 100 + i, 5 + i,
                    20, 20, 5, true, "Electric", 70 + i
            );
            System.out.println(v1[i]);
        }


        System.out.println("\n===== VECTOR 10 SUFLANTE =====");

        Suflanta[] v2 = new Suflanta[10];

        for (int i = 0; i < 10; i++) {
            v2[i] = new Suflanta(
                    "S" + i, 700 + i * 30, 150 + i * 5,
                    i % 2 == 0, 75 + i, 3 + i * 0.1f,
                    20 + i, "Cablu", "Plastic", i % 3 == 0
            );
            System.out.println(v2[i]);
        }


        System.out.println("\n===== REZULTATE SPĂLARE =====");

        RezultatSpalare r1 = asp2.spala(20);
        RezultatSpalare r2 = asp2.spala(30);
        RezultatSpalare r3 = asp3.spala(25);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        asp2.schimba_starea(r1);
        asp2.cost_mentenanta(r1);


        System.out.println("\n===== REZULTATE SUFLARE =====");

        RezultatSuflanta rs1 = s2.sufla(10);
        RezultatSuflanta rs2 = s3.sufla(15);

        System.out.println(rs1);
        System.out.println(rs2);

        s2.schimba_starea(rs1);
        s2.cost_mentenanta(rs1);

        System.out.println("\n===== FINAL =====");
    }
}
