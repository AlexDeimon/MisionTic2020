package sesion02;
import java.util.Scanner;
public class Problema03 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite la base 1: ");
        int base1=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite la altura 1: ");
        int altura1=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digitela el radio 1: ");
        double radio1=Double.parseDouble(objeto1.nextLine());
        System.out.println("Digite la base 2: ");
        int base2=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite la altura 2: ");
        int altura2=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digitela el radio 2: ");
        double radio2=Double.parseDouble(objeto1.nextLine());
        double rectangulo1=AreaRectangulo(base1,altura1);
        double rectangulo2=AreaRectangulo(base2,altura2);
        double circulo1=AreaCirculo(radio1);
        double circulo2=AreaCirculo(radio2);
        double areaTotal=AreaCarro(rectangulo1,circulo1,rectangulo2,circulo2);
        System.out.println("el area del carro es igual a: "+areaTotal);
    }
    public static int AreaRectangulo(int base,int altura){
        int rectangulo=base*altura;
        return rectangulo;
    }
    public static double AreaCirculo(double radio){
        double circulo=Math.PI*Math.pow(radio, 2);
        return circulo;
    }
    public static double AreaCarro(double areaR1, double areaC1, double areaR2, double areaC2){
        double carro=areaR1+areaC1+areaR2+areaC2;
        return carro;
    } 
    
}
