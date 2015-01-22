/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import vistas.Principal;

/**
 *
 * @author Martin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clientes c = new Clientes("patricia", "gonzales", 30000100, "paraguay", null, 4000, 64579729);
        Clientes p = new Clientes("mariana", "rivadeneira", 30000103, "paraguay", null, 4000, 64579728);
        Empleado empleado1 = new Empleado(36034, "Rolphy", "Romano");
        Empleado empleado2 = new Empleado(38066, "Walter", "White");
        Empleado empleado3 = new Empleado(37947, "Jesse", "Pinkman");
        Financiera.getListacliente().add(c);
        Financiera.getListacliente().add(p);
        Financiera.getListaempleado().add(empleado1);
        Financiera.getListaempleado().add(empleado2);
        Financiera.getListaempleado().add(empleado3);
        Plan tipo1 = new Plan(1, "Plan 3", 3, 0.05);
        Plan tipo2 = new Plan(2, "Plan 6", 6, 0.07);
        Plan tipo3 = new Plan(3, "Plan 9", 9, 0.12);
        Plan tipo4 = new Plan(4, "Plan 12", 12, 0.18);
        Financiera.getListaplan().add(tipo1);
        Financiera.getListaplan().add(tipo2);
        Financiera.getListaplan().add(tipo3);
        Financiera.getListaplan().add(tipo4);
        /*Credito cr = new Credito(1, 21, "spsp", null, null, null);
       
      
       
       System.out.println( Clientes.getListacreditos().add(cr));*/
        Financiera.getListaplan().add(tipo2);
       // System.out.println(Financiera.getListaempleado());
        //System.out.println(Clientes.getListacreditos().add(credito1));
       // System.out.println(Financiera.getListacliente());

        Principal window = new Principal();
        window.setVisible(true);
    }

}
