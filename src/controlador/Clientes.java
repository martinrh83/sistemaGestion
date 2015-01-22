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
public class Clientes {
    private ArrayList<Credito> creditos = new ArrayList<Credito>();
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private String estado;
    private float sueldo;
    private int telefono;

    /**
     *
     */
   // public  static ArrayList<Credito> listacreditos = new ArrayList<Credito>();
    public Clientes(String nombre, String apellido, int dni, String domicilio,
            String estado, float sueldo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.estado = estado;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }

    public void addCredito(Credito credito) {
        creditos.add(credito);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Credito> getListacreditos() {
        return creditos;
    }

    public int calcularCCA() {
        int i = 0;
        int cca = 0;
        
        while (i < creditos.size()) {
            if ("pendiente".equals(creditos.get(i).getEstadoCredito())) {
                cca++;
                System.out.println(creditos.get(i).getEstadoCredito());
            }
            i++;
        }
        return cca;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", estado=" + estado + ", sueldo=" + sueldo + ", telefono=" + telefono + '}';
    }

}
