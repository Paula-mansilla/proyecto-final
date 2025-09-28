package Ventanas;

import Modelo.Cancion;
import Modelo.Playlist;
import Modelo.Usuario;
import Paneles.PanelPlaylists;
import Paneles.PanelCanciones;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private Usuario usuario;

    public VentanaPrincipal(Usuario usuario) {
        this.usuario = usuario;

        setTitle("Spotify - " + usuario.getNombre());
        setSize(1200,1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(18,18,18));

        // Crear playlists de ejemplo
        Playlist p1 = new Playlist("k-pop !");
        p1.agregarCancion(new Cancion("Cupid","Fifty Fifty"));
        p1.agregarCancion(new Cancion("Super Shy","New Jeans"));

        Playlist p2 = new Playlist("Chill Girl");
        p2.agregarCancion(new Cancion("Ocean Waves","Lo-fi Artist"));

        usuario.agregarPlaylist(p1);
        usuario.agregarPlaylist(p2);

        // Panel derecho: Canciones de la primera playlist
        PanelCanciones cancionesPanel = new PanelCanciones(p1.getCanciones());
        add(new JScrollPane(cancionesPanel), BorderLayout.CENTER);

            setTitle("Spotify Clone");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Agregar el panel de playlists
        add(new PanelPlaylists());

        setVisible(true);

        setVisible(true);
    }
}
