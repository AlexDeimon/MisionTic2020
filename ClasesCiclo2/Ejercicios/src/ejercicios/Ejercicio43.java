//4) Crea una aplicación que nos calcule el factorial de un número pedido por teclado, 
//lo realizara mediante un método al que le pasamos el número como parámetro. 
package ejercicios;
import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        System.out.println("El factorial es "+factorial(numero));
    }
    public static int factorial(int n){
        int fact=0;
        int factorial=1;
        while (n>=2){
            fact=n*(n-1);
            n-=2;
            factorial*=fact;
        }
        return factorial;
    }
}
