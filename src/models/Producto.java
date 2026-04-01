/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author kobak
 */
public class Producto {
    private float precio;
    private float peso;
    private String nombre;
    private LocalDate f_caducidad;    
    private LinkedList<Proveedor> proveedores;

    public Producto(float precio, float peso, String nombre, LocalDate f_caducidad) {
        this.precio = precio;
        this.peso = peso;
        this.nombre = nombre;
        this.f_caducidad = f_caducidad;
        this.proveedores = new LinkedList<>();
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public LocalDate getF_caducidad() {
        return f_caducidad;
    }

    public void setF_caducidad(LocalDate f_caducidad) {
        this.f_caducidad = f_caducidad;
    }
    
    public void agregarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }
    
    public void eliminarProveedor(Proveedor proveedor) {
        proveedores.remove(proveedor);
    }
    
    public LinkedList<Proveedor> getProveedores() {
        return proveedores;
    }
    /*
    public int calcularPrecio(int precio) {
        int preciofinal = precio + 10000;
        return preciofinal;
    }
    
    public int calcularPrecio(int precio, int aumento) {
        int preciofinal = precio + aumento;
        return preciofinal;
    }*/
}