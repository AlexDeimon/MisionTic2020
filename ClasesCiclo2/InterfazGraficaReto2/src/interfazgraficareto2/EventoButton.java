/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficareto2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import reto02.*;
/**
 *
 * @author DIEGO
 */
public class EventoButton implements ActionListener {
    static PanelComandos pc;
    static ArrayList<Vehiculo> listaVehiculos=new ArrayList<>();
    static String cabecera = "***Inventario de vehículos***";
    public EventoButton(PanelComandos pc){
        this.pc=pc;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pc.getjButtonAgregar()){
            Comercial a=new Comercial("Comercial", Integer.parseInt(pc.getjTextFieldPasajeros().getText()), Integer.parseInt(pc.getjTextFieldVelocidad().getText()), String.valueOf(pc.getjTextFieldPlaca().getText()), String.valueOf(pc.getjTextFieldCarga().getText()));
            Particular b=new Particular("Particular", Integer.parseInt(pc.getjTextFieldPasajeros().getText()), Integer.parseInt(pc.getjTextFieldVelocidad().getText()), String.valueOf(pc.getjTextFieldPlaca().getText()), String.valueOf(pc.getjTextFieldColor().getText()));
            if(pc.getjRadioButtonComercial().isSelected()){
                agregarVehiculo(a);
            }else if(pc.getjRadioButtonParticular().isSelected()){
                agregarVehiculo(b);
            }
            pc.getjTextFieldCarga().setText(null);
            pc.getjTextFieldColor().setText(null);
            pc.getjTextFieldPasajeros().setText(null);
            pc.getjTextFieldPlaca().setText(null);
            pc.getjTextFieldVelocidad().setText(null);
        }
        else if(e.getSource()==pc.getjButtonListar()){
            listarVehículos();
        }
    }
    
    public static void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);    
    }
    
    public static void listarVehículos() {
        pc.getjTextArea().setText(String.valueOf(cabecera+"\n"+listaVehiculos.toString()));
    }
}
