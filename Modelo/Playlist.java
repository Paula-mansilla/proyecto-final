package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nombre;
    private List<Cancion> canciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void agregarCancion(Cancion c) {
        canciones.add(c);
    }

    public void eliminarCancion(Cancion c) {
        canciones.remove(c);
    }
}
