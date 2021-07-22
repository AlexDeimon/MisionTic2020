/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto03;

/**
 *
 * @author DIEGO
 */
public class Vehiculo {

    int velocidad = 0;
    int pasajeros = 0;
    String placa = "";
    String tipo = "";

    public Vehiculo() {
    }

    public Vehiculo(String tipo, int pasajeros, int velocidad, String placa) {
        this.velocidad = velocidad;
        this.pasajeros = pasajeros;
        this.placa = placa;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String vehiculo = "\tVehiculo " + tipo + " - " + "Placa: " + placa + "\n\tvelocidad: " + velocidad + " km/h\n\tpasajeros: " + pasajeros/*+"\t"+atributoAdicional()*/;
        return vehiculo;
    }

}
