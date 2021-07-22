//1) Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
//El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
//Crea sus métodos get, set y toString.
//Tendrá dos métodos especiales:
//ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
//retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, 
//la cantidad de la cuenta pasa a ser 0.
package ejercicios;
public class Ejercicio53 {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Diego", 1000);
        Cuenta cuenta2 = new Cuenta("Alex", 800);
         
        cuenta1.ingresar(300);
        cuenta2.ingresar(400);
         
        cuenta1.retirar(500);
        cuenta2.retirar(100);
         
        System.out.println(cuenta1); 
        System.out.println(cuenta2); 
    }
}

class Cuenta{
        String titular;
        double cantidad;
        
        public Cuenta(String titular) {
        this(titular, 0); 
        }
        
        public Cuenta(String titular, double cantidad) {
            this.titular = titular;
            if (cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad = cantidad;
            }
        }
        
        public String getTitular() {
            return titular;
        }
        
        public void setTitular(String titular) {
            this.titular = titular;
        }
        public double getCantidad() {
            return cantidad;
        }
        
        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
        
        public void ingresar(double cantidad){
            if(cantidad > 0){
            this.cantidad += cantidad;   
            }
        }
        
        public void retirar(double cantidad) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
            }
        }
        
        @Override
        public String toString() {
            return "El titular " + titular + " tiene " + cantidad + " euros en la cuenta";
        }
    }
