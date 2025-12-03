package Proiect;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Interfata extends JFrame {

    private JComboBox<String> comboTipAparat;
    private JTextField txtFiltru;
    private JButton btnFiltreaza;
    private JTextArea txtRezultate;

    private ArrayList<AparatCuratatPardoseli> pardoseli;
    private ArrayList<AparatCuratatGeamuri> geamuri;

    public Interfata() {
        setTitle("Filtrare Aparate");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initializareDate();

        JPanel panouSus = new JPanel();
        panouSus.setLayout(new GridLayout(3, 2, 5, 5));

        comboTipAparat = new JComboBox<>(new String[]{"Pardoseli", "Geamuri"});
        txtFiltru = new JTextField();
        btnFiltreaza = new JButton("Filtrează");
        txtRezultate = new JTextArea();
        txtRezultate.setEditable(false);

        panouSus.add(new JLabel("Tip aparat:"));
        panouSus.add(comboTipAparat);
        panouSus.add(new JLabel("Filtru (producător/soluție):"));
        panouSus.add(txtFiltru);
        panouSus.add(btnFiltreaza);

        add(panouSus, BorderLayout.NORTH);
        add(new JScrollPane(txtRezultate), BorderLayout.CENTER);

        btnFiltreaza.addActionListener(e -> filtreaza());

        setVisible(true);
    }

    private void initializareDate() {
        pardoseli = new ArrayList<>();
        geamuri = new ArrayList<>();

        // copiez din main
        pardoseli.add(new AparatCuratatPardoseli("P1002", "Tennant", 4554, 550, "D", 2020, 4006, 24, true, "Rosu"));
        pardoseli.add(new AparatCuratatPardoseli("P1004", "Bosch",   2100, 200, "C", 2016, 2500, 24, true, "Verde"));
        pardoseli.add(new AparatCuratatPardoseli("P1006", "Karcher", 3500, 320, "B", 2019, 3300, 24, false,"Negru"));
        pardoseli.add(new AparatCuratatPardoseli("P1008", "Tennant", 5001, 620, "A", 2022, 4600, 24, true, "Galben"));
        pardoseli.add(new AparatCuratatPardoseli("P1010", "Bosch",   2500, 270, "C", 2016, 2800, 24, true, "Rosu"));

        geamuri.add(new AparatCuratatGeamuri("Solutie1", true, 14, 27,   "bumbac", 6, 55,2,"Albastru",230));
        geamuri.add(new AparatCuratatGeamuri("Solutie2", true, 15, 26.5, "bumbac", 5, 65,3,"Verde",225));
        geamuri.add(new AparatCuratatGeamuri("Solutie3", true, 13, 26,   "bumbac", 5, 55,3,"Portocaliu",215));
        geamuri.add(new AparatCuratatGeamuri("Solutie4", false,12, 24.5, "bumbac", 6, 50,3,"Albastru",210));
        geamuri.add(new AparatCuratatGeamuri("Solutie5", true, 12, 25,   "bumbac", 6, 60,3,"Negru",220));
    }

    private void filtreaza() {
        txtRezultate.setText("");

        String filtru = txtFiltru.getText().trim().toLowerCase();

        if (comboTipAparat.getSelectedItem().equals("Pardoseli")) {
            for (AparatCuratatPardoseli a : pardoseli) {
                if (a.getProducator().toLowerCase().contains(filtru)) {
                    txtRezultate.append(a.toString() + "\n");
                }
            }
        } else {
            for (AparatCuratatGeamuri a : geamuri) {
                if (a.getTipSolutieCuratare().toLowerCase().contains(filtru)) {
                    txtRezultate.append(a.toString() + "\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Interfata();  //pornesc interfata
    }
}
