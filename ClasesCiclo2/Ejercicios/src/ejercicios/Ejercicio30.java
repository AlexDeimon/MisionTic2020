//30) Convertir una frase a mayúsculas o minúsculas, 
//que daremos opción a que el usuario lo pida y mostraremos el resultado por pantalla.
package ejercicios;
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una frase");
        String frase=objeto1.nextLine();
        int now;
        System.out.println("1. MAYUSCULA");
        System.out.println("2. minuscula");
        now = objeto1.nextInt();
        switch (now) {
            case 1:System.out.println(frase.toUpperCase());break;
            case 2:System.out.println(frase.toLowerCase());break;
            default:System.out.println("Elija una opcion");break;
             }
    }
}
