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

public class Cuota {
    private int nro_cuota;
    private String estado_cuota;
    private float interes_cuota;
    private double monto_cuota;
    private  Fecha fecha_venc;

    public Cuota(int nro_cuota, String estado_cuota, float interes_cuota, double monto_cuota) {
        this.nro_cuota = nro_cuota;
        this.estado_cuota = estado_cuota;
        this.interes_cuota = interes_cuota;
        this.monto_cuota = monto_cuota;
    }

    public int getNro_cuota() {
        return nro_cuota;
    }

    public void setNro_cuota(int nro_cuota) {
        this.nro_cuota = nro_cuota;
    }

    public String getEstado_cuota() {
        return estado_cuota;
    }

    public void setEstado_cuota(String estado_cuota) {
        this.estado_cuota = estado_cuota;
    }

    public float getInteres_cuota() {
        return interes_cuota;
    }

    public void setInteres_cuota(float interes_cuota) {
        this.interes_cuota = interes_cuota;
    }

    public double getMonto_cuota() {
        return monto_cuota;
    }

    public void setMonto_cuota(double monto_cuota) {
        this.monto_cuota = monto_cuota;
    }

    @Override
    public String toString() {
        return "Cuota{" + "nro_cuota=" + nro_cuota + ", estado_cuota=" + estado_cuota + ", interes_cuota=" + interes_cuota + ", monto_cuota=" + monto_cuota + '}';
    }
    
    
    
    
    
    
    
}
