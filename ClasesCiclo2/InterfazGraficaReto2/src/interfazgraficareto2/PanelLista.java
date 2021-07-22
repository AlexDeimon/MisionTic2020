/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficareto2;
import javax.swing.JPanel;
import javax.swing.JTextArea;
/**
 *
 * @author DIEGO
 */
public class PanelLista extends JPanel{
    private JTextArea jTextArea; //atributo del JTextArea
    
    public PanelLista(){
        initComponents();//metodo componentes del panel
    }

    private void initComponents() {
        jTextArea=new JTextArea(30,30);//dimensiones del JTextArea
        add(jTextArea);//agregar el JTextArea al panel
        
    }
    public JTextArea getjTextArea() {//acceso al JTextArea
        return jTextArea;
    }
}
