package sesion04;
import java.util.Scanner;
public class Sesion04 {
    public static void main(String[] args) {
        String s = "Gandalf 3000 1.68";
        String[] line = s.split(" ");
        String nombre = line[0];
        int edad = Integer.parseInt(line[1]);
        double estatura = Double.parseDouble(line[2]);
        System.out.println("nombre: " + nombre);
        System.out.println("edad: " + edad);
        System.out.println("estatura: " + estatura + "m");
    }

}
