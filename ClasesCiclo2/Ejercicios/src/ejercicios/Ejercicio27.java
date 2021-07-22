//27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1.
//Calcular el numero de números introducidos.
package ejercicios;
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        int contador=0;
        int num;
        do{
            System.out.println("Digite un numero: ");
            num=objeto1.nextInt();
            contador++;
        }while(num!=-1);
        System.out.println("Se digitaron "+contador+" numeros");
    }
}
