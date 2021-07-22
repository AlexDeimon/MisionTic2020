/*Imprimir un listado con los números impares desde 1 hasta 999 y seguidamente otro listado con los números pares desde 2 hasta 1000*/
package sesion03;
public class Problema07 {
    public static void main(String[] args) {
        for(int i=1;i<1001;i+=2){
            System.out.println(i+","+(i+1));
        }
    }
}
