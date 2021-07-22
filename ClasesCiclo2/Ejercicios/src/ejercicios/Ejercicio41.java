//2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado. 
//Crea un método donde pasamos como parámetros entre que números queremos que los genere, 
//podemos pedirlas por teclado antes de generar los números. 
//Este método devolverá un número entero aleatorio. Muestra estos números por pantalla.
package ejercicios;
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        //Introducimos los datos necesarios
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite la cantidad de numeros: ");
        int cantidad=objeto1.nextInt();
        System.out.println("Digite el numero de inicio y numero de final del rango separados por una ,: ");
        String rango=objeto1.next();
        String[] numeros=rango.split(",");
        int num1=Integer.parseInt(numeros[0]);
        int num2=Integer.parseInt(numeros[1]);
        //generamos los numeros
        for(int i=0;i<cantidad;i++){
            System.out.println(generaNumero(num1, num2));
        }
    }
   public static int generaNumero(int num1, int num2){
        return ((int)Math.floor(Math.random()*(num2-num1)+num1));
    }
}
