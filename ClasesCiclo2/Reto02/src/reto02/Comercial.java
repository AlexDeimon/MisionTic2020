package reto02;

public class Comercial extends Vehiculo {

    String cargaMaxima = "";
   
    public Comercial(){
    }
    
    public Comercial(String tipo, int pasajeros,int velocidad, String placa, String cargaMaxima) {
        super(tipo, pasajeros, velocidad, placa);
        this.cargaMaxima = cargaMaxima;
    }

    public String toString() {
        return super.toString()+"\n\tCarga Máxima: "+cargaMaxima+"Kg";
    }

}
