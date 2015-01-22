/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

/**
 *
 * @author Martin
 */
public class Plan {
    private int nro_Plan;
    private String nombre_Plan;
    private int cant_cuotas;
    private double tasa_interes;

    public Plan(int nro_Plan, String nombre_Plan, int cant_cuotas,double tasa_interes) {
        this.nro_Plan = nro_Plan;
        this.nombre_Plan = nombre_Plan;
        this.cant_cuotas = cant_cuotas;
        this.tasa_interes=tasa_interes;
        
    }

    public int getNro_Plan() {
        return nro_Plan;
    }

    public void setNro_Plan(int nro_Plan) {
        this.nro_Plan = nro_Plan;
    }

    public String getNombre_Plan() {
        return nombre_Plan;
    }

    public void setNombre_Plan(String nombre_Plan) {
        this.nombre_Plan = nombre_Plan;
    }

    public int getCant_cuotas() {
        return cant_cuotas;
    }

    public void setCant_cuotas(int cant_cuotas) {
        this.cant_cuotas = cant_cuotas;
    }

    public double getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(double tasa_interes) {
        this.tasa_interes = tasa_interes;
    }

    @Override
    public String toString() {
        return "Plan{" + "nro_Plan=" + nro_Plan + ", nombre_Plan=" + nombre_Plan + ", cant_cuotas=" + cant_cuotas + ", tasa_interes=" + tasa_interes + '}';
    }

   



}
