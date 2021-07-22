package reto02;

public class Particular extends Vehiculo {

    String color = "";

    public Particular(){
    }
    
    public Particular(String tipo, int pasajeros,int velocidad, String placa, String color) {
        super(tipo, pasajeros, velocidad, placa);
        this.color = color;
    }

    public String toString() {
        return super.toString()+"\n\tcolor: " + color+"\n";
    }
}
