//18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
//Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
package ejercicios;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner objeto01=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        double numero1=Double.parseDouble(objeto01.nextLine());
        System.out.println("Digite otro numero: ");
        double numero2=Double.parseDouble(objeto01.nextLine());
        for (int i=0;i<10;i++){
            DecimalFormat df = new DecimalFormat("#.0");
            double numAleatorio=(double)(Math.random()*(numero1-numero2)+numero2);
            System.out.println(df.format(numAleatorio));
        }
    }
}
