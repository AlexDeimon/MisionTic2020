//4) Crea una aplicación que dibuje una escalera de números, 
//siendo cada linea números empezando en uno y acabando en el numero de la linea.
package ejercicios;
import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        Escalera(numero);
    }
    public static void Escalera(int n){
        for(int x=1;x<=n;x++){
            for(int i=1;i<=x;i++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
