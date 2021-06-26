/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_victorcruz;

import java.io.Serializable;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Reporte implements Serializable{
     private String reporte;
     private static final long SerialVersionUID=781L;

    public Reporte() {
    }

  

    public Reporte(String reporte) {
        this.reporte = reporte;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public String toString() {
        return  "  Reporte Ensamblaje: " + reporte;
    }

   
     
     
     
}
