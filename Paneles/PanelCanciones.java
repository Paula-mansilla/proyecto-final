package Paneles;

import Modelo.Cancion;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelCanciones extends JPanel {
    public PanelCanciones(List<Cancion> canciones) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(18,18,18));

        for (Cancion c : canciones) {
            JLabel label = new JLabel("• " + c.getTitulo() + " - " + c.getArtista());
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Arial", Font.PLAIN, 14));
            add(label);
        }
    }
}
