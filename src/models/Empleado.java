/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author kobak
 */
public class Empleado extends Persona {
    private Date f_ingreso;

    public Empleado(Date f_ingreso, String nombre, String cedula) {
        super(nombre, cedula);
        this.f_ingreso = f_ingreso;
    }

    public Date getF_ingreso() {
        return f_ingreso;
    }

    public void setF_ingreso(Date f_ingreso) {
        this.f_ingreso = f_ingreso;
    }

    @Override
    public void mostrarNombreCompleto(){
        System.out.println("Hola empleado");
    }
}
