/*En la última edición de la revista científica ”ADN al día” se indica que las pruebas de relación entre individuos a partir de
código genético se define de la siguiente manera: Si las dos cadenas se diferencian en menos de p letras, existe una relación de
padre-hijo, si se diferencian en menos de f > p letras, existe una relación de formar parte de la misma familia. 
De otra manera no existe relación. El laboratorio Tein Cul Pan, le pide desarrollar un programa que a partir de dos cadenas de ADN
del mismo tamaño, determine si existe una relación pader-hijo, de la misma familia o ninguna, siguiendo las reglas definidas por la
revista científica ”ADN al día”.  */
package Sesion06;

import java.util.Scanner;

public class ADN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cadena ADN individuo 1?");
        String ind1 = sc.nextLine();
        System.out.println("Cadena ADN individuo 2?");
        String ind2 = sc.nextLine();
        System.out.println("Diferencia máxima para ser Padre-Hijo?");
        int p = Integer.parseInt(sc.nextLine());
        System.out.println("Diferencia máxima para ser Familia?");
        int f = Integer.parseInt(sc.nextLine());
        System.out.println("Relación " + relacion(ind1, ind2, p, f));
    }
    public static int diferencia(String a, String b) {
        int cuenta = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cuenta++;
            }
        }
        return cuenta;
    }
    public static String relacion(String a, String b, int p, int f) {
        int d = diferencia(a, b);
        if (d <= p) {
            return "Padre-Hijo";
        } else if (d <= f) {
            return "Familia";
        } else {
            return "Ninguna";
        }
    }
}
