//7) Lee un número por teclado y muestra por consola, 
//el carácter al que pertenece en la tabla ASCII. 
package ejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio07 {
    public static void main(String[] args) {
        int numero1=JOptionPane();
        char ASCII1=(char)numero1;
        System.out.println("El caracter del numero "+numero1+" es "+ASCII1);
        int numero2=Scanner();
        char ASCII2=(char)numero2;
        System.out.println("El caracter del numero "+numero2+" es "+ASCII2);
    }
    public static int JOptionPane(){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero:"));
        return numero;
    }
    public static int Scanner(){
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un número entero:");
        int numero=Integer.parseInt(objeto1.nextLine());
        return numero;
    }
}
