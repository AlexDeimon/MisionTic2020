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
public class Comercial extends Vehiculo {

    String cargaMaxima = "";

    public Comercial() {
    }

    public Comercial(String tipo, int pasajeros, int velocidad, String placa, String cargaMaxima) {
        super(tipo, pasajeros, velocidad, placa);
        this.cargaMaxima = cargaMaxima;
    }

    public String toString() {
        return super.toString() + "\n\tCarga máxima: " + cargaMaxima + "Kg";
    }

}
