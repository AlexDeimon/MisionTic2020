/*Dado un número real x, construya una función que permita determinar si el número es positivo, negativo o cero. */
package sesion02;
import java.util.Scanner;
public class Problema11 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero real: ");
        int n=Integer.parseInt(objeto1.nextLine());
        String tipo=TipoNumero(n);
        System.out.println(tipo);
    }
    public static String TipoNumero(int n){
        String c=" ";
        if (n==0){
            c="El numero "+n+" es neutro a la suma";
            return c;
        }
        else if(n>0){
            c="El numero "+n+" es positivo";
            return c;
        }
        else{
            c="El numero "+n+" es negativo";
            return c;
        }   
    }
}
