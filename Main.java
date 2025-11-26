package ProiectPOO;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {
        
  // instante ale clasei
 MasinaTunsIarba m1 = new MasinaTunsIarba();
        m1.setMarca("Honda");
        m1.setModel("CM764");

        MasinaTunsIarba m2 = new MasinaTunsIarba("Stihl", "S450", 4.5, 40, 1.5, true, 85, 20, 2, "benzina");

        MasinaTunsIarba m3 = new MasinaTunsIarba(m2);// c de copiere apelat
        
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

  System.out.println("           \n------------ vectori---------- \n          ");

/*
  // pt motosapa

        Motosapa s1 = new Motosapa(); // cu co f arg
        Motosapa s2 = new Motosapa("Ruris", "630K", 7.0, 45, 20, 30, 2, 1, true, 3);
        Motosapa s3 = new Motosapa(s2); // c de copiere apelat
        

        System.out.println(s1);
        System.out.println(s2);    //se apeleaza automat met toString din cls motosapa
        System.out.println(s3);



     // CERINTA VECTORI CU ARRAYLIST SAU OBJECT
      
// pentru masina de tuns iarba- cu Object
        
        Object[] masini = new Object[10];
      
     // parcurgere
        for (int i = 0; i < 10; i++) {
            masini[i] = new MasinaTunsIarba( "marca" + i, "model" + i, 4 + i, 40 + i, 1.5, i % 2 == 0, 80 + i, 20 + i, 2, "benzina" );
        }
        
     // afisare
        System.out.println("Masini tuns iarba afisare:\n");

      for (int i = 0; i < masini.length; i++) {
    System.out.println(masini[0]);
     System.out.println(masini[9]);
}
       


     //pt motosapa

        Object[] motosapa = new Object[10];

        for (int i = 0; i < 10; i++) {
            motosapa[i] = new Motosapa( "Ruris", "R" + i,  6 + i, 45 + i, 20 + i, 30 + i, 2, 1, i % 2 == 0, 3);
        }
        System.out.println("\nMotosape:");

      for(int i=0;i.length.motosapa;i++){
        System.out.println(motosapa[0]);
          System.out.println(motosapa[9]);
      }  
      
            }



  import java.util.ArrayList;

        ArrayList<Object> listaMasiniTaiatIarba = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listaMasiniTaiatIarba.add(new MasinaTunsIarba(  "Marca" + i, "Model" + i,   5 + i, 40 + i,  1.5, i % 2 == 0, 80 + i, 22 + i, 2, "electric"));
        }

        System.out.println("\n Afisare masini  taiat iarba: ");
    for (int i = 0; i < listaMasiniTaiatIarba.size(); i++) {
    System.out.println(listaMasiniTaiatIarba.get(i));
}


  // pt motosape

        ArrayList<Object> listaMotosape = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listaMotosape.add(new Motosapa(  "Stern", "S" + i,  6 + i, 45 + i,  20 + i, 30 + i, 2, 1, i % 2 == 0, 3));
        }

        System.out.println("\nAfisare motosape: ");
      for (int i = 0; i < listaMotosape.size(); i++) {
    System.out.println(listaMotosape.get(i));
}
    }
}
*/
// cu ArrayList, dar creez eu vectorii

ArrayList<MasinaTunsIarba> masini= new ArrayList<>(); // pt ca elementele sa fie doar de tipul precizat intre <>
  
  MasinaTunsIarba masina1= new MasinaTunsIarba("Grunman", "C3811", 1600, 38, 45, true, 50,13,24, "electric");
System.out.println( masina1); // apel toString si afiseaza lista
masini.add(masina1); // adauga la lista 

MasinaTunsIarba masina2= new MasinaTunsIarba("makita", "C3812", 1700, 40, 46, false, 40,12,24, "electric");
System.out.println( masina2); 
masini.add(masina2);

MasinaTunsIarba masina3= new MasinaTunsIarba("makita", "ELM3320", 1200,33, 30, true, 50, 10.2,24, "electric");
System.out.println( masina3); 
masini.add(masina3);

MasinaTunsIarba masina4= new MasinaTunsIarba("bosh", "C3800", 1500, 50, 47, false, 50,14,24, "manual");
System.out.println( masina4); 
masini.add(masina4);

MasinaTunsIarba masina5= new MasinaTunsIarba("Ryobi", "RY1248", 1700, 40, 46, true, 40,12,24, "electric");
System.out.println( masina5); 
masini.add(masina5);

MasinaTunsIarba masina6= new MasinaTunsIarba("bosh", "C3812", 1200, 30, 48, false, 50,15,24, "electric");
System.out.println( masina6); 
masini.add(masina6);

MasinaTunsIarba masina7= new MasinaTunsIarba("OMAC", "MG40", 2900, 40, 46, false, 40,12,24, "electric");
System.out.println( masina7); 
masini.add(masina7);

MasinaTunsIarba masina8= new MasinaTunsIarba("bosh", "LM003G", 1900, 40, 38, true, 40,12,24, "electric");
System.out.println( masina8); 
masini.add(masina8);

MasinaTunsIarba masina9= new MasinaTunsIarba("ruris", "C3812", 1200, 32, 46, false, 40,12,24, "electric");
System.out.println( masina9); 
masini.add(masina9);

MasinaTunsIarba masina10= new MasinaTunsIarba("Panzer", "PTCLW110", 1800, 37, 46, true, 40,12,24, "electric");
System.out.println( masina10); 
masini.add(masina10);

for(int i=0;i<masini.size(); i++){
  System.out.println(masini.get(i));   // cu size si get ca e lista nu vector si are elemente nefixe

}
 System.out.println(" \n----------------------vectori motosapa-------------------");


ArrayList<Motosapa> motosapa= new ArrayList<>();
    
Motosapa motosapa1= new Motosapa("Grunman","PT227", 1500, 45, 20,11.5, 3,3, true, 24);
 System.out.println(motosapa1);
motosapa.add(motosapa1);

Motosapa motosapa2= new Motosapa("wert","PT5337", 1900, 35, 30,12, 3,3, true, 24);
System.out.println(motosapa2);
motosapa.add(motosapa2);

Motosapa motosapa3= new Motosapa("niset","PT5466", 1600, 47, 15,13, 3,3, true, 24);
System.out.println(motosapa3);
motosapa.add(motosapa3);

Motosapa motosapa4= new Motosapa("Grunman","PT6767", 1500, 40, 20,12.5, 3,3, true, 24);
System.out.println(motosapa4);
motosapa.add(motosapa4);

Motosapa motosapa5= new Motosapa("makita","PT567", 1600, 44, 15,15, 3,3, false, 24);
    System.out.println(motosapa5);
motosapa.add(motosapa5);
Motosapa motosapa6= new Motosapa("Grunman","PT567", 1800, 48, 30,13.5, 3,3, false, 24);
    System.out.println(motosapa6);
motosapa.add(motosapa6);
Motosapa motosapa7= new Motosapa("bosh","PT447", 1700, 42, 20,14, 3,3, true, 24);
    System.out.println(motosapa7);
motosapa.add(motosapa7);

Motosapa motosapa8= new Motosapa("Grunman","PT5887", 1400, 49, 20,10.5, 3,3, false, 24);
 System.out.println(motosapa8);
motosapa.add(motosapa8);

Motosapa motosapa9= new Motosapa("Grunman","PT590", 1500, 41, 20,15, 3,3, true, 24);
System.out.println(motosapa9);
motosapa.add(motosapa9);

Motosapa motosapa10= new Motosapa("Grunman","PT4447", 1900, 50, 20,15.5, 3,3, true, 24);
    System.out.println(motosapa10);
motosapa.add(motosapa10);

for(int i=0;i<motosapa.size();i++){
    System.out.println(motosapa.get(i));


}


//                        TESTARE METODE CU CONDITII


    System.out.println("\nMasini care indeplinesc conditiile(marca si putere specificate): "); 
    conditiiMasinaTunsIarba(masini,1500,"bosh");
    masiniBoshOrdCrescator(masini,"bosh");
    
    
    System.out.println("\nMotosape cu ogreutate maxima ceruta + cu pornire automata:  ");
    conditiiMotosapa(motosapa,12,true);
    System.out.println("\nMotosape recomandate pentru suprafete mari(putere >1600W + latime>45):  ");
    MotosapaRecomandate(motosapa,1600,45);
    
    }

