/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.time.LocalDate;

/**
 *
 * @author kobak
 */
public class Factura {
    private LocalDate fecha;
    private float valor;
    private int puntos_n;

    public Factura(LocalDate fecha, float valor, int puntos_n) {
        this.fecha = fecha;
        this.valor = valor;
        this.puntos_n = puntos_n;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public float getValor() {
        return valor;
    }

    public int getPuntos_n() {
        return puntos_n;
    }
    
}