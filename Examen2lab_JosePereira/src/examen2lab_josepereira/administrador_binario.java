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
public class administrador_binario implements Serializable{

    private ArrayList<Usuario> listausuarios = new ArrayList();
    private File archivo = null;
    
    public administrador_binario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListausuarios() {
        return listausuarios;
    }

    public void setListausuarios(ArrayList<Usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "administrador{" + "listapersonas=" + listausuarios + '}';
    }

    public void setUsuario(Usuario p) {
        this.listausuarios.add(p);
    }

    public void cargarArchivo() {
        try {
            listausuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        listausuarios.add(temp);
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
            for (Usuario t : listausuarios) {
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
