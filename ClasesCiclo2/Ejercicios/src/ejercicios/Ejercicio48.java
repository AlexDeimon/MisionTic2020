//2) Crea una aplicación que dibuje una escalera inversa de asteriscos. 
//Nosotros le pasamos la altura de la escalera inversa por teclado.
package ejercicios;
import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        Escalera(numero);
    }
    public static void Escalera(int n){
        for (int x=n;x>0;x--){
            for(int i=x;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
