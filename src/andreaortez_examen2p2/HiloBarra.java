package andreaortez_examen2p2;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class HiloBarra extends Thread {

    private JProgressBar barra;
    private int torneos;
    private JLabel etiqueta;

    public HiloBarra(JProgressBar barra, int torneos, JLabel etiqueta) {
        this.barra = barra;
        this.torneos = torneos;
        this.etiqueta = etiqueta;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public int getTorneos() {
        return torneos;
    }

    public void setTorneos(int torneos) {
        this.torneos = torneos;
    }

    public JLabel getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public void run() {
        barra.setMaximum(torneos);
        for (int i = 0; i < torneos; i++) {
            barra.setValue(barra.getValue() + 1);
            try {
                Thread.sleep(7000);
            } catch (InterruptedException ex) {
            }
        }
        etiqueta.setText("Listo");
    }
}
