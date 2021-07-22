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
public class Particular extends Vehiculo {

    String color = "";

    public Particular() {
    }

    public Particular(String tipo, int pasajeros, int velocidad, String placa, String color) {
        super(tipo, pasajeros, velocidad, placa);
        this.color = color;
    }

    public String toString() {
        return super.toString() + "\n\tcolor: " + color;
    }
}
