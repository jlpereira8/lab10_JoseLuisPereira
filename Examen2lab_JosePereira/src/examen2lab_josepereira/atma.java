/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.io.Serializable;
import java.util.ArrayList;

public class atma implements Serializable{
    /*
   el ATM tiene en su sistema guardada la ubicación  , un ID único , el año de fabricación , cada cuanto tiempo se debe hacer mantenimiento .
    */
    private String Ubicacion;
    private String Id_unico;
    private int ano_fabri;
    private String mantenimineto;
    private ArrayList<log_sistema>logs=new ArrayList();
    private int cant_500;
    private int cant_100;

    public atma() {
    }

    public atma(String Ubicacion, String Id_unico, int ano_fabri, String mantenimineto, int cant_500, int cant_100) {
        this.Ubicacion = Ubicacion;
        this.Id_unico = Id_unico;
        this.ano_fabri = ano_fabri;
        this.mantenimineto = mantenimineto;
        this.cant_500 = cant_500;
        this.cant_100 = cant_100;
    }

    public int getCant_500() {
        return cant_500;
    }

    public void setCant_500(int cant_500) {
        this.cant_500 = cant_500;
    }

    public int getCant_100() {
        return cant_100;
    }

    public void setCant_100(int cant_100) {
        this.cant_100 = cant_100;
    }

    

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getId_unico() {
        return Id_unico;
    }

    public void setId_unico(String Id_unico) {
        this.Id_unico = Id_unico;
    }

    public int getAno_fabri() {
        return ano_fabri;
    }

    public void setAno_fabri(int ano_fabri) {
        this.ano_fabri = ano_fabri;
    }

    public String getMantenimineto() {
        return mantenimineto;
    }

    public void setMantenimineto(String mantenimineto) {
        this.mantenimineto = mantenimineto;
    }

    public ArrayList<log_sistema> getLogs() {
        return logs;
    }

    public void setLogs(ArrayList<log_sistema> logs) {
        this.logs = logs;
    }

    @Override
    public String toString() {
        return Id_unico ;
    }
    
    
    
}
