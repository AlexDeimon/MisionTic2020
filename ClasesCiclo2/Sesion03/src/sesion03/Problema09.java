/*Imprimir los números de 1 hasta un número natural n dado, cada uno con su respectivo factorial.*/
package sesion03;
import java.util.Scanner;
public class Problema09 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n=Integer.parseInt(objeto1.nextLine());
        int m=0;
        for(int i=1;i<n+1;i++){
            m+=i;
            System.out.println(i+","+m);
        }
    }
}
