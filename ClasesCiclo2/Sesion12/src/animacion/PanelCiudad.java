/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacion;

import ciudad.ParametrosDibujo;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 *
 * @author DIEGO
 */
public class PanelCiudad extends JPanel{
    
    private JTextArea jTextArea; //atributo del JTextArea
    
    public PanelCiudad(){
       initComponents();//metodo componentes del panel
    }

    private void initComponents(){
        jTextArea=new JTextArea(ParametrosDibujo.ALTO, ParametrosDibujo.ANCHO);//dimensiones del JTextArea
        add(jTextArea);//agregar el JTextArea al panel
        
        Font font=new Font("Monospaced",Font.BOLD,10);//fuente del JTextArea
        
        jTextArea.setFont(font);//Agregar la fuente a la JTextArea
    }
    
    public JTextArea getjTextArea() {//acceso al JTextArea
        return jTextArea;
    }
    
}
