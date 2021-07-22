/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficareto2;
import java.awt.FlowLayout;
import javax.swing.JFrame;
/**
 *
 * @author DIEGO
 */
public class Ventana extends JFrame{
    PanelComandos panelComandos;//Atributo panelCoamndos
    PanelLista panelLista;//Atributo PanelLista
    
    public Ventana(){
        setTitle("RETO 2");//titulo JFrame
        initComponents();//metodo de los componentes del Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar la ventana=termminar programa
        setSize(550,550);//tamaño del Frame
        //pack();//Ajustar el tamaño Frame 
        setVisible(true); //Ventana visible
    }

    private void initComponents() {
        setLayout(new FlowLayout());//Frame tipoFlow
        panelLista=new PanelLista();//instanciar el panel Lista
        panelComandos=new PanelComandos(panelLista);//instanciar el panel comandos recibiendo el PanelLista para la comunicacion con los eventos
        
        add(panelComandos);//agregarlo al Frame
        add(panelLista);//agregarlo al Frame
    }
}
