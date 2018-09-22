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
public class Hilo_fecha  implements Runnable{
    private JLabel fecha;

    public Hilo_fecha(JLabel fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public void run() {
        while (true) {
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("yyyy-MM-dd ");
            fecha.setText(f.format(h));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
