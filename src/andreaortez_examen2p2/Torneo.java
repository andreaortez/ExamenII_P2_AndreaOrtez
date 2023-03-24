package andreaortez_examen2p2;

import java.io.Serializable;
import java.util.ArrayList;

public class Torneo implements Serializable {

    private String nombre, periodo, deporte;
    private ArrayList<Equipo> equipos = new ArrayList();
    private ArrayList<Partido> partidos = new ArrayList();

    public Torneo() {
    }

    public Torneo(String nombre, String periodo) {
        this.nombre = nombre;
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
