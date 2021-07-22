//20) Pide un número por teclado e indica si es un número primo o no. 
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. 
//Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
//NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
package ejercicios;
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner objeto01 = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = objeto01.nextInt();
        if (numero <= 1) {
            System.out.println(numero + " No es primo");
        } 
        else {
            int raiz = (int) Math.sqrt(numero);
            int count = 0;
            for (int i = raiz; i > 1; i--) {
                if (numero % i == 0) {
                    count++;
                }
            }
            if (count < 1) {
                System.out.println(numero + " es primo");
            } else {
                System.out.println(numero + " no es primo");
            }
        }
    }
}
