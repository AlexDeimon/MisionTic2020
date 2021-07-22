/*En 2022 el país A tendrá una población de 25 millones de habitantes y el país B de 18.9 millones. Las tasas de crecimiento anual
de la población serán de 2% y 3% respectivamente. Desarrollar un algoritmo para informar en que año la población del país B
superará a la de A*/
package sesion03;
public class Problema04 {
    public static void main(String[] args) {
        int a=25000000;
        int b=18900000;
        System.out.println("A superará a B en el "+Poblacion(a,b));
    }
    public static int Poblacion(int a, int b){
        int i=2022;
        double A=(double)a;
        double B=(double)b;
        while (A>B){
            A=A+A*0.02;
            B=B+B*0.03;
            i+=1;
        }
        return i;
    }
}
