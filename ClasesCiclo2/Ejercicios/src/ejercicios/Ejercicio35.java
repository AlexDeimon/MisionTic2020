//35) Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).
package ejercicios;
import java.util.Scanner;
public class Ejercicio35 {
    public enum DiasSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO;
    }
    public static void main(String[] args) {
        Scanner objeto1 = new Scanner(System.in);
        System.out.println("Digite un dia de la semana: ");
        String dia = objeto1.nextLine();
        DiasSemana Dia = DiasSemana.valueOf(dia.toUpperCase());
        switch (Dia) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia " + Dia.name().toLowerCase() + " es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia " + Dia + " no es laborable");
                break;
        }
    }
}
