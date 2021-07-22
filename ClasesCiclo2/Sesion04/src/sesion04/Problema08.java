/*Modele mediante una función matemática y desarrolle un algoritmo en Java con ciclos que permita hallar la posición del mínimo de un
vector de números reales.*/
package sesion04;
import java.util.Scanner;
public class Problema08 {
    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        System.out.println("Digite tamaño del arreglo: ");
        int n = Integer.parseInt(objeto1.nextLine());
        int[] a = new int[n];
        System.out.println("Digite numeros: ");
        leerArreglo(objeto1,a,n);
        System.out.print("arreglo: ");
        escribirArreglo(a,n);
        System.out.println("La posicion del valor minimo del arreglo es: "+posicionMinima(a));
        
    }
    public static int[] leerArreglo(Scanner objeto,int[] a, int n) {
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(objeto.nextLine());
        }
        return a;
    }
    public static void escribirArreglo(int[] a, int n){
        for(int i = 0; i < n; i++){
        System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int posicionMinima(int[] a){
        int min;
        int posicion=0;
        min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
                posicion=i;
            }
        }
        return posicion;
    }
}
