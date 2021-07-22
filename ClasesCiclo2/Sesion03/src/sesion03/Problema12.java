/*Diseñe un programa que muestre las tablas de multiplicar del 1 al 9 */
package sesion03;
public class Problema12 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<11;j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println(" ");
        }
    }
}
