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
 * son todas las acciones que se realizan en el ATM (inicio sesión, fallos*,
 * cantidad de dinero retirado, cantidad de dinero ingresado) constan del
 * Usuario que realiza la acción, la descripción de la acción y la fecha y hora
 * en que realizo).
 */
public class log_sistema implements Serializable {

    /*
     (inicio sesión, fallos*, cantidad de dinero retirado, cantidad de dinero ingresado) constan del Usuario que realiza la acción, 
      la descripción de la acción y la fecha y hora en que realizo).
     */

    private String Id_user;
    private String Descripcion;
    private Date fecha;
    private String hora;

    public log_sistema() {
    }

    public log_sistema(String Id_user, String Descripcion, Date fecha, String hora) {
        this.Id_user = Id_user;
        this.Descripcion = Descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }

    

    public String getId_user() {
        return Id_user;
    }

    public void setId_user(String Id_user) {
        this.Id_user = Id_user;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

   

    @Override
    public String toString() {
        return "log_sistema{" + "Id_user=" + Id_user + ", Descripcion=" + Descripcion + ", fecha=" + fecha + ", hora=" + hora + '}';
    }

}
