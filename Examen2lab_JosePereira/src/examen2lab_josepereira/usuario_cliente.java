/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class usuario_cliente extends Usuario implements Serializable{
    private ArrayList<Cuenta>cuentas=new ArrayList<>();

    public usuario_cliente() {
    }

    public usuario_cliente(String Id, String primer_nombre, String segundo_nombre, String primer_apellido, String contra, String segundo_apellido, String ano_naci, String ano_afiliacion) {
        super(Id, primer_nombre, segundo_nombre, primer_apellido, contra, segundo_apellido, ano_naci, ano_afiliacion);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    
    
}
