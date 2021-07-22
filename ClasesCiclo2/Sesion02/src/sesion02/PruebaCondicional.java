/*Leer 4 valores enteros A, B, C y D. Si B es mayor que C y D es mayor que A y si la suma de C y D es mayor que la suma de A y B
y si C y D fueran valores positivos y si A es par, escriba el mensaje “Valores aceptados” sin comilas. De lo contrario, 
escriba el mensaje “Valores no aceptados” sin comillas.
Entrada: La entrada corresponde a 4 valores enteros
Salida: En la salida se debe mostrar las palabras "Valores aceptados" ó "Valores no aceptados" sin comillas dependiendo de si 
cumplen el criterio o no.*/
package sesion02;
import java.util.Scanner;

public class PruebaCondicional {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        int A,B,C,D;
        A=objeto1.nextInt();
        B=objeto1.nextInt();
        C=objeto1.nextInt();
        D=objeto1.nextInt();
        if(B>C && D>A && (C+D)>(A+B) && C>0 && D>0 && A%2==0)
            System.out.print("Valores aceptados");
        else
            System.out.print("Valores no aceptados");
    }
}
