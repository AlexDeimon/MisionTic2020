/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion7;

/**
 *
 * @author Juan
 */
public class Sesion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Animal a1 = new Animal();
        //Animal a2 = new Animal(3,"GRIS", 4," GRANDE");
        //Animal a3 = new Animal("NEGRO", 5, "GRANDE");
        
        
        Perro p1 = new Perro();
        Perro p2 = new Perro("NEGRO", 5, "GRANDE", "Picher");
        
        
        PerroRescate p3 = new PerroRescate();
        
        System.out.println("-------Animales-------");        
       // a1.dormir();
        // a1.comer();
        
        System.out.println("-------Perros-------");
        p1.comer(); // método de la clase padre
        p1.dormir(); // método de la clase padre
        p1.dormir(3); // método de la clase padre
        p1.ladrar(); // método propio
        
        System.out.println("-------Perro de Rescate-------");
        p3.ladrar();
    }
    
}
