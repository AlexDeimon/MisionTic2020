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
public abstract class Animal {
    // Atributos   -> Características de los objetos     
     int edad = 0;
     String color = "";
     int peso = 0;
     String tamaño = "";
    
    
    // Constructor  -> Función especial para crear nuevos objetos
     public Animal(){         
     }
     
     public Animal(int edad, String color, int peso, String tamaño){
         this.color = color;
         this.edad = edad;
         this.peso = peso;
         this.tamaño = tamaño;
     }
     
     public Animal(String color, int peso, String tamaño){
         this.color = color;
         this.tamaño = tamaño;
         this.peso = peso;

     }     
      
    // Métodos   -> Comportamiento de los objetos
    
     public void moverse(){
         System.out.println("Me estoy moviendo!");
     }

     public void respirar(){
         System.out.println("Estoy respirando!");
     }   

     public void comer(){
         System.out.println("Estoy comiendo!");
     }   

     public void dormir(){
         System.out.println("Estoy durmiendo!");
     }     

     public void dormir(int horas){
         System.out.println("Dormiré !" + horas + " horas");
     } 
     

}
