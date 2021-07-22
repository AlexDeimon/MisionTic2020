//3) Crea una aplicación que dibuje una escalera de números, siendo cada linea un numero. 
//Nosotros le pasamos la altura por teclado.
package ejercicios;
import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        Escalera(numero);
    }
    public static void Escalera(int n){
        for(int x=1;x<=n;x++){
            for(int i=0;i<x;i++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
