/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion;
import ciudad.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vehiculo.*;
/**
 *
 * @author DIEGO
 */
public class Hilo extends Thread {
    PanelControles pControles; //atributo para tener acceso a los comandos Y a la animacion
    private boolean parar;//atributo para parar la animacion
    
    public Hilo(PanelControles pControles){ //el contructor recibe el atributo PanelControles quien a su vez posee un atributo PanelCiudad para tener acceso a ambos
        this.pControles=pControles;
    }
    
    @Override
    public void run(){//metodo donde estan todos los eventos ejecutandose simultaneamente 
        Automovil automovil=new Automovil(new Posicion(),5); //Instancia para tener acceso a la animacion del automovil
        Deportivo deportivo=new Deportivo(new Posicion(),5);//Instancia para tener acceso a la animacion del deportivo
        Platon camioneta=new Platon(new Posicion(),3,4);//Instancia para tener acceso a la animacion del Platon
        camioneta.llevar(pControles.getjTextFieldPlaton().getText());//se le asigna la carga al platon mediante el texto del jTextFieldPlaton
        Furgon furgon=new Furgon(new Posicion(),3,4);//Instancia para tener acceso a la animacion del furgon
        furgon.llevar(pControles.getjTextFieldFurgon().getText());//se le asigna la carga al furgon mediante el texto del jTextFieldFurgon
        
        List<Vehiculo> listaVehiculos=new ArrayList();//Lista para agregar los vehiculos a la animacion
        if(pControles.getjCheckBoxCarga().isSelected()){//if para agregar el platon y el furgon solo si el checkbox de carga esta seleccionado  
            listaVehiculos.add(camioneta);
            listaVehiculos.add(furgon);
        }
        if(pControles.getjCheckBoxFamiliar().isSelected()){//if para agregar el automovil y el deportivo solo si el checkbox de familia esta seleccionado  
            listaVehiculos.add(automovil);
            listaVehiculos.add(deportivo);
        }
        
        List<Sitio> listaSitios=new ArrayList();//Lista para agregar los sitios a la animacion
        for(int i=0;i<(Integer)pControles.getjSpinnerSitios().getValue();i++){//segun el valor del spinner de sitios se asignara el numero de sitios a agregar en la animacion
            listaSitios.add(new Sitio(new Posicion()));
        }
        
        Ciudad ciudad=new Ciudad(listaVehiculos,listaSitios);//se instancia la animacion con los argumentos segun la cantidad de vehiculos y sitios en las listas
        parar=false;//se asgina parar=false para que la animacion corra
        for (int i = 0; i < (Integer) pControles.getjSpinnerIteraciones().getValue(); i++) {//Segun el valor del spinner del numero de iteraciones es la cantidad de tiempo que durara la animacion
            if(pControles.getjRadioButtonAdelante().isSelected()){//si el boton de seleccion adelante esta seleccionado la animacion se movera hacia adelante
                ciudad.mover();
            }
            else
                ciudad.moverReversa();
            pControles.getjTextArea().setText(ciudad.pintar());//inicia la animacion de la ciudad dentro del JTextArea
            
            try {
                sleep((Integer) pControles.getjSpinnerDormir().getValue()); //Las iteraciones correran mas lento o mas rapido segun el valor del spinner dormir 
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if(parar){//si parar es true la animacion se detendra porque el i del ciclo for llegara a su ultimo valor 
                i = ParametrosDibujo.ITERACIONES_CIUDAD;
            }
        }
    }
    //metodo set para recibir el valor de parar de eventoClic
    public void setParar(boolean parar) {
        this.parar = parar;
        
    }
    
}
