/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import views.PantallaPrincipal;

/**
 *
 * @author kobak
 */
public class DiagramaClasesTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PantallaPrincipal pantalla=new PantallaPrincipal();
        pantalla.setVisible(true);
        LinkedList<String> diasProveedor = new LinkedList<>();
        
        //Creamos proveedores
        Proveedor proveedor1 = new Proveedor(diasProveedor, "Luis", "1018");
        Proveedor proveedor2 = new Proveedor(diasProveedor, "Javier", "4208");
        
        //Creamos productos
        Producto producto1 = new Producto(3,1, "Papa", LocalDate.of(2026,05,30));
        Producto producto2 = new Producto(2,4, "Jugo", LocalDate.of(2026,06,3));
        Producto producto3 = new Producto(1,10, "Miel", LocalDate.of(2028,12,31));
        
        //Relacionamos proveedores con productos
        proveedor1.agregarProducto(producto1);
        proveedor1.agregarProducto(producto3);
        proveedor2.agregarProducto(producto2);
        proveedor2.agregarProducto(producto3);
        
        //Relacionamos productos con proveedores
        producto1.agregarProveedor(proveedor1);
        producto3.agregarProveedor(proveedor1);
        producto2.agregarProveedor(proveedor2);
        producto3.agregarProveedor(proveedor2);
        
        System.out.println("Productos del proveedor 1: " + proveedor1.getProducto().size());
        for(Producto p:proveedor1.getProducto()){
            System.out.println("Producto: " + p.getNombre() + ". Precio: " + p.getPrecio());
        }
        
        System.out.println("\nProductos del proveedor 2: " + proveedor2.getProducto().size());
        for(Producto p:proveedor2.getProducto()){
            System.out.println("Producto: " + p.getNombre() + ". Precio: " + p.getPrecio());
        }
        
        System.out.println("\n\nProveedores por producto 1, " + producto1.getNombre());
        for (Proveedor p:producto1.getProveedores()){
            System.out.println("Proveedor: " + p.getNombre());
        }
        
        System.out.println("Proveedores por producto 2, " + producto2.getNombre());
        for (Proveedor p:producto2.getProveedores()){
            System.out.println("Proveedor: " + p.getNombre());
        }
        
        System.out.println("Proveedores por producto 3, " + producto3.getNombre());
        for (Proveedor p:producto3.getProveedores()){
            System.out.println("Proveedor: " + p.getNombre());
        }
    }    
}