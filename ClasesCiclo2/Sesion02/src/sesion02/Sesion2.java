package sesion02;
import java.util.Scanner;
public class Sesion2 {
    public static double f(double x){
    return x*x;
    }
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        double x=objeto1.nextDouble();
        System.out.print(f(x));
    }
    
}
