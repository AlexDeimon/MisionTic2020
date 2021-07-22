//36) Modifica el anterior enum para indicar que es día laborable directamente (usar toString).
package ejercicios;
import java.util.Scanner;
public class Ejercicio36 {
   public enum DiasSemana {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);
     
    private boolean laborable;
     
    private DiasSemana(boolean laborable){
        this.laborable = laborable;
    }
    
    @Override
    public String toString() {
        if(laborable){
            return "El dia "+ this.name().toLowerCase() +" es laborable";
        }else{
            return "El dia "+  this.name().toLowerCase() +" no es laborable";
        }    
    }
   }
   public static void main(String[] args) {
         
        Scanner objeto1 = new Scanner(System.in);
        System.out.println("Escribe un dia de la semana");
        String dia = objeto1.nextLine();
         
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
         
        System.out.println(diaS.toString());
         
    }
    
}
