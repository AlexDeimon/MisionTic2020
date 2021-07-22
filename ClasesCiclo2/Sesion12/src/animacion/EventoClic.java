/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DIEGO
 */
public class EventoClic implements ActionListener {
    
    PanelControles pc; //Atributo donde estaran almacenados los componentes en la instancia de eventoclic en PanelControles
    Hilo hilo;// atributo para disparar la clase Hilo 
    
    public EventoClic(PanelControles pc){//contructor para recibir los atributos de PanelControles
        this.pc=pc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {//metodo para realizar el evento clic
        if(e.getSource()==pc.getjButtonIniciar()){//si la fuente del evento click es igual al boton iniciar
            hilo=new Hilo(pc);//Instancia de la clase Hilo
            hilo.start();//inicia los procesos del run dentro de Hilo
        } else if(e.getSource() == pc.jButtonParar){//si la fuente del evento click es igual al boton Parar
            if(hilo != null){//aqui el condicional se cumple de inmediato ya que el hilo se esta ejecutando 
            hilo.setParar(true);//se le da el valor de true al setParar
            }
        }
    }
}
