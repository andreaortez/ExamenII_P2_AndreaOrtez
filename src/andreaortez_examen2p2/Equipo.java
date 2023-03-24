
package andreaortez_examen2p2;

import java.io.Serializable;

public class Equipo implements Serializable{
    private String nombre;
    private int puntos;

    public Equipo() {
    }

    public Equipo(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
