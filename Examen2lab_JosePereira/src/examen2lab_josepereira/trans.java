/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.io.Serializable;
import java.util.Date;

/**
 *
 Una transacción son todas las acciones que el usuario cliente puede hacer en el ATM sobre sus cuentas constan de Número de Cuenta, descripción de la acción, Fecha y hora.
 */
public class trans implements Serializable{
    private String numero_cuenta;
    private String Descripcion_de_accion;
    private Date Fecha;
    private String Hora;

    public trans() {
    }

    public trans(String numero_cuenta, String Descripcion_de_accion, Date Fecha, String Hora) {
        this.numero_cuenta = numero_cuenta;
        this.Descripcion_de_accion = Descripcion_de_accion;
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getDescripcion_de_accion() {
        return Descripcion_de_accion;
    }

    public void setDescripcion_de_accion(String Descripcion_de_accion) {
        this.Descripcion_de_accion = Descripcion_de_accion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    

    @Override
    public String toString() {
        return Descripcion_de_accion;
    }
    
    
}
