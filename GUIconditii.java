package poo1.aparat;

import javax.swing.*;  
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.*;


public class GUIconditii extends JFrame {

    private ArrayList<MasinaTunsIarba> masini;
    private ArrayList<Motosapa> motosapa;

    // casete pentru filtrare masina tuns iarba
    private JTextField casetaPutereMasina;
    private JTextField casetaMarcaMasina;

    // casete pt filtrare motosape
    private JTextField casetaGreutate;
    private JCheckBox ButonPtPornire;

    //2 tabele pt masini si motosape 
    private JTable tabelMasini;
    private JTable tabelMotosape;

    // modelele ce contin datele afisate in tabele
    private DefaultTableModel modelMasini;
    private DefaultTableModel modelMotosape;

   // constructorul  interfetei
   // interfata nu creeaza datele, doar le afiseaza si filtreaza
    public GUIconditii(ArrayList<MasinaTunsIarba> masini, ArrayList<Motosapa> motosapa) {
        this.masini = masini;
        this.motosapa = motosapa;

        setTitle("Filtrare aparate"); // titlu interfata
        setSize(900, 700);   // latime si inaltime
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // sa se inchida programul cand apas pex
        setLayout(new BorderLayout());   // setez layout ul
       // getContentPane().setBackground(Color.PINK);  //culoare background


        
        
        //            PANOU MASINI SUS (NORTH)

        JPanel panouMasiniSus = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panouMasiniSus.add(new JLabel("Putere minima:"));
        casetaPutereMasina = new JTextField(10);  // latimea de 10 coloane
        panouMasiniSus.add(casetaPutereMasina);

        panouMasiniSus.add(new JLabel("Marca(masini):"));
        casetaMarcaMasina = new JTextField(10);
        panouMasiniSus.add(casetaMarcaMasina);

        JButton bMasini = new JButton("Filtrează masinile!");
        panouMasiniSus.add(bMasini);

        add(panouMasiniSus, BorderLayout.NORTH);

        
        // TABEL MASINI (CENTER)
        modelMasini = new DefaultTableModel(); //creeaz modelul
        // adaug  numelecoloanelor
        modelMasini.addColumn("Marca");
        modelMasini.addColumn("Model");
        modelMasini.addColumn("Putere");
        modelMasini.addColumn("Latime");
        modelMasini.addColumn("Capacitate rez");
        modelMasini.addColumn("Roti ");
        modelMasini.addColumn("Nivel zgomot");
        modelMasini.addColumn("Greutate");
        modelMasini.addColumn("Garantie");
        modelMasini.addColumn("Tip motor");
        
        
        // tabel masini dupa model
        tabelMasini = new JTable(modelMasini);
        add(new JScrollPane(tabelMasini), BorderLayout.CENTER);
        
        
        //     PANOU MOTOSAPE + TABEL MOTOSAPE (SOUTH)
        JPanel panouMotosape = new JPanel();
        panouMotosape.setLayout(new BoxLayout(panouMotosape, BoxLayout.Y_AXIS));

        JPanel panouConditiiMotosape = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panouConditiiMotosape.add(new JLabel("Greutate maxima(motosapa):"));
        casetaGreutate = new JTextField(10);
        panouConditiiMotosape.add(casetaGreutate);
        ButonPtPornire = new JCheckBox("Pornire electrica");
        panouConditiiMotosape.add(ButonPtPornire);

        JButton bMotosapa = new JButton("Filtreaza motosape!");
        panouConditiiMotosape.add(bMotosapa);
        panouMotosape.add(panouConditiiMotosape);
        //model pt tabel
        modelMotosape = new DefaultTableModel();
        modelMotosape.addColumn("Marca");
        modelMotosape.addColumn("Model");
        modelMotosape.addColumn("Putere");
        modelMotosape.addColumn("Latime");
        modelMotosape.addColumn("Adancime ");
        modelMotosape.addColumn("Greutate");
        modelMotosape.addColumn("Viteze ->");
        modelMotosape.addColumn("Viteze <-");
        modelMotosape.addColumn("Pornire electrica");
        modelMotosape.addColumn("Garantie");
        // tabel
        tabelMotosape = new JTable(modelMotosape);
        // adaug tabelul in panou si pun si scrollpane
        panouMotosape.add(new JScrollPane(tabelMotosape));
        //pun tot panoul jos pt a afisa corect
        add(panouMotosape, BorderLayout.SOUTH);

        //                     ACTION LISTENERS- leg butoanele de metode

       // bMasini.addActionListener(e -> filtreazaMasini());
        //sau
        
        
        bMasini.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        filtreazaMasini();
    }
        }    
        
      //  bMotosapa.addActionListener(e -> filtreazaMotosapa());
        
        
        bMotosapa.addActionListener(new ActionListener() {  // interfata ce trb implementata cu override
    public void actionPerformed(ActionEvent e) {
        filtreazaMotosapa();
    }
        } 
           // culori interfata
        panouMasiniSus.setBackground (new Color(255, 230, 242));
        panouConditiiMotosape.setBackground( new Color(255, 230, 242));
        panouMotosape.setBackground( new Color(255, 230 ,242));
        
        tabelMasini.setBackground(new Color(255, 247, 252));
        tabelMotosape.setBackground(new Color(255, 247, 252));
        
        tabelMasini.getTableHeader().setBackground(new Color(255, 204, 223));
        tabelMotosape.getTableHeader().setBackground(new Color(255, 204, 223));

        bMasini.setBackground(new Color(255, 179, 217));
        bMotosapa.setBackground(new Color(255, 179, 217));
          
        //pt fundal!!!!!!!!
      ((JComponent)tabelMasini.getParent()).setBackground(new Color(255, 230, 242));   // convertesc componenta din parinte in jcomponenet pt a putea schimba
      ((JComponent)tabelMotosape.getParent()).setBackground(new Color(255, 230, 242));

       bMasini.setForeground(Color.MAGENTA);
       bMotosapa.setForeground(Color.MAGENTA);
       casetaGreutate.setForeground(Color.PINK);
    /*
   buton stergere:
            JButton bResetare = new JButton("Reseteaza tabelele");
            panouMasiniSus.add(bResetare);
            bResetare.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                modelMasini.setRowCount(0);
                modelMotosape.setRowCount(0);
    }
});
    combobox

 String[] marci = {"Bosh", "Honda", "Makita", "Ruris", "Stihl"};
JComboBox<String> comboMarca = new JComboBox<>(marci);
panouMasiniSus.add(comboMarca);
String marcaSelectata = (String) comboMarca.getSelectedItem();


        */

        
        setVisible(true);
    }
    

    private void filtreazaMasini() {
        modelMasini.setRowCount(0);

        try {
            double putMin = Double.parseDouble(casetaPutereMasina.getText());
            String marca = casetaMarcaMasina.getText();

            for (int i = 0; i < masini.size(); i++) {
            MasinaTunsIarba m = masini.get(i);

            if (m.getPutere() >= putMin && m.getMarca().equals(marca)) // cu IgnoreCase
    {
                modelMasini.addRow(new Object[]{ m.getMarca(),m.getModel(), m.getPutere(), m.getLatimeTaiere(),  m.getCapacitateRezervor(), m.areRotiDeplasare(), m.getNivelZgomot(),m.getGreutate(), m.getGarantie(), m.getTipMotor()});
    
    }
            }

        } catch (Exception e) {
           System.out.println("Introduceti valori corecte!");
        }
    }

    private void filtreazaMotosapa() {
        modelMotosape.setRowCount(0);

        try {
            double greutateMax = Double.parseDouble(casetaGreutate.getText());
            boolean pornire = ButonPtPornire.isSelected();

            for (int i = 0; i < motosapa.size(); i++) {
            Motosapa m = motosapa.get(i);
                if (m.getGreutate() <= greutateMax && m.arePornireElectrica() == pornire) 
                {
                    modelMotosape.addRow(new Object[]{m.getMarca(), m.getModel(), m.getPutere(), m.getLatimeLucru(),m.getAdancimeLucru(), m.getGreutate(), m.getVitezeInainte(), m.getVitezeInapoi(), m.arePornireElectrica(), m.getGarantie()});
                }
            }

        } catch (Exception e) {
               System.out.println("Introduceti valori corecte!");
        }
    }
    
    
   
}
