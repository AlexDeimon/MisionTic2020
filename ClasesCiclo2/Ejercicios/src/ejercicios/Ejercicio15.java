//15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, 
//si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
package ejercicios;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner objeto01=new Scanner(System.in);
        int x;
        do{
            System.out.println("Digite un numero");
            x=objeto01.nextInt();
        }while(x<0);
        System.out.println(x);
    }
}
