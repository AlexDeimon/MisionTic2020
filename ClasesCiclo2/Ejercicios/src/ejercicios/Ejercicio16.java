//16) Escribe una aplicación con un String que contenga una contraseña cualquiera. 
//Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
//Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”. 
//Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
package ejercicios;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        String contraseña="Hola Mundo 2021";
        Scanner objeto01=new Scanner(System.in);
        boolean bandera=true;
        int NoIntentos=1;
        while (bandera && NoIntentos<=3){
            System.out.println("Digite su contraseña: ");
            String intento=objeto01.nextLine();
            if(intento.equals(contraseña)){
                System.out.println("En hora buena");
                bandera=false;
            }
            else if(NoIntentos<3){
                System.out.println("Intente de nuevo");
                NoIntentos++;
            }
            else{
                System.out.println("No mas intentos");
                bandera=false;
            }
                
        }
    }
}
