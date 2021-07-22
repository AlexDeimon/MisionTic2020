/*Desarrollar un algoritmo que retorne un valor booleano que indique si dos cadenas son iguales, esto es, que tienen la misma
longitud con los mismos símbolos en la mismas posiciones*/
package sesion04;
import java.util.Scanner;
public class Problema04 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite cadena de caracteres 1:");
        String cadena1=objeto1.nextLine();
        System.out.println("Digite cadena de caracteres 2:");
        String cadena2=objeto1.nextLine();
        System.out.println("La cadena 1 es igual a la cadena 2: "+comparar(cadena1,cadena2));
    }
    public static boolean comparar(String c1, String c2){
        if(c1.equals(c2))
            return true;
        else
            return false;
    }
}
