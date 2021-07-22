//6) Crea una aplicación que dibuje una pirámide invertida de asteriscos. 
//Nosotros le pasamos la altura de la pirámide por teclado.
package ejercicios;
import java.util.Scanner;
public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        Escalera(numero);
    }
    public static void Escalera(int n){
        for (int y=0, x=(n*2)-1; x>0;x-=2, y++){
            for (int i=0; i<=y;i++){
                System.out.print(" ");
            }
            for (int j=x; j!=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
