//25) Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String), 
//según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
package ejercicios;
import javax.swing.JOptionPane;
public class Ejercicio25 {
    public static void main(String[] args) {
        int resultado=0;
        String digitacion1=JOptionPane.showInputDialog("Digite numero 1:");
        int numero1=Integer.parseInt(digitacion1);
        String digitacion2=JOptionPane.showInputDialog("Digite numero 2:");
        int numero2=Integer.parseInt(digitacion2);
        String operacion=JOptionPane.showInputDialog("Digite la operación:");
        switch(operacion){
            case "+":resultado=numero1+numero2;break;
            case "-":resultado=numero1-numero2;break;
            case "*":resultado=numero1*numero2;break;
            case "/":resultado=numero1/numero2;break;
            case "^":resultado=(int)Math.pow(numero1,numero2);break;
            case "%":resultado=numero1%numero2;break;
        }
        JOptionPane.showMessageDialog(null, numero1+" "+operacion+" "+numero2+" = "+resultado);
    }
}
