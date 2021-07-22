/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion;

import ciudad.ParametrosDibujo;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author DIEGO
 */
public class PanelControles extends JPanel{
    JButton jButtonIniciar;//atributo boton iniciar
    JButton jButtonParar;//atributo boton parar
    JLabel jLabelFurgon;//atributo etiqueta furgon
    JTextField jTextFieldFurgon;//atributo campo de texto Furgon
    JLabel jLabelPlaton;//atributo etiqueta Platon
    JTextField jTextFieldPlaton;//atributo campo de texto Platon
    JLabel jLabelDormir;//atributo etiqueta dormir
    JSpinner jSpinnerDormir;//Atributo spinner dormir
    JLabel jLabelIteraciones;//Atributo etiqueta iteraciones
    JSpinner jSpinnerIteraciones;//Atributo Spinner Iteraciones
    JLabel jLabelSitios;//Atributo etiqueta Sitios
    JSpinner jSpinnerSitios;//Atributo Spinner sitios
    JCheckBox jCheckBoxCarga;//Atributo chequeo carga
    JCheckBox jCheckBoxFamiliar;//Atributo chequeo familiar
    JRadioButton jRadioButtonAdelante;//Atributo boton de seleccion Adelante
    JRadioButton jRadioButtonReversa; //Atributo boton de seleccin Reversa
    ButtonGroup ButtonGroup;//Atributo grupo de botones para seleccion unica de boton Adelante o Reversa
    JTextArea jTextArea;//Atributo JTextArea
    
    public PanelControles(PanelCiudad pc){//El Constructor recibe un atributo de panel Ciudad para que en la clase hilo pueda tener acceso a PanelCiudad tambien. 
        jTextArea=pc.getjTextArea();//el atributo que recibira en el Hilo sera el jTextArea para tener acceso a la animacion
        initComponents();//metodo de los componentes del panel
    }

    private void initComponents() {
        setLayout(new GridLayout(16,1));//dividir el panel como una matriz
        jButtonIniciar=new JButton("Iniciar Animación");//crear boton
        add(jButtonIniciar);//agregarlo
        
        jButtonParar=new JButton("Parar Animación");//crear boton
        add(jButtonParar);//agregarlo
        
        jLabelFurgon=new JLabel("Carga Furgon: ");//crear etiqueta
        add(jLabelFurgon);//agregarla
        
        jTextFieldFurgon=new JTextField("UNAL");//crear campo de texto
        add(jTextFieldFurgon);//agregarlo
        
        jLabelPlaton=new JLabel("Carga Platon: ");//crear etiqueta
        add(jLabelPlaton);//agregarla
        
        jTextFieldPlaton=new JTextField("4321");//crear campo de texto
        add(jTextFieldPlaton);//agregarlo
        
        jLabelDormir=new JLabel("Lapso de dormir: ");//crear etiqueta
        add(jLabelDormir);//agregarla
        
        jSpinnerDormir=new JSpinner();//crear spinner
        jSpinnerDormir.setValue(ParametrosDibujo.PAUSA_MILISEGUNDOS);//valor predeterminado 
        add(jSpinnerDormir);//agregarlo
        
        jLabelIteraciones=new JLabel("Numero de Iteraciones: ");//crear etiqueta
        add(jLabelIteraciones);//agregarla
        
        jSpinnerIteraciones=new JSpinner();//crear spinner
        jSpinnerIteraciones.setValue(ParametrosDibujo.ITERACIONES_CIUDAD);//valor predeterminado
        add(jSpinnerIteraciones);//agregarlo
        
        jLabelSitios=new JLabel("Numero de Sitios: ");//crear etiqueta
        add(jLabelSitios);//agregarla
        
        jSpinnerSitios=new JSpinner();//crear spinner
        jSpinnerSitios.setValue(ParametrosDibujo.NUMERO_SITIOS);//valor predeterminado
        add(jSpinnerSitios);//agregarlo
        
        jCheckBoxCarga=new JCheckBox("Carga");//crear chequeo
        jCheckBoxCarga.setSelected(true);//chequeado predeterminadamente
        add(jCheckBoxCarga);//agregarlo
        
        jCheckBoxFamiliar=new JCheckBox("Familiar");//crear chequeo
        add(jCheckBoxFamiliar);//agregarlo
        
        jRadioButtonAdelante=new JRadioButton("Adelante");//crear boton de seleccion
        jRadioButtonAdelante.setSelected(true);//selesccionado predeterminadamente
        add(jRadioButtonAdelante);//agregarlo
        
        jRadioButtonReversa=new JRadioButton("Reversa");//crear boton de seleccion
        add(jRadioButtonReversa);//agregarlo
        
        ButtonGroup= new ButtonGroup();//crear grupo de botones de seleccion
        ButtonGroup.add(jRadioButtonAdelante);//agregar Adelante al grupo
        ButtonGroup.add(jRadioButtonReversa);//agregar Reversa al grupo
        
        EventoClic evento=new EventoClic(this);//instancia de la clase Evento clic para enviar los componentes a la clase EventoClic
        jButtonIniciar.addActionListener(evento);//escucha el metodo ActionPerformed
        jButtonParar.addActionListener(evento);//escucha el metodo ActionPerformed
        
    }
    //metodos getters para tener acceso a los atributos en otras clases
    public JButton getjButtonIniciar() {
        return jButtonIniciar;
    }

    public JButton getjButtonParar() {
        return jButtonParar;
    }

    public JTextField getjTextFieldFurgon() {
        return jTextFieldFurgon;
    }

    public JTextField getjTextFieldPlaton() {
        return jTextFieldPlaton;
    }

    public JSpinner getjSpinnerDormir() {
        return jSpinnerDormir;
    }

    public JSpinner getjSpinnerIteraciones() {
        return jSpinnerIteraciones;
    }

    public JSpinner getjSpinnerSitios() {
        return jSpinnerSitios;
    }

    public JCheckBox getjCheckBoxCarga() {
        return jCheckBoxCarga;
    }

    public JCheckBox getjCheckBoxFamiliar() {
        return jCheckBoxFamiliar;
    }

    public JRadioButton getjRadioButtonAdelante() {
        return jRadioButtonAdelante;
    }

    public JRadioButton getjRadioButtonReversa() {
        return jRadioButtonReversa;
    }

    public ButtonGroup getButtonGroup() {
        return ButtonGroup;
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }
}
