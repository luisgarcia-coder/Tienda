/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author kobak
 */
public abstract class Cliente extends Persona{
    private int puntos;
    private String direccion;

    public Cliente(int puntos, String direccion, String nombre, String cedula) {
        super(nombre, cedula);
        this.puntos = puntos;
        this.direccion = direccion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public void mostrarNombreCompleto(){
        System.out.println("Hola cliente");
    }
}