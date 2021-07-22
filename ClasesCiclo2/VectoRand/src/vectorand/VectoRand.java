package vectorand;
import java.util.Scanner;
public class VectoRand {
    static int vector[] = new int[10];
    static int i = 0;
    public static void main(String[] args) {
        int now;
        Scanner objeto1 = new Scanner(System.in);
            System.out.println("1. Vector aleatoreo");
            System.out.println("2. Sumatoria");
            System.out.println("3. pares");
            System.out.println("4. Salir");
            System.out.println();
            System.out.print("INGRESE UNA OPCION:");
            now = objeto1.nextInt();
            if(now>=1&& now<=4){
                switch (now) {
                    case 1:VectorAleatoreo();break;
                    case 2:Sumatoria();break;
                    case 3:NumerosPares();break;
                    case 4:System.out.println("EL PROGRAMA HA TERMINADO");
                }
            }
            else
                System.out.println("NO ES UN VALOR ENTRE 1 Y 4");
    }
    public static void VectorAleatoreo() {
        do {
            vector[i] = (int) (Math.random() * 50);
            System.out.print(vector[i] + "\t");
            i = i + 1;
        } while (i < 10);
        System.out.println("");
    }
    public static void Sumatoria() {
        int suma = 0;
        for (i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        System.out.println("Sumatoria de los valores: " + suma);
        System.out.println("");
    }
    public static void NumerosPares() {
	System.out.print("Estos son los numeros pares: ");
	for(i=0;i<vector.length; i++) {
            if(vector[i]%2==0)
                System.out.print("\t"+vector[i]);
            }
            System.out.println("");
	}
}
