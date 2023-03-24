package andreaortez_examen2p2;

import java.io.Serializable;
import java.util.ArrayList;

public class Deporte implements Serializable{

    private ArrayList<Torneo> torneos = new ArrayList();
    private String nombre;

    public Deporte() {
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
