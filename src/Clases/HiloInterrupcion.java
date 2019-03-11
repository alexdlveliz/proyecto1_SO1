/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Oswaldo Alvarez <mynoswaldo@gmail.com>
 */
public class HiloInterrupcion extends Thread {

    private Hilo hilo;
    private int cont;

    public HiloInterrupcion() {
        this.cont = 0;
    }

    public void setHilo(Hilo hilo) {
        this.hilo = hilo;
    }

    @Override
    public void run() {
        
        while (cont <= 100) {
            try {
                this.hilo.suspend();
                this.cont++;
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloInterrupcion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.hilo.terminarXInterrupcion();
        this.hilo.resume();
    }

}
