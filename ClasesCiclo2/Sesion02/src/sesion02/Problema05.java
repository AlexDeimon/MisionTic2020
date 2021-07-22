//Mi mamá me manda a comprar P panes a $ 300 cada uno, M bolsas de leche a $ 3300 cada una y H huevos a $ 350 cada uno. 
//Hacer un programa que me diga las vueltas (o lo que quedo debiendo) cuando me da un billete de B pesos.
package sesion02;
import java.util.Scanner;
public class Problema05 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite cantidad de panes: ");
        int panes=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite cantidad de bolsas de leche: ");
        int bolsasDeLeche=Integer.parseInt(objeto1.nextLine());
        System.out.println("Digite cantidad de huevos: ");
        int huevos=Integer.parseInt(objeto1.nextLine());
        int total=total(panes,bolsasDeLeche,huevos);
        System.out.println("total a pagar: "+total);
        System.out.println("Digite el valor del billete: ");
        int billete=Integer.parseInt(objeto1.nextLine());
        int vueltas=vueltas(total,billete);
        System.out.println("cantidad de vueltas: "+vueltas);
    }
    public static int total(int p, int m, int h){
        int total=300*p+3300*m+350*h;
        return total;
    }
    public static int vueltas(int t,int b){
        int vueltas=b-t;
        return vueltas;
    }
}

