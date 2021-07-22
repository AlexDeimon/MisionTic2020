/*Dado un número entero, determinar si ese número corresponde al código ASCII de una vocal minúscula */
package sesion02;
import java.util.Scanner;
public class Problema08 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero entero: ");
        int valor=Integer.parseInt(objeto1.nextLine());
        String ascii=Ascii(valor);
        System.out.println(ascii);
    }
    public static String Ascii(int n){
        char a;
        String b;
        if (n>=97 && n<=122){
            a=(char) n;
            b=String.valueOf(a);
            return b;
        }else{
            String c="No corresponde a un Ascii de vocal minuscula";
            return c;
        }
    }
}
