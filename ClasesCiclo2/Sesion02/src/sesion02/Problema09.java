/*Dada una cadena de longitud 1, determine si el código ASCII de primera letra de la cadena es par o no.  */
package sesion02;
import java.util.Scanner;
public class Problema09 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una cadena de longitud 1: ");
        String valor=objeto1.nextLine();
        String ascii=Ascii(valor);
        System.out.println(ascii);
    }
    public static String Ascii(String n){
        char w= n.charAt(0);
        int a=w;
        char b;
        String c;
        if (a>=33 && a<=126 && a%2==0){
            b=(char) a;
            c=String.valueOf(b);
            c=a+" es un ascii par";
            return c;
        }else{
            b=(char) a;
            c=String.valueOf(b);
            c=a+" no corresponde a un Ascii par";
            return c;
        }
    }
}
