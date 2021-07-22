/*El lenguaje de Groot es muy complicado para expresar todo lo que quiere decir. 
Los sentimientos tienen n capas:
Si n = 1, el sentimiento será "I am it", 
si n = 2 es "I am that I groot it", 
si n = 3 es "I am that I groot that I am it",
y así sucesivamente.
Entrada: La cantidad n de capas
Salida: Muestre la frase que Groot está tratando de decir.*/
package reto01;
import java.util.Scanner;
public class Reto01 {
    public static void main(String[] args) {
       Scanner objeto1=new Scanner(System.in);
       int n=objeto1.nextInt();
       System.out.println(Capas(n));
    }
    public static String Capas(int n){
        String capa = "";
        String capas[]={"I am","I groot"};
        int i=1;
        while (i<=n){
            if(i%2!=0){
                capa+=capas[0];
                if (i<n){
                capa+=" that ";
                } else {
                capa+=" it";
                }
            }
            if(i%2==0){
                capa+=capas[1];
                if (i<n){
                capa+=" that ";
                } else {
                capa+=" it";
                }
            }
            i++;
        }
        return capa;
    }
}
