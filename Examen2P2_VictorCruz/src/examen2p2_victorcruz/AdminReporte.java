/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_victorcruz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Victor Jafet Cruz
 */
public class AdminReporte {
     private ArrayList<Reporte> listaReporte = new ArrayList();
    private File archivo = null;

    public AdminReporte(String path) {
        archivo = new File(path);
    }

    public ArrayList<Reporte> getListaReporte() {
        return listaReporte;
    }

    public void setListaReporte(ArrayList<Reporte> listaReporte) {
        this.listaReporte = listaReporte;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setBaterias(Reporte c) {
        listaReporte.add(c);
    }

    public void cargarArchivo() {
        try {
            listaReporte = new ArrayList();
            Reporte temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Reporte) objeto.readObject()) != null) {
                        listaReporte.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Reporte t : listaReporte) {
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
}
