package Ventanas;

import javax.swing.*;
import java.awt.*;
import Paneles.PanelLogin;

public class VentanaLogin extends JFrame {
    public VentanaLogin() {
        setTitle("Spotify");
        setSize(1200, 1200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        PanelLogin loginPanel = new PanelLogin();
        add(loginPanel.getJPanel(), BorderLayout.CENTER);

        setVisible(true);
    }
}

