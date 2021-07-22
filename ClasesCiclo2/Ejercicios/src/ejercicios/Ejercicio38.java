//38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
//Al terminar, mostrará lo siguiente:
//– mayor numero introducido
//– menor numero introducido
//– suma de todos los numeros
//– suma de los numeros positivos
//– suma de los numeros negativos
//– media de la suma (la primera que pido)
//El número -1 no contara como número.
package ejercicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        int num;
        List<Integer> nums = new ArrayList<Integer>();
        do{
            System.out.println("Digite un numero");
            num=objeto1.nextInt();
            if(num!=-1)
                nums.add(num);
        }while(num!=-1);
        
        System.out.println("mayor numero: "+mayor(nums));
        System.out.println("menor numero: "+menor(nums));
        System.out.println("suma todos los numeros: "+suma(nums));
        System.out.println("suma todos los numeros positivos: "+sumaPositivos(nums));
        System.out.println("suma todos los numeros negativos: "+sumaNegativos(nums));
        System.out.println("media: "+media(nums,suma(nums)));
    }
    
    public static int mayor(List<Integer> nums){
        int mayor=Collections.max(nums);
        return mayor;
    }
    
    public static int menor(List<Integer> nums){
        int menor=Collections.min(nums);
        return menor;
    }
    
    public static int suma(List<Integer> nums){
        int suma = 0;
        for(Integer numero : nums) {
            suma+= numero;
        }
        return suma;
    }
    
    public static int sumaPositivos(List<Integer> nums){
        int suma=0;
        for(Integer numero : nums) {
            if(numero>0)
                suma+= numero;
        }
        return suma;
    }
    
    public static int sumaNegativos(List<Integer> nums){
        int suma=0;
        for(Integer numero : nums) {
            if(numero<0)
                suma+= numero;
        }
        return suma;
    }
    
    public static double media(List<Integer> nums, int suma){
        int media=suma/nums.size();
        return media;
    }
}
