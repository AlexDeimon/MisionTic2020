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
public class Perro extends Animal{
    // atributos
     String raza = "";
     
    // constructor
     public Perro(){
         super();
     }

     public Perro(String color, int peso, String tamaño, String raza){
         super(color, peso, tamaño);
         this.raza = raza;
     }
     
   
    // métodos
     public void ladrar(){
         System.out.println("Guau Guau!");
         
     }
    
     @Override
     public void comer(){
         System.out.println("Comiendo carne!"); 
     }
     

}
