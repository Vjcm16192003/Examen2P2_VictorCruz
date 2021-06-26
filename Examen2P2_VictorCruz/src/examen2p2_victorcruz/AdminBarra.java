/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_victorcruz;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor Jafet Cruz
 */
public class AdminBarra extends Thread {

    private JProgressBar barra;
    private Bateria Bateria;
    private boolean vive;
    private boolean avanzar;
    //int total;
    private JTable tabla;

    public AdminBarra(JProgressBar barra, Bateria bateria, JTable tabla) {
        this.barra = barra;
        this.Bateria = bateria;
        this.vive = true;
        this.avanzar = true;
        this.tabla = tabla;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Bateria getBateria() {
        return Bateria;
    }

    public void setBateria(Bateria Bateria) {
        this.Bateria = Bateria;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvazar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public void run() {
        DefaultTableModel table = (DefaultTableModel) tabla.getModel();
        barra.setMaximum(Bateria.getTiempo());
        barra.setString("Ensamblando...");
        while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue() + 1);

                if (barra.getValue() == Bateria.getTiempo()) {
                    Object[] o = {Bateria.getMarca(), Bateria.getTiempo()};
                    table.addRow(o);
                    tabla.setModel(table);
                    barra.setValue(0);
                    avanzar = false;
                   

                }//fin del if
            }//fin de avanzar
            try {
                Thread.sleep(1000);
            }//fin del try n catch
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }//fin del while del vive
    }//fin del metodo run
}//fin de la clase
    
    
    
    
    

