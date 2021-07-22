//26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
package ejercicios;
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        System.out.println("Inserte un numero mayor que 1: ");
        int numero = Integer.parseInt(objeto1.nextLine());
        int total = 0;
        int contador = 1;
        if (numero > 1) {
            while (contador <= numero) {
                total += contador;
                contador++;
            }
            System.out.println("la sumatoria del 1 hasta " + numero + " es = " + total);
        } else {
            System.out.println("El numero debe ser mayor a 1 ");
        }

    }
}
