package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> ejemplo = new ArrayList();// crea el ArrayList como un objeto tipo ArrayList
        //agregar elementos a la lista: add
        ejemplo.add(5);
        ejemplo.add(7);
        ejemplo.add(9);
        ejemplo.add(0, 2); // (posicion, elemento) agregar elementos en una posicion especifica corriendo los demas elementos una posicion a la derecha
        ejemplo.add(1, 15);
        System.out.println("Lista: " + ejemplo);
        System.out.println("longitud Lista: " + ejemplo.size());
        ejemplo.remove(3); //elimina el elemento en la posicion indicada
        System.out.println("Lista por elemento: ");
        for (int dato : ejemplo) { //para cada objeto dato en la List ejemplo
            System.out.println(dato);
        }
        System.out.println("primer elemento: " + ejemplo.get(0));// get trae el elemento de la posicion indicada
    }
}
