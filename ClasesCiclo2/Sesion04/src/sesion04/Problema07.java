/*Desarrollar un algoritmo que determine si una cadena de caracteres es palindrome. Una cadena se dice palindrome si al invertirla
es igual a ella misma*/
package sesion04;
import java.util.Scanner;
public class Problema07 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite cadena de caracteres:");
        String cadena=objeto1.nextLine();
        System.out.println(palindroma(cadena));
    }
    public static String palindroma(String cadena){
        String invertida="";
        String resultado="";
        for (int x=cadena.length()-1;x>=0;x--){
            invertida = invertida + cadena.charAt(x);
        }
        if(invertida.equals(cadena))
            resultado="La cadena es palindroma";
        else
            resultado="La cadena no es palindroma";
        return resultado;
    }
}
