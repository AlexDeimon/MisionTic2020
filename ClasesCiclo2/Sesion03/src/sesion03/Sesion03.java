package sesion03;
import java.util.Scanner;
public class Sesion03 {
    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número entero ");
            System.out.println("a sumar o 0 para salir: ");
            int dato = Integer.parseInt(objeto1.nextLine());
            if (dato == 0) {
                break;
            }
            suma += dato;
        }
        System.out.println("La suma es: " + suma);
    }
}
