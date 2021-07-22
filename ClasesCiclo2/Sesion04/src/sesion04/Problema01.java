/*Elabore un programa que dada una cadena de caracteres y una letra, cuente cuantas ocurrencias de esta letra hay en la cadena.*/
package sesion04;
import java.util.Scanner;
public class Problema01 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una cadena de caracteres");
        String cadena=objeto1.nextLine();
        System.out.println("Digite un caracter: ");
        String a=objeto1.nextLine();
        char b=a.charAt(0);
        int c=0;
        if(cadena.contains(a)){
            for(int i=0;i<cadena.length();i++){
                char d=cadena.charAt(i);
                if(b==d){
                    c++; 
                    } 
            }
            System.out.println("el caracter "+a+" esta en la cadena "+c+" veces");  
        }else{
            System.out.println("el caracter "+a+" No está en la cadena");
        }
    }
}
