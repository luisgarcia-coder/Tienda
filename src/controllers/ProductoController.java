/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import models.GestorProducto;
import models.Producto;

/**
 *
 * @author kobak
 */
public class ProductoController {
    private static GestorProducto gestorp = new GestorProducto();
    
    public void guardarProducto(float precio, int peso, String nombre, LocalDate fecha){
        System.out.println("Producto enviado al controlador");
        Producto p = new Producto(precio,peso,nombre,fecha);
        gestorp.agregarProducto(p);
        System.out.println("Producto agregado correctamente");
    }
    
    public LinkedList<Producto> listarProductos(){
        return gestorp.listarProductos();
    }
}