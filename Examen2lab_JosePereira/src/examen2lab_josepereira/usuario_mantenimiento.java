/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.io.Serializable;
import java.util.ArrayList;


public class usuario_mantenimiento extends Usuario implements Serializable{
    
    private ArrayList<String>atms_id=new ArrayList<>();

    public usuario_mantenimiento() {
    }

    public usuario_mantenimiento(String Id, String primer_nombre, String segundo_nombre, String primer_apellido, String contra, String segundo_apellido, String ano_naci, String ano_afiliacion) {
        super(Id, primer_nombre, segundo_nombre, primer_apellido, contra, segundo_apellido, ano_naci, ano_afiliacion);
    }

    public ArrayList<String> getAtms_id() {
        return atms_id;
    }

    public void setAtms_id(ArrayList<String> atms_id) {
        this.atms_id = atms_id;
    }

    
    
}
