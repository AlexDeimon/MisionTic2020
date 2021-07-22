//5) Crea una aplicación que nos convierta un número en base decimal a binario. 
//Esto lo realizara un método al que le pasaremos el numero como parámetro, 
//devolverá un String con el numero convertido a binario. 
package ejercicios;
import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero=objeto1.nextInt();
        System.out.println("Binario: "+binario(numero));
    }
    public static String binario(int n){
        int res;
        String bin="";
        String binInv="";
        while(n/2!=0){
            res=n%2;
            n=n/2;
            bin=bin+String.valueOf(res);
        }
        res=n%2;
        n=n/2;
        bin=bin+String.valueOf(res);
        for (int x=bin.length()-1;x>=0;x--)
                binInv= binInv + bin.charAt(x);
        return binInv;
    }
}
