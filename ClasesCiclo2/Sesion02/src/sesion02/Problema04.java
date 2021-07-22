//Diseñe una función que calcule la cantidad de carne de aves en kilos si se tienen N gallinas, M gallos y K pollitos cada uno 
//pesando 6 kilos, 7 kilos y 1 kilo respectivamente.
package sesion02;
import java.util.Scanner;
public class Problema04 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite cantidad de gallinas: ");
        int gallinas=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite cantidad de gallos: ");
        int gallos=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite cantidad de pollitos: ");
        int pollitos=Integer.parseInt(objeto1.nextLine());
        int total=carne(gallinas,gallos,pollitos);
        System.out.println("el total de carne es: "+total);
    }
    public static int carne(int n, int m, int k){
        int carne=6*n+7*m+k;
        return carne;
    }
}
