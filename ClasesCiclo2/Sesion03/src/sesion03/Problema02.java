/*Imprimir un listado con los números impares desde 1 hasta 999 y seguidamente otro listado con los números 
#pares desde 2 hasta 1000.*/
package sesion03;
public class Problema02 {
    public static void main(String[] args) {
        int i=1;
        int j=2;
        while (i<=999 && j<=1000){
            System.out.println(i+","+j);
            i+=2;
            j+=2;
        }
    }
}
