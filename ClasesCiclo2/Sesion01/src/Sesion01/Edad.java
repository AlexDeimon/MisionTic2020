//Dada la edad de una persona en días, calcule la edad de la persona en años, meses y días
package Sesion01;
import java.util.Scanner;
public class Edad {
  public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        int edad;
        edad=Integer.parseInt(objeto1.nextLine()); 
        int años=edad/365;
        int meses=(edad%365)/30;
        int dias=(edad%365)%30;
        System.out.println(años+" año(s)");
        System.out.println(meses+" mes(es)");
        System.out.println(dias+" dia(s)");
    }
}