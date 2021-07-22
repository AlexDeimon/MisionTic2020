package sesion02;
import java.util.Scanner;
public class Problema02 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite la base del carro: ");
        int base=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite la altura del carro: ");
        int altura1=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digitela altura de las ruedas del carro: ");
        double altura2=Double.parseDouble(objeto1.nextLine());
        double rectangulo=AreaRectangulo(base,altura1);
        double circulo=AreaCirculo(altura2);
        double areaTotal=AreaCarro(rectangulo,circulo);
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
    public static double AreaCarro(double areaR, double areaC){
        double carro=areaR+areaC;
        return carro;
    } 
}
