package Colecciones;

import java.util.HashMap;

public class EjemploHashMap {

    public static void main(String[] args) {
        HashMap<String, Double> notaFinal = new HashMap<String, Double>();//crear el Hashmap como un objeto de tipo Hashmap

        notaFinal.put("Diego", 4.5); //(clave, valor) agregar elementos al map
        notaFinal.put("Camilo", 4.0);
        notaFinal.put("Isabel", 4.8);
        System.out.println("Hashmap: " + notaFinal);
        System.out.println("Hashmap Tamaño: " + notaFinal.size());

        notaFinal.remove("Camilo");//elimina elemento y clave 

        System.out.println("Haxmap por elemento: ");
        for (String llave : notaFinal.keySet()) {//para cada clave en Map notaFinal
            System.out.println(llave + ": " + notaFinal.get(llave));
        }

        System.out.println("Nota Isabel: " + notaFinal.get("Isabel"));//get trae el elemento en la clave indicada
    }
}
