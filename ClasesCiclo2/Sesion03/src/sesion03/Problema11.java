/*Leer un número natural n, leer otro dato de tipo real x y calcular x**n*/
package sesion03;
import java.util.Scanner;
public class Problema11 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero base: ");
        int x=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite un numero exponente: ");
        double n=Double.parseDouble(objeto1.nextLine());
        double i;
        for(i=1;i<n;i++){
        }
        System.out.println((int)Math.pow(x, i));
    }
}
