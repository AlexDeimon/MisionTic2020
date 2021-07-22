/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto03;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DIEGO
 */

public class Inventario {

    static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    static int cantidadComercial;
    static int cantidadParticular;
    static int totalComerciales = 100;
    static int totalParticulares = 100;
    static String encabezado1 = "***Inventario de vehículos***";
    static String encabezado2 = "CONCESIONARIO UNCAR\n" + "UNCAR - UNIVA\n" + "NIT: 899.999.063";

    public Inventario() {
    }

    public static void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public static void listarVehículos() {
        System.out.println(encabezado1);
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo);
        }
    }

    public static long totalXvehiculos(long cantidad, String tipo) {
        long valor = 0;
        if (tipo.equals("Comercial")) {
            valor = 40000000;
        } else if (tipo.equals("Particular")) {
            valor = 30000000;
        }
        long acumulado = cantidad * valor;
        return acumulado;
    }

    public static long iva(long total, int numeroVehiculos) {
        long iva = 0;
        double j = 0.2;
        for (int i = 0; i < numeroVehiculos; i++) {
            if (j >= 0) {
                iva = (long) Math.ceil(total * j);
            } else {
                iva = 0;
            }
            j -= 0.01;
        }
        return iva;
    }

    public static void facturar(String comando1, int comando2, String comando3, int comando4, String comando5) {
        cantidadComercial = comando4;
        cantidadParticular = comando2;
        if(totalComerciales-cantidadComercial>=0 && totalParticulares-cantidadParticular>=0){
            System.out.println(encabezado2);
            System.out.println("Cliente: " + comando5 + "\nVehículo Cant Precio");
            long totalParticular = totalXvehiculos(cantidadParticular, comando1);
            long totalComercial = totalXvehiculos(cantidadComercial, comando3);
            System.out.println(comando1 + " X" + comando2 + " $30000000");
            System.out.println(comando3 + " X" + comando4 + " $40000000");
            long acumulado = totalParticular + totalComercial;
            int totalVehiculos = cantidadComercial + cantidadParticular;
            long iva = iva(acumulado, totalVehiculos);
            System.out.println("Iva: $" + iva);
            long total = acumulado + iva;
            System.out.println("Total: $" + total);
            totalComerciales -= cantidadComercial;
            totalParticulares -= cantidadParticular;
        }
        else
            System.out.println("Lo sentimos no tenemos stock suficiente");
        System.out.println("---");
    }

    public static void procesarComandos(Scanner objeto1) {
        boolean bandera = true;
        while (bandera) {
            String[] comando = objeto1.nextLine().split("&");
            switch (comando[0]) {
                case "1":
                    Comercial a = new Comercial(String.valueOf(comando[1]), Integer.parseInt(comando[2]), Integer.parseInt(comando[3]), String.valueOf(comando[4]), String.valueOf(comando[5]));
                    Particular b = new Particular(String.valueOf(comando[1]), Integer.parseInt(comando[2]), Integer.parseInt(comando[3]), String.valueOf(comando[4]), String.valueOf(comando[5]));
                    if ("Comercial".equals(comando[1])) {
                        agregarVehiculo(a);
                    } else if ("Particular".equals(comando[1])) {
                        agregarVehiculo(b);
                    }
                    break;
                case "2":
                    listarVehículos();
                    break;
                case "3":
                    facturar(comando[1], Integer.parseInt(comando[2]), comando[3], Integer.parseInt(comando[4]), comando[5]);
                    break;
                case "4":
                    System.out.println("Particular: " + String.valueOf(totalParticulares) + "\nComercial: " + String.valueOf(totalComerciales));
                    break;
                case "5":
                    bandera = false;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        procesarComandos(objeto1);
    }

}
