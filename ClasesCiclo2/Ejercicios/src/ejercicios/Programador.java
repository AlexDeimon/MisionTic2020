package ejercicios;
/*
@author DIEGO
 */
public class Programador {
    public static void main(String[] args) {
        Programadora Nicoll = new Programadora("Nicoll",20,65,20,30,35,50,80,70,80,45,75,60);
        System.out.println(Nicoll.toString());
        System.out.println(Nicoll.mensaje());
    }
}

class Programadora {

    String nombre;
    int edad;
    int Python;
    int java;
    int javascript;
    int lenguaje_R;
    int HTML_CSS;
    int redes;
    int linux;
    int virtualizacion;
    int analisis_datos;
    int github;
    int english;

    public Programadora(String nombre, int edad, int Python, int java, int javascript, int lenguaje_R, int HTML_CSS, int redes, int linux, int virtualizacion, int analisis_datos, int github, int english) {
        this.nombre = nombre;
        this.edad = edad;
        this.Python = Python;
        this.java = java;
        this.javascript = javascript;
        this.lenguaje_R = lenguaje_R;
        this.HTML_CSS = HTML_CSS;
        this.redes = redes;
        this.linux = linux;
        this.virtualizacion = virtualizacion;
        this.analisis_datos = analisis_datos;
        this.github = github;
        this.english = english;
    }

    @Override
    public String toString() {
        return "Programadora: \n" + "nombre: " + nombre + ", edad: " + edad + " \nHabilidades:\n Python: " + Python + "% \n java: " + java + "% \n javascript: " + javascript + "% \n lenguaje_R: " + lenguaje_R + "% \n HTML_CSS: " + HTML_CSS + "% \n redes: " + redes + "% \n linux: " + linux + "% \n virtualizacion: " + virtualizacion + "% \n analisis_datos: " + analisis_datos + "% \n github: " + github + "% \n english: " + english + "% \n";
    }
    
    public String mensaje(){
        return "¡MIRA TODOS ESOS CONOCIMIENTOS QUE TIENES! \n!Y CADA DÍA APRENDES MÁS! \nERES MUY PILA E INTELIGENTE \nNO TE DESANIMES, YO CONFÍO EN QUE TE VA A IR BIEN, PERO SI ME EQUIVOCO IGUALMENTE NO TE RINDAS QUE YA LLEGARAN MÁS OPORTUNIDADES. \nESPERO HABERTE SUBIDO EL ÁNIMO Y SACARTE UNA SONRISA :) \nUN ABRAZO VIRTUAL \nTQM \nDiego";
    }
    
}
