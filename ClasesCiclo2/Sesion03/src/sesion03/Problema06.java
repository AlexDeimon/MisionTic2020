/*Imprimir un listado con los números del 1 al 100 cada uno con su respectivo cuadrado.*/
package sesion03;
public class Problema06 {
    public static void main(String[] args) {
        for(int i=1;i<101;i++){
            System.out.println(i+","+(int)Math.pow(i,2));
        }
    }
}
