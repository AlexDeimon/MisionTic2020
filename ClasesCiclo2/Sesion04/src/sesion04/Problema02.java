/*Elabore un programa que dada una cadena diga si todos los símbolos de la cadena son letras.*/
package sesion04;
import java.util.Scanner;
public class Problema02 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una cadena de caracteres");
        String cadena=objeto1.nextLine();
        System.out.println(Letras(cadena));
        
    }
    public static String Letras(String c){
        String d;
        boolean bandera=true;
        for(int i=0;i<c.length();i++){
            char v=c.charAt(i);
            int b=(int)v; 
            if((b>=65 && b<=90)||(b>=97 && b<=122)|| b==32){
                bandera=true;
            }else{
                bandera=false;
            }
        }     
        if(bandera==true){
            d="Todos los caracteres son letras";
        }
        else{
            d="NO todos los caracteres son letras";
        }
        return d;
    }
}
