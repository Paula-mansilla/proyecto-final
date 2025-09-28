package Paneles;

import javax.swing.*;
import java.awt.*;

public class PanelPlaylists extends JPanel {

    public PanelPlaylists() {
        setLayout(new BorderLayout());
        setBackground(new Color(18,18,18));

        // Barra superior
        JPanel topBar = new JPanel(new BorderLayout());
        topBar.setBackground(new Color(18,18,18));

        JLabel title = new JLabel("Your Library");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttons.setBackground(new Color(18,18,18));

        JButton searchBtn = new JButton("🔍");
        JButton addBtn = new JButton("+");
        estilizarBoton(searchBtn);
        estilizarBoton(addBtn);

        buttons.add(searchBtn);
        buttons.add(addBtn);

        topBar.add(title, BorderLayout.WEST);
        topBar.add(buttons, BorderLayout.EAST);

        // Grid de playlists (3x3)
        JPanel grid = new JPanel(new GridLayout(3,3,20,20));
        grid.setBackground(new Color(18,18,18));
        grid.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        // Añadir playlists con imágenes
        grid.add(crearPlaylist("k-pop !", "nini", "src/imagenes/kpop.png"));
        grid.add(crearPlaylist("sza and frank ocean !", "nini", "src/imagenes/sza.png"));
        grid.add(crearPlaylist("wave to earth !", "nini", "src/imagenes/wave.png"));
        grid.add(crearPlaylist("k-r&b", "nini", "src/imagenes/krnb.png"));
        grid.add(crearPlaylist("brat ¿", "nini", "src/imagenes/brat.png"));
        grid.add(crearPlaylist("just a chill girl ¿", "nini", "src/imagenes/chill.png"));
        grid.add(crearPlaylist("Dark Blood", "nini", "src/imagenes/darkblood.png"));
        grid.add(crearPlaylist("Damn", "nini", "src/imagenes/damn.png"));
        grid.add(crearPlaylist("My Mix", "nini", "src/imagenes/mix.png"));

        add(topBar, BorderLayout.NORTH);
        add(grid, BorderLayout.CENTER);
    }

    private JPanel crearPlaylist(String nombre, String autor, String rutaImagen) {
        JPanel card = new JPanel();
        card.setLayout(new BorderLayout());
        card.setBackground(new Color(18,18,18));

        // Imagen del disco
        ImageIcon icon = new ImageIcon(rutaImagen);
        Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        JLabel cover = new JLabel(new ImageIcon(img));
        cover.setHorizontalAlignment(SwingConstants.CENTER);

        // Texto
        JLabel title = new JLabel(nombre);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 13));

        JLabel subtitle = new JLabel(autor);
        subtitle.setForeground(new Color(179,179,179));
        subtitle.setFont(new Font("Arial", Font.PLAIN, 12));

        JPanel textPanel = new JPanel(new GridLayout(2,1));
        textPanel.setBackground(new Color(18,18,18));
        textPanel.add(title);
        textPanel.add(subtitle);

        card.add(cover, BorderLayout.CENTER);
        card.add(textPanel, BorderLayout.SOUTH);

        return card;
    }

    private void estilizarBoton(JButton b) {
        b.setBackground(new Color(29,185,84));
        b.setForeground(Color.BLACK);
        b.setFocusPainted(false);
        b.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
    }
}
