/*El Centro Comercial Unaleño está muy cerca de crear carrito de compras. Ahora lo que se requiere de su parte es que se puedan
agregar un número indefinido de artículos y calcular la cuenta.
Se han definido varios comandos para realizar la prueba de la lógica del carrito de compras a bajo nivel. Para esto se definen 
ahora diferentes comandos que se realizan al momento de realizar una compra y que presentan la siguiente sintaxis: 
comando&sintaxis_comando
Los comandos definidos ahora son:
Comando 1:  Añadir ítem al carrito de compras
La sintaxis del comando 1 es la siguiente:
1&nombre_articulo&cantidad&precio
Comando 2: Generar tirilla de compras
La sintaxis del comando 2 es la siguiente:
2&cedula_cliente
Esta función debe retornar la tirilla de compras en texto
El cálculo de descuento se mantiene y se debe generar la misma tirilla que se generó en el reto anterior, pero incluyendo la
cédula del cliente y la cantidad de artículos por producto en el formato indicado en el ejemplo.  Dado el valor total de la
compra se continúa con la campaña titulada compra más y gasta menos con los siguientes descuentos:
Por compras mayores a 150000 lleva un 10% de descuento.
Por compras mayores a 300000 lleva un 15% de descuento.
Por compras mayores a 700000 lleva un 20% de descuento
Al imprimir la tirilla, la aplicación elimina ese carrito de compras y queda disponible para ejecutar de nuevo comandos.
Comando 3 – Salir de la aplicación
La sintaxis del comando 3 es la siguiente:
3
Este comando simplemente permite salir de la aplicación
Entrada: Diferentes comandos según el cargue y la impresión de tirillas de venta
Salida: Salidas dependiendo del comando especificado anteriormente*/
package Carrito;
import java.util.Scanner;
public class Carrito {
    
    static Articulo[] listaArticulos=new Articulo[20];
    static int cedula=0;
    static String Cabecera= "Centro Comercial Unaleño\nCompra más y Gasta Menos\nNIT: 899.999.063";
    static int numeroArticulos=0;
    
    public Carrito(){
    }
    
    public static void AgregarArticulo(Articulo articulo){
        listaArticulos[numeroArticulos]=articulo;
        numeroArticulos++;
    }
    
    public static double descuento(double total){
        double t=0;
        if(total>150000){
            t=total*0.1;
        }
        if(total>300000){
            t =total*0.15;
        }
        if(total>700000){
            t=total*0.2;
        }
        return t;
    }
    
    public static double totalCarrito(){
        double total=0;
        double descuento=0;
        for(int i=0; i<numeroArticulos;i++){
            total+=listaArticulos[i].PrecioTotal();
        }
        return total;
    }
    
    public static void LeerComandos(Scanner objeto1){
        boolean bandera=true;
        while(bandera){
            String[] comando = objeto1.nextLine().split("&");
            switch(comando[0]){
                case "1":Articulo a=new Articulo(comando[1], Integer.parseInt(comando[2]), Double.parseDouble(comando[3]));
                    AgregarArticulo(a);break;//agregar elemeto
                case "2":ImprimirTirilla(comando[1]);break;//imprimir tirilla
                case "3": bandera=false;break;
            }
        }
    }
    
    public static void ImprimirTirilla(String cedula){
        System.out.println(Cabecera);
        System.out.println("Cliente: "+cedula);
        System.out.println("Art Cant Precio");
        for(int i=0;i<numeroArticulos;i++){
            System.out.println(listaArticulos[i]);
        }
        double total = totalCarrito();
        double descuento=descuento(total);
        System.out.println("Total: $"+(int)Math.ceil(total-descuento));
        System.out.println("En esta compra tu descuento fue: $"+(int)descuento);
        System.out.println("Gracias por su compra \n---");
        numeroArticulos=0;
    }
    
    public static void main(String[] args) {
        Scanner objeto1=new Scanner(System.in);
        LeerComandos(objeto1);
        
    }
}
