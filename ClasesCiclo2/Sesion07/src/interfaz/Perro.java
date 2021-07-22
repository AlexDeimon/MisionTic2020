/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author DIEGO
 */
public class Perro implements Animal {
    
    public Perro(){
    }

    @Override
    public void sonidoAnimal() {
         System.out.println("El perro hace: wow wow");
    }

    @Override
    public void dormir() {
         System.out.println("El perro esta durmiendo");
    }


}
