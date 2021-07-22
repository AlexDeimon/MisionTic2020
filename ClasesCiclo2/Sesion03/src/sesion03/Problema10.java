/*Calcular el valor de 2 elevado a la potencia n*/
package sesion03;
import java.util.Scanner;
public class Problema10 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int n=Integer.parseInt(objeto1.nextLine());
        int i;
        for(i=1;i<n;i++){
            i++;
        }
        System.out.println((int)Math.pow(2, i));
    }
}
