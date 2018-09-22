/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author joseph
 */
public class administrador_binario_atm implements Serializable{

    private ArrayList<atma> lista_atms = new ArrayList();
    private File archivo = null;
    
    public administrador_binario_atm(String path) {
        archivo = new File(path);
    }

    public ArrayList<atma> getLista_atms() {
        return lista_atms;
    }

    public void setLista_atms(ArrayList<atma> lista_atms) {
        this.lista_atms = lista_atms;
    }

    

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrador{" + "listapersonas=" + lista_atms + '}';
    }

    public void setUsuario(atma p) {
        this.lista_atms.add(p);
    }

    public void cargarArchivo() {
        try {
           lista_atms = new ArrayList();
           atma temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (atma) objeto.readObject()) != null) {
                        lista_atms.add(temp);
                    }
                } catch (Exception e) {//encontro final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribir() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (atma t : lista_atms) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
