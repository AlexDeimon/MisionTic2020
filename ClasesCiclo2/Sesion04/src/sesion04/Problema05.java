/*Desarrollar un algoritmo que permita concatenar dos cadenas (colocar la segunda inmediatamente después de la primera), hay que
tener en cuenta que la cadena resultante tendrá un tamaño mayor que cualquiera de la cadenas operandos si son distintas de la
cadena vacía (la cadena resultante debe quedar guardada en una variable aparte).*/
package sesion04;
import java.util.Scanner;
public class Problema05 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite cadena de caracteres 1:");
        String cadena1=objeto1.nextLine();
        System.out.println("Digite cadena de caracteres 2:");
        String cadena2=objeto1.nextLine();
        System.out.println("Cadena concatenada: "+concatenacion(cadena1,cadena2));
    }
    public static String concatenacion(String c1, String c2){
        String c3=c1+c2;
        return c3;
    }
}
