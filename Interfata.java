package ProiectPOO;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Interfata extends JFrame {

    //Listele care contin aparatel
    private ArrayList<AparatSpalarePresiune> listaASP;
    private ArrayList<Suflanta> listaSUF;

    //Elemente grafice (lista, camp cautare, zona detalii)
    private JList<Aparat> resultsList;
    private JTextField searchField;
    private JLabel detailsLabel;

    //Tipul selectat din combo box (ASP sau Suflanta)
    private String tipSelectat = "AparatSpalarePresiune";


    public Interfata(ArrayList<AparatSpalarePresiune> listaASP,
                     ArrayList<Suflanta> listaSUF) {
        this.listaASP = listaASP;
        this.listaSUF = listaSUF;

        //Setari de baza ale ferestrei
        setTitle("Interfata Proiect POO");
        setSize(800, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //culorile folosite
        Color blueLight = new Color(100, 205, 255);
        Color white = Color.BLUE;


        //setare culoare generala a ferestrei
        getContentPane().setBackground(blueLight);

        //PANEL CAUTARE
        JPanel searchPanel = new JPanel();
        searchPanel.setBackground(blueLight);

        //Combo box pentru selectarea tipului de aparat
        String[] tipuri = {"AparatSpalarePresiune", "Suflanta"};
        JComboBox<String> typeFilter = new JComboBox<>(tipuri);

        //Camp pentru cautare dupa nume
        searchField = new JTextField(15);
        JButton searchButton = new JButton("Cautare");

        //Adaugam elemente in panoul de cautare
        searchPanel.add(new JLabel("Tip:"));
        searchPanel.add(typeFilter);
        searchPanel.add(new JLabel("Nume:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        //Adaugam panoul in partea de sus a ferestrei
        add(searchPanel, BorderLayout.NORTH);

        //LISTA DE APARATE (centru)
        resultsList = new JList<>();
        resultsList.setBackground(white);
        resultsList.setSelectionBackground(new Color(180, 205, 255));

        //Scroll pentru lista
        add(new JScrollPane(resultsList), BorderLayout.CENTER);

        //Renderer pentru a afisa numele aparatului
        resultsList.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList<?> list, Object value, int index,
                    boolean isSelected, boolean cellHasFocus) {

                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (value instanceof AparatSpalarePresiune asp)
                    setText(asp.getDenumire());
                else if (value instanceof Suflanta suf)
                    setText(suf.getDenumire());
                else
                    setText(value.toString());

                return this;
            }
        });

        //PANOU DETALII
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BoxLayout(southPanel, BoxLayout.Y_AXIS));
        southPanel.setBackground(blueLight);

        //detaliile aparatului selectat
        detailsLabel = new JLabel("Selectati un aparat din lista...");
        detailsLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        southPanel.add(detailsLabel);
        add(southPanel, BorderLayout.SOUTH);

        //LISTENERS
        typeFilter.addActionListener(e ->
                tipSelectat = (String) typeFilter.getSelectedItem()
        );

        searchButton.addActionListener(e -> performSearch());
        resultsList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Aparat selected = resultsList.getSelectedValue();
                if (selected == null) {
                    detailsLabel.setText("Selectati un aparat...");
                    return;
                }
                if (selected instanceof AparatSpalarePresiune asp) {
                    detailsLabel.setText("<html>" +
                            "<b>Denumire:</b> " + asp.getDenumire() + "<br>" +
                            "<b>Putere:</b> " + asp.getPutere() + "<br>" +
                            "<b>Presiune:</b> " + asp.getPresiune() + "<br>" +
                            "<b>Debit:</b> " + asp.getDebit() + "<br>" +
                            "<b>Volum rezervor:</b> " + asp.getVolum_rezervor() + "<br>" +
                            "<b>Volum curent:</b> " + asp.getVolum_curent() + "<br>" +
                            "<b>Lungime cablu:</b> " + asp.getLungime_cablu() + "<br>" +
                            "<b>Are roti:</b> " + asp.isAre_roti() + "<br>" +
                            "<b>Tip motor:</b> " + asp.getTip_motor() + "<br>" +
                            "<b>Nivel zgomot:</b> " + asp.getNivel_zgomot() +
                            "</html>");
                }
                if (selected instanceof Suflanta s) {
                    detailsLabel.setText("<html>" +
                            "<b>Denumire:</b> " + s.getDenumire() + "<br>" +
                            "<b>Putere:</b> " + s.getPutere() + "<br>" +
                            "<b>Viteza aer:</b> " + s.getViteza_aer() + "<br>" +
                            "<b>Are aspirare:</b> " + s.isAre_aspirare() + "<br>" +
                            "<b>Nivel zgomot:</b> " + s.getNivel_zgomot() + "<br>" +
                            "<b>Greutate:</b> " + s.getGreutate() + "<br>" +
                            "<b>Autonomie bateria:</b> " + s.getAutonomie_baterie() + "<br>" +
                            "<b>Tip alimentare:</b> " + s.getTip_alimentare() + "<br>" +
                            "<b>Material carcasa:</b> " + s.getMaterial_carcasa() + "<br>" +
                            "<b>Functie turbo:</b> " + s.isFunctie_turbo() +
                            "</html>");
                }
            }
        });

        setVisible(true);
    }

    //FUNCTIA DE CAUTARE
    private void performSearch() {

        String text = searchField.getText().toLowerCase();
        List<Aparat> rezultate = new ArrayList<>();
        if (tipSelectat.equals("AparatSpalarePresiune")) {

            for (AparatSpalarePresiune a : listaASP)
                if (a.getDenumire().toLowerCase().contains(text))
                    rezultate.add(a);

        }
        else {

            for (Suflanta s : listaSUF)
                if (s.getDenumire().toLowerCase().contains(text))
                    rezultate.add(s);
        }

        //Afisam rezultatele in lista
        resultsList.setListData(rezultate.toArray(new Aparat[0]));
    }
}
