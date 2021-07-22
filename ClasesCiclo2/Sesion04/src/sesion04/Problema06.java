/*Desarrollar un algoritmo que invierta una cadena de caracteres (la cadena invertida debe quedar guardada en una variable aparte).*/
package sesion04;
import java.util.Scanner;
public class Problema06 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite cadena de caracteres:");
        String cadena=objeto1.nextLine();
        System.out.println("Cadena invertida: "+invertir(cadena));
    }
    public static String invertir(String cadena){
        String invertida="";
        for (int x=cadena.length()-1;x>=0;x--){
            invertida = invertida + cadena.charAt(x);
        }
        return invertida;
    }
}
