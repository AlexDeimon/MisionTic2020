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
public class PerroRescate extends Perro{
    
    int capacidadCarga = 0;
    
    PerroRescate(){
        super();
    }
    
    @Override
    public void ladrar(){
        System.out.println("ladro como un perro de rescate! (Guau Guau)");
    }   
    
}
