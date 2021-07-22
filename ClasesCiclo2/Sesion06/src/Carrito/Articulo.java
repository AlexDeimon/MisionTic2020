/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carrito;

/**
 *
 * @author DIEGO
 */

public class Articulo {
    private int cantidad=0;
    private double precioUnitario=0.0;
    private String nombre="";
    
    public Articulo(String nombre, int cantidad, double precio){
        this.cantidad=cantidad;
        this.nombre=nombre;
        this.precioUnitario=precio;
    }
    
    public double PrecioTotal(){
        return this.cantidad*this.precioUnitario;
    }
    
    @Override
    public String toString(){
        String articulo= nombre+" x"+cantidad+ " $"+(int)PrecioTotal();
        return articulo;
    }
}
