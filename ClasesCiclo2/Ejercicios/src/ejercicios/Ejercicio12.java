//12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
package ejercicios;

public class Ejercicio12 {
    public static void main(String[] args) {
        While();
        For();
    }
    public static void While(){
        int x=1;
        while (x<=100){
            if(x%2==0 || x%3==0)
            System.out.println(x);
        x++;
        } 
    }
    public static void For(){
        for(int x=1;x<=100;x++){
            if(x%2==0 || x%3==0)
            System.out.println(x);
        }
    }
}
