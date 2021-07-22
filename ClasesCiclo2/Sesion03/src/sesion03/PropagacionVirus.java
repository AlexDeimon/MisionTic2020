/*A partir del día 1, el país A tiene una población contagiada de Divoc 9012 de n (1 <=n <= 10^18) y el país B tiene una
población contagiada de Divoc 9012 de m (1 <= m <= n). Las tasas de crecimiento diario son de 2% y 3% respectivamente.
Desarrollar un algoritmo para informar en que día la población contagiada del país B iguala o supera a la del país A.
Entrada: La entrada consta de dos números reales que representan la cantidad de gente contagiada.
Salida: El día en el cual la población contagiada del país B supera la del país A*/
package sesion03;
import java.util.Scanner;
public class PropagacionVirus {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        double a=objeto1.nextInt();
        double b=objeto1.nextInt();
        int i=1;
        double c=Math.pow(10,8);
        if (i<=a && a<=c && 1<=b && b<=a){
            while (a>b){
                a=a*(1+0.02);
                b=b*(1+0.03);
                i++;
            }
            System.out.println(i);
        } else {
            System.out.println("datos erroneos");
        }
    }
}
