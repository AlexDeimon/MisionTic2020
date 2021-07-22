/*Dada una lista de Universidades Colombianas, obtener el nombre del sitio web. 
Se asume que un nombre de universidad está entre los caracteres www.  y edu.co. Por ejemplo de www.unal.edu.co se obtiene unal.
Entrada: Un numero n indicando la cantidad de nombres de sitios web a procesar
Salida: Listado de posibles nombres de universidades.*/
package sesion04;
import java.util.Scanner;
public class Universidades {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        int n=Integer.parseInt(objeto1.nextLine());
        String[] links=new String[n];
        int i=0;
        while (i<links.length){
            links[i]=objeto1.nextLine();
            i++;
        }
        int j=0;
        while (j<links.length){
            String[] direccion={};
            direccion=links[j].split("\\.");
            System.out.println(direccion[1]);
            j++;
        }
    }
}
