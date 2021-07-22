//17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
package ejercicios;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner objeto01=new Scanner(System.in);
        System.out.println("Digite un dia de la semana: ");
        String dia=objeto01.nextLine();
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":System.out.println("El dia es laboral");break;
            case "sabado":
            case "domingo":System.out.println("El dia no es laboral");break;
            default:System.out.println("Digite un dia de la semana");
        }
    }
}
