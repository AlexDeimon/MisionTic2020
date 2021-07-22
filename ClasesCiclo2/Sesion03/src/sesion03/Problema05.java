/*Diseñar una función que permita calcular el épsilon de la máquina. El épsilon de máquina es el número decimal más pequeño que
sumado a 1 se puede representar de manera precisa en la máquina (que no es redondeado), es decir, retorna un valor diferente de 1,
éste da una idea de la precisión o número de cifras reales que pueden ser almacenadas en la máquina. La idea es realizar un ciclo
en el cual se realiza la operación 1 + e para potencias de 2 desde e = 2^0 y continuando con potencias decrecientes de 2 e = 2^−1,
e = 2^−2, e = 2^−3, e = 2^−4, . . .hasta obtener que el resultado de la suma 1 + e no se altere*/
package sesion03;
public class Problema05 {
    public static void main(String[] args) {
        System.out.println("el minimo numero positivo en esta maquina es "+eplison());
    }
    public static double eplison(){
        int n=0;
        double e=Math.pow(2, n);
        double e0=e;
        while (e>0){
            e0=e;
            e=Math.pow(2, n);
            double e1=1+e;
            n-=1;
        }
        return e0;
    }
}
