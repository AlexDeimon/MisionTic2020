/*Dado el centro y el radio de un círculo, determinar si un punto de R2 pertenece o no al interior del círculo.*/
package sesion02;
import java.util.Scanner;
public class Problema12 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite la coordenada del centro del circulo:");
        System.out.print("x:");
        double x1=Double.parseDouble(objeto1.nextLine());
        System.out.print("y:");
        double y1=Double.parseDouble(objeto1.nextLine());
        System.out.print("Digite el radio del circulo: ");
        double r=Double.parseDouble(objeto1.nextLine());
        System.out.println("Digite la coordenada de un punto:");
        System.out.print("x:");
        double x2=Double.parseDouble(objeto1.nextLine());
        System.out.print("y:");
        double y2=Double.parseDouble(objeto1.nextLine());
        
        if(Math.pow(r, 2)>=Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)){
            System.out.println("el punto de coordenadas "+(int)x2+","+(int)y2+" está dentro del circulo");
        }else{
            System.out.println("el punto de coordenadas "+(int)x2+","+(int)y2+" no está dentro del circulo");
        }
    }
}
