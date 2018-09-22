/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.io.Serializable;

/**
 *
 * la Cuenta tiene el siguiente atributo NumCuenta , saldo disponible , Id del usuario propietario , 
 */
public class Cuenta implements Serializable{
    private String numero_cuenta;
    private int saldo_disponible;
    private String Id_usuario;
    private Usuario propietario;

    public Cuenta() {
    }

    public Cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
       
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getSaldo_disponible() {
        return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
        this.saldo_disponible = saldo_disponible;
    }

    public String getId_usuario() {
        return Id_usuario;
    }

    public void setId_usuario(String Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return numero_cuenta ;
    }
    
    
}
