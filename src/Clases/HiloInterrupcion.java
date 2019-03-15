/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Oswaldo Alvarez <mynoswaldo@gmail.com>
 */
public class HiloInterrupcion extends Thread {

    private Hilo hilo;
    private int cont;
private JButton boton;
private JLabel etiqueta;
    public HiloInterrupcion() {
        this.cont = 0;
    }

    public void setHilo(Hilo hilo) {
        this.hilo = hilo;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public void setEtiqueta(JLabel etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public void run() {
        this.hilo.suspend();
        this.boton.setEnabled(false);
        while (cont <= 30) {
            try {
                etiqueta.setText(""+cont);
                this.cont++;
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloInterrupcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.boton.setEnabled(true);
        this.hilo.terminarXInterrupcion();
        this.hilo.resume();
    }

}
