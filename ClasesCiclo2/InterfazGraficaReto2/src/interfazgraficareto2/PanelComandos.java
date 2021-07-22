/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficareto2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author DIEGO
 */
public class PanelComandos extends JPanel {
    JRadioButton jRadioButtonComercial;//atributo boton de seleccion Comercial
    JRadioButton jRadioButtonParticular; //atributo boton de seleccion Particular
    ButtonGroup ButtonGroup;//Atributo grupo de botones para seleccion unica de boton Comercial y Particular
    JLabel jLabelPasajeros;//atributo etiqueta Pasajeros
    JTextField jTextFieldPasajeros;//atributo campo de texto Pasajeros
    JLabel jLabelVelocidad;//atributo etiqueta Velocidad
    JTextField jTextFieldVelocidad;//atributo campo de texto Velocidad
    JLabel jLabelPlaca;//atributo etiqueta Placa
    JTextField jTextFieldPlaca;//atributo campo de texto Placa
    JLabel jLabelCarga;//atributo etiqueta Carga
    JTextField jTextFieldCarga;//atributo campo de texto Carga
    JLabel jLabelColor;//atributo etiqueta Color
    JTextField jTextFieldColor;//atributo campo de texto Color
    JButton jButtonAgregar;//atributo boton Agregar
    JButton jButtonListar;//atributo boton Listar
    JTextArea jTextArea;//atributo JTextArea
    
    public PanelComandos(PanelLista pl){//El Constructor recibe un atributo de panel Lista para que en las clases de los eventos pueda tener acceso a PanelLista tambien. 
        jTextArea=pl.getjTextArea();//el atributo que recibiran los eventos sera el jTextArea para tener acceso a la impresion de la lista
        initComponents();//metodo de los componentes del panel
    }

    private void initComponents() {
        setLayout(new GridLayout(6,2));//dividir el panel como una matriz
        
        jRadioButtonComercial=new JRadioButton("Comercial");//crear boton de seleccion
        add(jRadioButtonComercial);//agregarlo
        
        jRadioButtonParticular=new JRadioButton("Particular");//crear boton de seleccion
        add(jRadioButtonParticular);//agregarlo
        
        ButtonGroup= new ButtonGroup();//crear grupo de botones de seleccion
        ButtonGroup.add(jRadioButtonComercial);//agregar Adelante al grupo
        ButtonGroup.add(jRadioButtonParticular);//agregar Reversa al grupo
        
        jLabelCarga=new JLabel("Carga Maxima: ");//crear etiqueta
        
        jTextFieldCarga=new JTextField();//crear campo de texto
        
        jLabelColor=new JLabel("Color: ");//crear etiqueta
        
        jTextFieldColor=new JTextField();//crear campo de texto
        
        jLabelPasajeros=new JLabel("Pasajeros: ");//crear etiqueta
        add(jLabelPasajeros);//agregarla
        
        jTextFieldPasajeros=new JTextField();//crear campo de texto
        add(jTextFieldPasajeros);//agregarlo
        
        jLabelVelocidad=new JLabel("Velocidad: ");//crear etiqueta
        add(jLabelVelocidad);//agregarla
        
        jTextFieldVelocidad=new JTextField();//crear campo de texto
        add(jTextFieldVelocidad);//agregarlo
        
        jLabelPlaca=new JLabel("Placa: ");//crear etiqueta
        add(jLabelPlaca);//agregarla
        
        jTextFieldPlaca=new JTextField();//crear campo de texto
        add(jTextFieldPlaca);//agregarlo
        
        jButtonAgregar=new JButton("Agregar");//crear boton
        
        jButtonListar=new JButton("Listar");//crear boton
        
        EventoRadioButton evento1=new EventoRadioButton(this);//instancia de la clase EventoRadioButton para enviar los componentes a la clase
        jRadioButtonComercial.addActionListener(evento1);//escucha el metodo ActionPerformed
        jRadioButtonParticular.addActionListener(evento1);//escucha el metodo ActionPerformed
        
        EventoButton evento2=new EventoButton(this);//instancia de la clase EventoButton para enviar los componentes a la clase
        jButtonAgregar.addActionListener(evento2);//escucha el metodo ActionPerformed
        jButtonListar.addActionListener(evento2);//escucha el metodo ActionPerformed
    }
    //metodos getters para tener acceso a los atributos en otras clases
    public JRadioButton getjRadioButtonComercial() {
        return jRadioButtonComercial;
    }

    public JRadioButton getjRadioButtonParticular() {
        return jRadioButtonParticular;
    }

    public ButtonGroup getButtonGroup() {
        return ButtonGroup;
    }

    public JTextField getjTextFieldPasajeros() {
        return jTextFieldPasajeros;
    }

    public JTextField getjTextFieldVelocidad() {
        return jTextFieldVelocidad;
    }

    public JTextField getjTextFieldPlaca() {
        return jTextFieldPlaca;
    }

    public JTextField getjTextFieldCarga() {
        return jTextFieldCarga;
    }

    public JTextField getjTextFieldColor() {
        return jTextFieldColor;
    }

    public JButton getjButtonAgregar() {
        return jButtonAgregar;
    }

    public JButton getjButtonListar() {
        return jButtonListar;
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }
    
    
}
