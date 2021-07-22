//1) Crea una aplicación que dibuje una escalera de asteriscos. Nosotros le pasamos la altura de la escalera por teclado. 
package ejercicios;
import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        Escalera(numero);
    }
    public static void Escalera(int n){
        String escalera="";
        for(int x=0;x<n;x++){
            escalera+="*";
            System.out.println(escalera);
        }
    }
}
