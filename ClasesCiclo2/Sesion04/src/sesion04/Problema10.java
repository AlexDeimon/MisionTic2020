/*Modele mediante una función matemática y desarrolle un algoritmo en Java que calcule el producto por escalar de una constante con
un vector de números reales.*/
package sesion04;
import java.util.Scanner;
public class Problema10 {
    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        Problema08 p8=new Problema08();
        System.out.print("Digite tamaño del arreglo: ");
        int n = Integer.parseInt(objeto1.nextLine());
        int[] a = new int[n];
        System.out.println("Digite numeros: ");
        p8.leerArreglo(objeto1,a,n);
        System.out.print("arreglo: ");
        p8.escribirArreglo(a,n);
        System.out.print("Digite un entero: ");
        int e=Integer.parseInt(objeto1.nextLine());
        int [] vectorProducto=productoEscalar(a,e);
        System.out.print("producto escalar= ");
        p8.escribirArreglo(vectorProducto,n);
    }
    public static int[] productoEscalar(int[] a, int e){
        for(int i=0;i<a.length;i++){
            a[i]=(e*a[i]);
        }
        return a;
    }
}
