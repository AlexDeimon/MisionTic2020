//2) Declara 2 variables numéricas (con el valor que desees), 
//he indica cual es mayor de los dos. Si son iguales indicarlo también. 
package ejercicios;

public class Ejercicio02 {
    public static void main(String[] args) {
        int numero1=1;
        int numero2=2;
        if(numero1<numero2){
            System.out.println("el "+numero2+" es mayor que el "+numero1);
        }
        else if(numero1>numero2){
            System.out.println("el "+numero1+" es mayor que el "+numero2);
        }
        else
            System.out.println("los numero son iguales");
    }
}