// Metoda pentru vectorul manual- pt masina tuns iarba
 // statice pt ca  main e static si apeleaza doar met statice
        // conditiile sunt- sa aiba o putere mai mare sau egala cu cea ceruta + marca specificata
   public static void conditiiMasinaTunsIarba(ArrayList<MasinaTunsIarba> masini, double putereMinima, String marcaCautata){
    for(int i=0;i<masini.size();i++){
        MasinaTunsIarba m1= masini.get(i); // ca (v[i]) sau (masinatunsiarba)v[i]  -- extrag ob!!
        if(m1.getPutere()>=putereMinima && m1.getMarca().equals(marcaCautata)){  //equalsIgnoreCase
            System.out.println(m1); }
    }
 }
// afisare crescatoare dupa putere a masinilor din marca bosh
   public static void masiniBoshOrdCrescator(ArrayList<MasinaTunsIarba> masini,String marcaCeruta){
        ArrayList<MasinaTunsIarba> filtrate = new ArrayList<>();
    for (int i = 0; i < masini.size(); i++) {
        MasinaTunsIarba m = masini.get(i);
        if (m.getMarca().equals(marcaCeruta)) {   //
            filtrate.add(m);
        }
    }
    
// quick sort pt sortarea crescatoare
   for(int i=0;i<filtrate.size()-1;i++){       // filtrate.sort((a, b) -> Double.compare(b.getPutere(), a.getPutere()));\
      for(int j=i+1;j<filtrate.size();j++){
          if(filtrate.get(i).getPutere()>filtrate.get(j).getPutere()){
              MasinaTunsIarba aux= filtrate.get(i);
              filtrate.set(i, filtrate.get(j));
              filtrate.set(j, aux); 
          }
      } 
   }
                                                                                                                                                                                
    System.out.println("\nMasini marca Bosh ordonate descrescator dupa putere:");
    for (int i = 0; i < filtrate.size(); i++) {
        System.out.println(filtrate.get(i));
    }
   }
   
   
     //metoda pentru vector fct manual pt motosapa
   
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






















        
