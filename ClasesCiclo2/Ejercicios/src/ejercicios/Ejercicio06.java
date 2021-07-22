//6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
//Si no lo es, también debemos indicarlo.
package ejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio06 {
    public static void main(String[] args) {
        if(JOptionPane()%2==0)
            System.out.println("El numero es divisible entre 2");
        else
            System.out.println("El numero no es divisible entre 2");
        if(Scanner()%2==0)
            System.out.println("El numero es divisible entre 2");
        else
            System.out.println("El numero no es divisible entre 2");
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
