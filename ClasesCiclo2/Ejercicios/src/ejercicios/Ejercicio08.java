//8) Modifica el ejercicio anterior, para que en lugar de pedir un número, 
//pida un carácter (char) y muestre su código en la tabla ASCII.
package ejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio08 {
    public static void main(String[] args) {
        char caracter1=JOptionPane();
        int numero1=(int)caracter1;
        System.out.println("El número del caracter '"+caracter1+"' es "+numero1);
        char caracter2=Scanner();
        int numero2=(int)caracter2;
        System.out.println("El número del caracter '"+caracter2+"' es "+numero2);
    }
    public static char JOptionPane(){
        char caracter=(JOptionPane.showInputDialog("Digite un caracter:")).charAt(0);
        return caracter;
    }
    public static char Scanner(){
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un caracter:");
        char caracter=(objeto1.nextLine()).charAt(0);
        return caracter;
    }
}
