package Paneles;

import javax.swing.*;
import java.awt.*;

public class PanelAgregarCancion extends JPanel {
    private JTextField tituloField;
    private JTextField artistaField;
    private JButton addBtn;

    public PanelAgregarCancion() {
        setLayout(new GridLayout(3,2,10,10));
        setBackground(new Color(18,18,18));

        JLabel t1 = new JLabel("Título:");
        t1.setForeground(Color.WHITE);
        JLabel t2 = new JLabel("Artista:");
        t2.setForeground(Color.WHITE);

        tituloField = new JTextField();
        artistaField = new JTextField();

        addBtn = new JButton("Agregar Canción");
        addBtn.setBackground(new Color(29,185,84));

        add(t1); add(tituloField);
        add(t2); add(artistaField);
        add(new JLabel("")); add(addBtn);
    }

    public JButton getAddBtn() { return addBtn; }
    public String getTitulo() { return tituloField.getText(); }
    public String getArtista() { return artistaField.getText(); }
}
