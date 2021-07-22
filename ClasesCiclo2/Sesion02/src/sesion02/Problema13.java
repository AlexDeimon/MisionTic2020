/*Dadas tres longitudes positivas, determinar si con esas longitudes se puede construir un tríangulo*/
package sesion02;
import java.util.Scanner;
public class Problema13 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.print("lado a: ");
        int a=Integer.parseInt(objeto1.nextLine());
        System.out.print("lado b: ");
        int b=Integer.parseInt(objeto1.nextLine());
        System.out.print("lado c: ");
        int c=Integer.parseInt(objeto1.nextLine());
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("los tres lados forman un triangulo");
        }else{
            System.out.println("los tres lados no forman un triangulo");
        }
    }
}
