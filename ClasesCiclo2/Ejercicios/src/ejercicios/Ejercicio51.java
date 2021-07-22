//5) Crea una aplicación que dibuje una pirámide de asteriscos. Nosotros le pasamos la altura de la pirámide por teclado.
package ejercicios;
import java.util.Scanner;
public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        Escalera(numero);
    }
    public static void Escalera(int n){
        for (int x=n, y=1; y<=(n*2)-1;x--, y+=2){
            for (int i=0; i<x;i++){
                System.out.print(" ");
            }
            for (int j=y; j!=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
