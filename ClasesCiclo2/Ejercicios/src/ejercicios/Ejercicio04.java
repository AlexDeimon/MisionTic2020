//4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
package ejercicios;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Bienvenido "+JOptionPane());
        System.out.println("----------");
        System.out.println("Bienvenido "+Scanner());
    }
    public static String JOptionPane(){
        String nombre=JOptionPane.showInputDialog("Digite su nombre:");
        return nombre;
    }
    public static String Scanner(){
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre=objeto1.nextLine();
        return nombre;
    }
}
