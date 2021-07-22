/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficareto2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author DIEGO
 */
public class EventoRadioButton implements ActionListener{
    PanelComandos pc;//Atributo donde estaran almacenados los componentes en la instancia de eventoRadioButton en PanelComandos
    
    public EventoRadioButton(PanelComandos pc){//contructor para recibir los atributos de PanelComandos
        this.pc=pc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {//metodo para realizar el evento RadioButton
        if(e.getSource()==pc.getjRadioButtonComercial()){//si la fuente del evento es igual al boton seleccion Comercial agregar la correspondiente etiqueta y campo de texto junto con los botones agregar y listar a la interfaz
            pc.remove(pc.jLabelColor);
            pc.remove(pc.jTextFieldColor);
            pc.add(pc.jLabelCarga);
            pc.add(pc.jTextFieldCarga);
            pc.add(pc.jButtonAgregar);
            pc.add(pc.jButtonListar);
            pc.updateUI();
        }
        else if(e.getSource()==pc.getjRadioButtonParticular()){//si la fuente del evento es igual al boton seleccion Particular agregar la correspondiente etiqueta y campo de texto junto con los botones agregar y listar a la interfaz
            pc.remove(pc.jLabelCarga);
            pc.remove(pc.jTextFieldCarga);
            pc.add(pc.jLabelColor);
            pc.add(pc.jTextFieldColor);
            pc.add(pc.jButtonAgregar);
            pc.add(pc.jButtonListar);
            pc.updateUI();
        }
    }
    
}
