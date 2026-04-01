/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 *
 * @author kobak
 */
public class GestorProducto {
    private LinkedList<Producto> productos;
    
    public GestorProducto(){
        productos=new LinkedList<>();
    }
    
    //Create(crear): agregar producto
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    //Read(leer): listar productos
    public LinkedList<Producto> listarProductos(){
        return productos;
    }
    
    //Read(buscar): Buscar producto
    public Producto buscarProducto(String nombre){
        for(Producto p: productos){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    public Producto buscarProducto(int codigo){
        for(Producto p: productos){
            if(p.getNombre().equals(codigo)){
                return p;
            }
        }
        return null;
    }
    
    //Update(actualizar): actualizar producto
    public boolean actualizarProducto(String nombre, Producto nuevoProducto){
        for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getNombre().equals(nombre)){
                productos.set(i,nuevoProducto);
                return true;                
            }
        }
        return false;
    }
    
    //Delete(eliminar): eliminar producto
    /*
    public boolean eliminarProducto(String nombre){
        for(int i=0; i<productos.size(); i++){
            if(productos.get(i).getNombre().equals(nombre)){
                productos.remove(i);
                return true;                
            }
        }
        return false;
    }*/
    
    //Delete(eliminar): eliminar producto nivel experto
    public boolean eliminarProducto(String nombre){
        return productos.removeIf(p->p.getNombre().equals(nombre));
    }
}