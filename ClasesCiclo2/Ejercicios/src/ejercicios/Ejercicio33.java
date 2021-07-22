//33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
package ejercicios;
import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una cadena");
        String frase=objeto1.nextLine();
        System.out.println("La cuarta letra es "+frase.substring(3,4)+" y la quinta letra es es "+frase.substring(4,5));
    }
}
