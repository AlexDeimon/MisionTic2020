/*Al ver los precios y los anuncios del almacén Cobra Mosmas, un cliente le pide crear un programa de computador que le permita 
ingresar el precio individual de tres productos y el precio de la promoción en combo de los tres productos anunciada por el
almacen y determine si es preferible comprarlos por separado o en el combo promoción.*/
package Sesion06;
import java.util.Scanner;
public class RepasoJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double c = Double.parseDouble(sc.nextLine());
        double d = Double.parseDouble(sc.nextLine());
        System.out.println("Comprar " + comprar(a, b, c, d));
    }
    public static String comprar(double p1, double p2, double p3, double pc) {
        if (pc <= p1 + p2 + p3) {
            return "en Combo";
        } else {
            return "por separado";
        }
    }
}
