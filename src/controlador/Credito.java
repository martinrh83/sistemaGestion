/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.util.ArrayList;

/**
 *
 * @author Martin
 */
public class Credito {
    
    private static int secuencia = 0;
    private ArrayList<Cuota> cuotas = new ArrayList<Cuota>();
    private  int nro_Credito;
    private  int capital;
    private String estadoCredito;
    private Empleado empleado;
    private Plan plan;
    private Clientes cliente;
    private Fecha fecha;
    /// private Cuota cuotas;
    /* public Credito() {
    this.nro_Credito = 2;
    this.capital = 0;
    this.estadoCredito = "pendiente";
    }*/
    
    public Credito() {
    }

    public Credito(int capital, String estadoCredito, Empleado empleado, Plan plan, Clientes cliente,Fecha fecha) {
        secuencia++;
        this.nro_Credito = secuencia;
        this.capital = capital;
        this.estadoCredito = estadoCredito;
        this.empleado = empleado;
        this.plan = plan;
        this.cliente = cliente;
        this.fecha=fecha;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }
   
  public void addCuota(int nro_cuota, String estado_cuota, float interes_cuota, double monto_cuota) {
      cuotas.add(new Cuota(nro_cuota, estado_cuota, interes_cuota, monto_cuota));
  }

    public int getNro_Credito() {
        return nro_Credito;
    }

    public void setNro_Credito(int nro_Credito) {
        this.nro_Credito = nro_Credito;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getEstadoCredito() {
        return estadoCredito;
    }

    public void setEstadoCredito(String estadoCredito) {
        this.estadoCredito = estadoCredito;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Credito{" + "nro_Credito=" + nro_Credito + ", capital=" + capital + ", estadoCredito=" + estadoCredito + ", empleado=" + empleado + ", plan=" + plan + ", cliente=" + cliente + '}';
    }

    public void crearCuotas(Plan plan) {
        for (int i = 0; i < plan.getCant_cuotas(); i++) {
            cuotas.add(new Cuota(i+1, "pendiente",
                    (float)(capital * plan.getTasa_interes()),
                    (capital / plan.getCant_cuotas())));
            
        }
    }
    
}
