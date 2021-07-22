//7) Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, 
//estas pueden ser a dolares, yenes o libras. El método tendrá como parámetros, 
//la cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor, 
//mostrara un mensaje indicando el cambio (void).
package ejercicios;
import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        System.out.println("Digite una cantidad de euros: ");
        float numero = objeto1.nextInt();
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        System.out.println();
        System.out.print("INGRESE UNA OPCION:");
        int op = objeto1.nextInt();
        switch (op) {
            case 1:Libras(numero);break;
            case 2:Dolares(numero);break;
            case 3:Yenes(numero);break;
            default:System.out.println("OPCION INVALIDA");
        }
    }

    private static void Libras(float n) {
        System.out.println("Valor de "+n+" € en Libras= "+(n*0.86));
    }

    private static void Dolares(float n) {
        System.out.println("Valor de "+n+" € en Doleres= "+(n*1.28611));
    }

    private static void Yenes(float n) {
        System.out.println("Valor de "+n+" € en Yenes= "+(n*129.852));
    }
}
