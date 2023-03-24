
package andreaortez_examen2p2;

import java.io.Serializable;

public class Partido implements Serializable{
    private String nombre1, nombre2;
    private int puntaje1, puntaje2;

    public Partido() {
    }

    public Partido(String nombre1, String nombre2, int puntaje1, int puntaje2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

}
