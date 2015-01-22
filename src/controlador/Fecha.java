/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Fecha extends Date{
    public void setFecha(Date date){
        this.setYear(date.getYear());
        this.setMonth(date.getMonth());
        this.setDate(date.getDate());
    }
    
    @Override
    public String toString(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(this);
    }
}
