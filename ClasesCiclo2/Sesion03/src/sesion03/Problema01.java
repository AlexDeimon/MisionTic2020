/*Imprimir un listado con los números del 1 al 100 cada uno con su respectivo cuadrado*/
package sesion03;
public class Problema01 {
    public static void main(String[] args) {
        int i=1;
        int j=1;
        while (i<=100){
            System.out.println(i+","+j);
            i+=1;
            j=(int)Math.pow(i, 2);
        }
    }
}
