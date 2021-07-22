package reto02;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    static ArrayList<Vehiculo> listaVehiculos=new ArrayList<>();
    static String cabecera = "***Inventario de vehículos***";

    public Inventario() {
    }

    public static void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
        
    }
    

    public static void listarVehículos() {
        System.out.println(cabecera);
        for (Vehiculo vehiculo:listaVehiculos) {
            System.out.println(vehiculo);
        }
    }

    public static void procesarComandos(Scanner objeto1) {
        boolean bandera = true;
        while (bandera) {
            String[] comando = objeto1.nextLine().split("&");
            switch (comando[0]) {
                case "1":
                    Comercial a=new Comercial(String.valueOf(comando[1]), Integer.parseInt(comando[2]), Integer.parseInt(comando[3]), String.valueOf(comando[4]),String.valueOf(comando[5]));
                    Particular b=new Particular(String.valueOf(comando[1]), Integer.parseInt(comando[2]), Integer.parseInt(comando[3]), String.valueOf(comando[4]),String.valueOf(comando[5]));
                    if("Comercial".equals(comando[1])){
                        agregarVehiculo(a);
                    }else if("Particular".equals(comando[1])){
                        agregarVehiculo(b);
                    }
                    
                    break;
                case "2":
                    listarVehículos();
                    break;
                case "3":
                    bandera = false;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        procesarComandos(objeto1);

    }
}
