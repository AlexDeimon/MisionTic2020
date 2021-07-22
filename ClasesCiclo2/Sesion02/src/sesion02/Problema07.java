/*El número de contagiados de Covid-19 en el país de NuncaLandia se duplica cada día. Hacer un programa que diga el número total 
de personas que se han contagiado cuando pasen D días a partir de hoy, si el número de contagiados actuales es C.*/
package sesion02;
import java.util.Scanner;
public class Problema07 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("contagiados al dia 1: ");
        int contagiados=Integer.parseInt(objeto1.nextLine());
        System.out.println("dias despues: ");
        int dias=Integer.parseInt(objeto1.nextLine());
        int covid=Covid(contagiados, dias);
        System.out.println("total de contagiados a ese dia: "+covid);
        
    }
    public static int Covid(int c, int d){
        int i=0;
        for(i=1;i<d+1;i++){
            c*=2;
        }
        return c;
    }
}
