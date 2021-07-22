//3) Crea una aplicación que nos pida un número por teclado y con un método se lo pasamos por 
//parámetro para que nos indique si es o no un número primo, debe devolver true si es primo sino false.
package ejercicios;
import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        System.out.println(primo(numero));
    }
    public static boolean primo(int n){
        if (n <= 1) {
            return false;
        } 
        else {
            int raiz = (int) Math.sqrt(n);
            int count = 0;
            for (int i = raiz; i > 1; i--) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count < 1) {
                return true;
            } else {
                return false;
            }
        }
    }
}
