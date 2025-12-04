package ProiectPOO;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Image;
import java.net.URL;

public class Interfata extends JFrame {


    private ArrayList<Aspirator> listaAspiratoare; // Lista ta principală
    private ArrayList<Masina_de_fum> listaMasini;
    private JTextField searchField;
    private JList<Aparat> resultsList; // Va afișa rezultatele
    private String tipselectat="Aspirator";
    private JLabel detailsLabel; // Pentru a afișa detaliile (toString-ul complet)
    private JPanel runPanel; // Panoul care conține câmpul de rulare și butonul
    private JTextField runTimeField;
    private String tipCurent="m²";
    private JLabel updateLabel;
    private Aspirator aspirator;
    private Masina_de_fum masinaFum;


    public Interfata(ArrayList<Aspirator> listaAspiratoare, ArrayList<Masina_de_fum> listaMasini) {
        setSize(800,600);
        URL iconURL = getClass().getResource("emag1.jpg");
        Image icon = Toolkit.getDefaultToolkit().getImage(iconURL);
        this.listaAspiratoare = listaAspiratoare;
        this.listaMasini = listaMasini;

        searchField = new JTextField(20);
        JButton searchButton = new JButton("Căutare");
        JButton runButton = new JButton("testeaza");

        JPanel searchPanel = new JPanel();

        resultsList = new JList<>();
        add(new JScrollPane(resultsList), BorderLayout.CENTER); // JScrollPane permite scroll-ul

        // Acțiune pentru butonul de căutare
        String[] tipuriAparate = {"Aspirator","Masina_de_fum"};
        JComboBox<String> typeFilter = new JComboBox<>(tipuriAparate);


// B. Zona de Căutare (Sus)
        searchField = new JTextField(15); // Am redus puțin lățimea
        searchPanel.add(new JLabel("Tip:"));
        searchPanel.add(typeFilter); // Noul filtru
        searchPanel.add(new JLabel("Nume:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        add(searchPanel, BorderLayout.NORTH);
        searchButton.addActionListener(e -> performSearch());

        detailsLabel = new JLabel("Selectați un aparat pentru a vedea detaliile...");
        detailsLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Spațiu

// Zona de Rulare (mutată din BorderLayout.SOUTH)
        runTimeField = new JTextField(5);
// ... [Creează runButton ca înainte] ...
        updateLabel=new JLabel(tipCurent);
        runPanel = new JPanel();
        runPanel.add(new JLabel("Simulare pornire, cerinta "));
        runPanel.add(updateLabel);
        runPanel.add(runTimeField);
        runPanel.add(runButton);
        typeFilter.addItemListener(e -> {tipselectat = (String) typeFilter.getSelectedItem();
            Updatare(tipselectat);
        });
        runButton.addActionListener(e -> {
            if(tipselectat.equals("Aspirator")){
                aspirator.schimba_starea(aspirator.pornire(Integer.parseInt(runTimeField.getText())));
                detailsLabel.setText("<html>" + aspirator.detalii().replace("\n", "<br>") + "</html>");

            }
            else{
                masinaFum.schimba_starea(masinaFum.pornire(Integer.parseInt(runTimeField.getText())));
                detailsLabel.setText("<html>" + masinaFum.detalii().replace("\n", "<br>") + "</html>");

            }
        });

// Panoul de Detalii/Rulare (Pune detaliile și panoul de rulare unul sub altul)
        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(detailsLabel, BorderLayout.NORTH);
        southPanel.add(runPanel, BorderLayout.CENTER);

        add(southPanel, BorderLayout.SOUTH);

// Ascunde panoul de rulare la început
        runPanel.setVisible(false);
        resultsList.addListSelectionListener(e -> {
            // Verifică dacă selecția este finalizată (nu pe măsură ce utilizatorul trage mouse-ul)
            if (!e.getValueIsAdjusting()) {
                Aparat selectedAparat = (Aparat) resultsList.getSelectedValue();
                if (selectedAparat != null && selectedAparat instanceof Aspirator) {
                    aspirator = (Aspirator) selectedAparat;
                    Aspirator selectedAparat1 = (Aspirator) selectedAparat;
                    // A. Afișează detaliile (folosind noua metodă getDetaliiComplete)
                    detailsLabel.setText("<html>" + selectedAparat1.detalii().replace("\n", "<br>") + "</html>");

                    // B. Afișează panoul de rulare
                    runPanel.setVisible(true);

                    // Revalidează și repictează fereastra pentru a afișa modificările de layout
                    revalidate();
                    repaint();
                } else if (selectedAparat!=null && selectedAparat instanceof Masina_de_fum) {
                    masinaFum = (Masina_de_fum) selectedAparat;
                    Masina_de_fum selectedAparat1 = (Masina_de_fum) selectedAparat;
                    // A. Afișează detaliile (folosind noua metodă getDetaliiComplete)
                    detailsLabel.setText("<html>" + selectedAparat1.detalii().replace("\n", "<br>") + "</html>");

                    // B. Afișează panoul de rulare
                    runPanel.setVisible(true);

                    // Revalidează și repictează fereastra pentru a afișa modificările de layout
                    revalidate();
                    repaint();
                }else
                { // Dacă se deselectează (deși JList păstrează de obicei selecția)
                    detailsLabel.setText("Selectați un aparat pentru a vedea detaliile...");
                    runPanel.setVisible(false);
                    revalidate();
                    repaint();}
            }
        });


        // ... finalizare JFrame ...
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack(); // Ajustează dimensiunea
        setVisible(true);
        this.setIconImage(icon);
    }
    private void Updatare(String val){
        if(val.equals("Aspirator"))
        updateLabel.setText("<html>"+"(m²)"+"</html>");
        else
            updateLabel.setText("<html>"+"(m³)"+"</html>");
    }
    private void performSearch() {

        String searchText = searchField.getText().toLowerCase();
        List<Aparat> matchingAparate = new ArrayList<>();
if(tipselectat.equals("Aspirator")){
        for (Aspirator a : listaAspiratoare) {
            // Căutare simplă: numele aparatului conține textul de căutare
            if (a.toString().toLowerCase().contains(searchText)) {
                matchingAparate.add(a);
            }
        }}
else{
    for (Masina_de_fum m : listaMasini) {
        if (m.toString().toLowerCase().contains(searchText)) {
            matchingAparate.add(m);
        }
    }
}

        // Actualizează JList cu noile rezultate
        Aparat[] data = matchingAparate.toArray(new Aparat[0]);
        resultsList.setListData(data);
    }
}
