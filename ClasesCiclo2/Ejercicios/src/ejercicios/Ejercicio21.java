//21) Muestra los números primos entre 1 y 100.
package ejercicios;
public class Ejercicio21 {
    public static void main(String[] args) {
        int numero;
        for (numero = 1; numero < 100; numero++) {
            int raiz = (int) Math.sqrt(numero);
            int contador = 0;
            for (int a = raiz; a > 1; a--) {
                if (numero % a == 0) {
                    contador++;
                }
            }
            if (contador < 1) {
                System.out.println(numero);
            }
        }
    }
}
