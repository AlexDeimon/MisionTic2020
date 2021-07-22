//Establezca el modelo matemático (función matemática) que permita calcular el volumen del sólido.
package sesion02;
import java.util.Scanner;
public class Problema01 {
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        System.out.println("Digite el radio de la esfera: ");
        double radioEsfera=Double.parseDouble(objeto1.nextLine());
        System.out.println("Digite el radio del cono: ");
        double radioCono=Double.parseDouble(objeto1.nextLine());
        System.out.println("Digite la altura del cono: ");
        double alturaCono=Double.parseDouble(objeto1.nextLine());
        double esfera=VolumenEsfera(radioEsfera);
        double cono=VolumenCono(radioCono,alturaCono);
        VolumenTotal(esfera,cono);
        //System.out.println("Volumen total= "+VolumenTotal(esfera,cono));
        
    }
    public static double VolumenEsfera(double radio01){
        double esfera=(4*Math.PI*Math.pow(radio01,3))/3;
        return esfera;
    }
    public static double VolumenCono(double radio02, double altura){
        double cono=(Math.PI*altura*Math.pow(radio02,2))/3;
        return cono;
    }
    public static void VolumenTotal(double vc, double ve){
        double total=vc+ve;
        System.out.println("Volumen total= "+total);
    }
}
