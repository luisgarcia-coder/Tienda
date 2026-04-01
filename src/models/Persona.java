/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kobak
 */
public abstract class Persona {
    private String nombre;
    private String cedula;
    private String telefono;
    private int puntos;

    //Este es el método constructor
    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        //this.telefono = "";
        //this.puntos = 0;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public abstract void mostrarNombreCompleto();
}