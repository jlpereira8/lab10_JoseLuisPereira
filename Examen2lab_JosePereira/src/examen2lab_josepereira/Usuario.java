/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.io.Serializable;
import java.util.ArrayList;

/**
 tienen un id Usuario , primer nombre , segundo nombre , primer apellido ,una contraseña  ,segundo apellido ,  año de nacimiento , año de afiliación , 
 transacciones que se han realizado sobre sus cuentas  y cualquier otro atributo que usted considere necesario.

 */
public class Usuario implements Serializable{
    private String Id;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String contra;
    private String segundo_apellido;
    private String ano_naci;
    private String ano_afiliacion;
    private ArrayList<trans> transacciones=new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String Id, String primer_nombre, String segundo_nombre, String primer_apellido, String contra, String segundo_apellido, String ano_naci, String ano_afiliacion) {
        this.Id = Id;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.contra = contra;
        this.segundo_apellido = segundo_apellido;
        this.ano_naci = ano_naci;
        this.ano_afiliacion = ano_afiliacion;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getAno_naci() {
        return ano_naci;
    }

    public void setAno_naci(String ano_naci) {
        this.ano_naci = ano_naci;
    }

    public String getAno_afiliacion() {
        return ano_afiliacion;
    }

    public void setAno_afiliacion(String ano_afiliacion) {
        this.ano_afiliacion = ano_afiliacion;
    }

    public ArrayList<trans> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<trans> transacciones) {
        this.transacciones = transacciones;
    }

    @Override
    public String toString() {
        return primer_nombre;
    }
    
    
}
