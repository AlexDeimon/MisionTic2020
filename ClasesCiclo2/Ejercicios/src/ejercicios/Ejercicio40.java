//1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o triangulo. 
//Pediremos que figura queremos calcular su área y según lo introducido pedirá los valores necesarios para calcular el área. 
//Crea un método por cada figura para calcular cada área, este devolverá un número real. Muestra el resultado por pantalla
package ejercicios;
import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("1. circulo");
        System.out.println("2. triangulo");
        System.out.println("3. cuadrado");
        System.out.println();
        System.out.print("INGRESE UNA OPCION:");
        int opcion = objeto1.nextInt();
        switch (opcion) {
            case 1:System.out.println("El area del Circulo es: "+areaCirculo());break;
            case 2:System.out.println("El area del Triangulo es: "+areaTriangulo());break;
            case 3:System.out.println("El area del Cuadrado es: "+areaCuadrado());break;
            default:System.out.println("NO ES UNA OPCIÓN VALIDA");
        }
    }
    public static double areaCirculo(){
        Scanner objeto2=new Scanner(System.in);
        System.out.print("Digite el radio del circulo: ");
        int radio = objeto2.nextInt();
        return ((Math.pow(radio,2)*Math.PI));
    } 
    public static double areaTriangulo(){
        Scanner objeto2=new Scanner(System.in);
        System.out.print("Digite la base del triangulo: ");
        int base = objeto2.nextInt();
        System.out.print("Digite la altura del triangulo: ");
        int altura = objeto2.nextInt();
        return (base*altura)/2;
    } 
    public static double areaCuadrado(){
        Scanner objeto2=new Scanner(System.in);
        System.out.print("Digite el lado del cuadrado: ");
        int lado = objeto2.nextInt();
        return (lado*lado);
    } 
}
