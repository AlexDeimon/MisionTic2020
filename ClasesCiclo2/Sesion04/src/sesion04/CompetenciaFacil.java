/*Se desea desarrollar una competencia de integrales en una Universidad. Para motivar a los estudiantes sin importar el nivel, 
se desea que inicialmente los problemas sean sencillos. Para esto se ha seleccionado un problema y se le ha preguntado a n personas 
sus opiniones. Si al menos una persona dijo que el problema era difícil el problema será difícil y se procederá a cambiar dicho 
ejercicio.
Entrada: La primera línea contiene la cantidad n de personas que dieron su opinión sobre un problema dado. La siguiente línea 
contiene n números que pueden ser 0 o 1. Si es un cero la persona piensa que el problema es fácil, si es un 1, la persona piensa 
que es un problema difícil: Salida Muestre la palabra FACIL si el problema es fácil de acuerdo con las respuestas dadas o DIFICIL 
si al menos una persona piensa que el problema es difícil.*/
package sesion04;
import java.util.Scanner;
public class CompetenciaFacil {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        int n=Integer.parseInt(objeto1.nextLine());
        String op= objeto1.nextLine();
        String opiniones[]=op.split(" ");
        analisis(n,opiniones);
    }
    public static void analisis(int n, String[] opiniones){
        boolean bandera=false;
        for(String x:opiniones){
            if (x.equals("1")){
                bandera=true;
            }
        }
        if (bandera){
            System.out.println("DIFICIL");
        }
        else{
            System.out.println("FACIL");
        }
    }
}
   


