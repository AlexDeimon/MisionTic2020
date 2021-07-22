/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion;

import javax.swing.JFrame;

/**
 *
 * @author DIEGO
 */
public class VentanaPrincipal extends JFrame{
    PanelCiudad panelCiudad;//atributo panel ciudad
    PanelControles panelControles;//atributo panel controles
    public VentanaPrincipal(){
        setTitle("Animación Ciudad");//titulo JFrame
        initComponents();//metodo de los componentes del Frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Cerrar la ventana=termminar programa
        //setSize(300,300);
        pack();//Ajustar el tamaño Frame 
        setVisible(true); //Ventana visible
        
    }
    private void initComponents(){
        panelCiudad=new PanelCiudad(); //instanciar el panel ciudad
        setContentPane(panelCiudad);//asignarlo como el principal
        
        panelControles=new PanelControles(panelCiudad);//instanciar el panel controles recibiendo el PanelCiudad para la comunicacion con el Hilo
        add(panelControles);//agregarlo
    }
}
