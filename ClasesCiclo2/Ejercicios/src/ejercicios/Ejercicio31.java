//31) Mostrar la longitud de una cadena.
package ejercicios;
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una cadena");
        String frase=objeto1.nextLine();
        System.out.println("La longitud de la cadena es "+frase.length());
    }
}
