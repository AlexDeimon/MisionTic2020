/*Dado un carácter, construya un programa para determinar si el carácter es un dígito o no.*/
package sesion02;
import java.util.Scanner;
public class Problema10 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un caracter: ");
        String c=objeto1.nextLine();
        String caracter=Caracter(c);
        System.out.println(caracter);
    }
    public static String Caracter(String c){
        char b=c.charAt(0);
        String i;
        if (b>=48 && b<=57){
            i="El caracter "+b+" es un digito";
            return i;
        }else{
            i="El caracter "+b+" no es un digito";
            return i;
        }
    }
}
