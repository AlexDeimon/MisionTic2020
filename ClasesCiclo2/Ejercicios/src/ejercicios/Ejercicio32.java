//32) Pedir dos palabras por teclado, indicar si son iguales.
package ejercicios;
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite una palabra");
        String frase1=objeto1.nextLine();
        System.out.println("Digite otra palabra");
        String frase2=objeto1.nextLine();
        if(frase1.equals(frase2))
            System.out.println("Las palabras son iguales");
        else
            System.out.println("Las palabras son diferentes");
    }
}
