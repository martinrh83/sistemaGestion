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
public class Financiera {

    private static ArrayList<Clientes> listacliente = new ArrayList<Clientes>();
    private static ArrayList<Empleado> listaempleado = new ArrayList<Empleado>();
    private static ArrayList<Plan> listaplan = new ArrayList<Plan>();
    public static int monto_maximo = 10000;
    public static int cantCredACTMax = 2;
    public static double int_diario = 0.005;

    public static ArrayList<Clientes> getListacliente() {
        return listacliente;
    }

    public static void setListacliente(ArrayList<Clientes> listacliente) {
        Financiera.listacliente = listacliente;
    }

    public static ArrayList<Plan> getListaplan() {
        return listaplan;
    }

    public static void setListaplan(ArrayList<Plan> listaplan) {
        Financiera.listaplan = listaplan;
    }

    public static int getMonto_maximo() {
        return monto_maximo;
    }

    public void setMonto_maximo(int monto_maximo) {
        this.monto_maximo = monto_maximo;
    }

    public static int getCantCredACTMax() {
        return cantCredACTMax;
    }

    public void setCantACTCredMax(int cantCredACTMax) {
        this.cantCredACTMax = cantCredACTMax;
    }

    public static Clientes buscarCliente(int cod) {
        for (int i = 0; i < listacliente.size(); i++) {
            if (cod == listacliente.get(i).getDni()) {
                return listacliente.get(i);
            }
        }
        return null;
    }

    public static ArrayList<Empleado> getListaempleado() {
        return listaempleado;
    }

    public static void setListaempleado(ArrayList<Empleado> listaempleado) {
        Financiera.listaempleado = listaempleado;
    }

    public static Empleado buscarEmpleado(int cod) {
        for (int i = 0; i < listaempleado.size(); i++) {
            if (cod == listaempleado.get(i).getLegajo()) {
                return listaempleado.get(i);
            }
        }
        return null;
    }

    public static Plan buscarPlan(String tipo_plan) {
        for (int i = 0; i < listaplan.size(); i++) {
            if (tipo_plan.compareTo(listaplan.get(i).getNombre_Plan()) == 0) {
                return listaplan.get(i);
            }
        }
        return null;
    }
}
