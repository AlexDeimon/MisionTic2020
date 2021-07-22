/*Imprimir los números pares en forma descendente hasta 2 que son menores o iguales a un número natural n ≥ 2 dado.*/
package sesion03;
import java.util.Scanner;
public class Problema03 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero par: ");
        int n=Integer.parseInt(objeto1.nextLine());
        while(n>=2){
            System.out.println(n);
            n-=2;
        }
    }
}
