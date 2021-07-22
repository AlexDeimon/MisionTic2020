/*Elabore un programa que dada una cadena cuente las consonantes en dicha cadena.*/
package sesion04;
import java.util.Scanner;
public class Problema03 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una cadena de caracteres");
        String cadena=objeto1.nextLine();
        System.out.println("la cadena tiene "+Consonantes(cadena)+" consonantes");
    }
    public static int Consonantes(String cadena){
        int c=0;
        for(int i=0;i<cadena.length();i++){
            char v=cadena.charAt(i);
            int b=(int)v; 
            if((b>=66 && b<=68)||(b>=70 && b<=72)||(b>=74 && b<=78)||(b>=80 && b<=84)||(b>=86 && b<=90)||(b>=98 && b<=100)||(b>=102 && b<=104)|| (b>=106 && b<=110)||(b>=112 && b<=116)||(b>=118 && b<=122)){
                c++;
            }
        }
        return c;
    }
}
