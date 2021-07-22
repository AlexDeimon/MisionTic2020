//5) Haz una aplicación que calcule el área de un círculo(pi*R2). 
//El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
//Usa la constante PI y el método pow de Math.
package ejercicios;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        JOptionPane();
        System.out.println("----------");
        Scanner();
    }
    public static void JOptionPane(){
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del círculo:"));
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("El área del circulo de radio "+radio+" es igual a "+area);
    }
    public static void Scanner(){
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite el radio del círculo:");
        double radio=Double.parseDouble(objeto1.nextLine());
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("El área del circulo de radio "+radio+" es igual a "+area);
    }
  
}
