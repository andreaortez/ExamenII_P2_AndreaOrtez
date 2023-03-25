
package andreaortez_examen2p2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminDeportes {
    private File archivo = null;
    private ArrayList<Deporte> deportes = new ArrayList();
    
    public AdminDeportes( String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(ArrayList<Deporte> deportes) {
        this.deportes = deportes;
    }
    
    public void setDeporte(Deporte u){
        deportes.add(u);
    }
    public void escribirArchivo(){
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Deporte t : deportes) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    public void cargarArchivo(){
        try {
            deportes = new ArrayList();
            Deporte temp; 
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto= new ObjectInputStream(entrada);
                try {
                    while ((temp = (Deporte) objeto.readObject()) != null) {
                        deportes.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final deSSSl archivo
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
