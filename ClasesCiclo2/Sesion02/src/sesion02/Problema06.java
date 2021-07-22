//Si pido prestados P cantidad de pesos para pagarlos en dos meses, si el interés del préstamo es del 3%.
//¿Cúanto se debe pagar al final del segundo mes si el interés es compuesto mensualmente?.
package sesion02;
import java.util.Scanner;
public class Problema06 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        int p;
        System.out.println("Digite capital inicial: ");
        p=Integer.parseInt(objeto1.nextLine());
        double total=interes(p,0.3,2)+p;
        System.out.println("el total a pagar despues de dos meses con un interes del 3% es de "+total);
    }
    public static double interes(int i, double c, int t){
    double interes=i*c*t;
    return interes;
    }
}
