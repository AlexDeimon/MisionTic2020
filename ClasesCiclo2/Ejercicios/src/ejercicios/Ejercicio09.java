//9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) 
//y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
package ejercicios;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio09 {
    public static void main(String[] args) {
        final double IVA=0.21;
        double precio1=JOptionPane();
        double precioFinal1=precio1+(precio1*IVA);
        System.out.println("precio final: $"+precioFinal1);
        double precio2=Scanner();
        double precioFinal2=precio2+(precio2*IVA);
        System.out.println("precio final: $"+precioFinal2);
        
    }
    public static double JOptionPane(){
        double precio=Double.parseDouble(JOptionPane.showInputDialog("Digite el precio del producto:"));
        return precio;
    }
    public static double Scanner(){
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite el precio del producto:");
        double precio=Double.parseDouble(objeto1.nextLine());
        return precio;
    }
}
