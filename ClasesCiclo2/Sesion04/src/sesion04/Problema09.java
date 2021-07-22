/*Modele mediante una función matemática y desarrolle un algoritmo con ciclos en Java que calcule el mínimo de un vector de números
reales.*/
package sesion04;
import java.util.Scanner;
public class Problema09 {
    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        Problema08 p8=new Problema08();
        System.out.println("Digite tamaño del arreglo: ");
        int n = Integer.parseInt(objeto1.nextLine());
        int[] a = new int[n];
        System.out.println("Digite numeros: ");
        p8.leerArreglo(objeto1,a,n);
        System.out.print("arreglo: ");
        p8.escribirArreglo(a,n);
        System.out.println("El valor minimo del arreglo es: "+valorMinimo(a));
        
    }
    public static int valorMinimo(int[] a){
        int min;
        min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
}
