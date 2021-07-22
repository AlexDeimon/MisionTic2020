//34) Dada una frase, separarlo en palabras.
package ejercicios;
import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una frase");
        String frase=objeto1.nextLine();
        String[] Frase=frase.split(" ");
        for (int x=0; x<Frase.length;x++){
            System.out.println(Frase[x]);
        }
    }
}
