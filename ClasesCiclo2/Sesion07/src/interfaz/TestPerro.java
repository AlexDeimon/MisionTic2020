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
public class TestPerro  extends Perro {
    public TestPerro(){
        super();
    }
    public static void main(String[] args) {
        Perro perro1=new Perro();
        perro1.sonidoAnimal();
        perro1.dormir();
    }
}
