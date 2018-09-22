/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2lab_josepereira;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author joseph
 */
public class Hilo_hora  implements Runnable{
    private JLabel hora;
    public Hilo_hora(JLabel hora) {
        this.hora = hora;
    }
    
    @Override
    public void run() {
        while (true) {
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
            hora.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
