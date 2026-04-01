/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.LinkedList;

/**
 *
 * @author kobak
 */
public class Proveedor extends Persona{
    private LinkedList<String> dias;
    private LinkedList<Producto> productos;

    public Proveedor(LinkedList<String> dias, String nombre, String cedula) {
        super(nombre, cedula);
        this.dias = dias;
        this.productos = new LinkedList<>();
    }

    public LinkedList<String> getDias() {
        return dias;
    }

    public void setDias(LinkedList<String> dias) {
        this.dias = dias;
    }    
 
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }
    
    public LinkedList<Producto> getProducto() {
        return productos;
    }
    
    public void agregarDiasEntrega(String dia) {
        dias.add(dia);
    }
    
    @Override
    public void mostrarNombreCompleto(){
        System.out.println("Hola proveedor");
    }
}