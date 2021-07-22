//14) Realiza una aplicación que nos calcule una ecuación de segundo grado. 
//Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante 
//(operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. 
//Te recomiendo que uses mensajes de traza
package ejercicios;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner objeto01=new Scanner(System.in);
        System.out.print("Digite variable a: ");
        a=objeto01.nextInt();
        System.out.print("Digite variable b: ");
        b=objeto01.nextInt();
        System.out.print("Digite variable c: ");
        c=objeto01.nextInt();
        double discriminante=(Math.pow(b,2))-(4*a*c);
        System.out.println(discriminante);
        if (discriminante>0) {
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
            System.out.println("El valor de x1 es " +x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
}
