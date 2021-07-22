//6) Crea una aplicación que nos cuente el número de cifras de un número entero positivo (hay que controlarlo) pedido por teclado.
//Crea un método que realice esta acción, pasando el número por parámetro, devolverá el número de cifras.
package ejercicios;
import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        System.out.println("No de cifras: "+cifras(numero));
    }

    private static int cifras(int n) {
        String num=String.valueOf(n);
        int cifras=num.length();
        return cifras;
    }
    
}
