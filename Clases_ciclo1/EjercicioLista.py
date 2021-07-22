#Se desea desarrollar una competencia de integrales en una Universidad. Para motivar a los estudiantes sin 
#importar el nivel, se desea que inicialmente los problemas sean sencillos. Para esto se ha seleccionado un 
#problema y se le ha preguntado a n personas sus opiniones. Si al menos una persona dijo que el problema era 
#difícil el problema será difícil y se procederá a cambiar dicho ejercicio.
#Entrada: La primera línea contiene la cantidad n de personas que dieron su opinión sobre un problema dado. 
#La siguiente línea contiene n números que pueden ser 0 o 1. Si es un cero la persona piensa que el problema 
#es fácil, si es un 1, la persona piensa que es un problema difícil: Salida Muestre la palabra FACIL si el 
#problema es fácil de acuerdo con las respuestas dadas o DIFICIL si al menos una persona piensa que el 
#problema es difícil.
def datos():
    n=int(input())
    o=(input())
    op=o.split(" ")
    return n, op
def analisis(n,op):
    while not (len(op)==n):
        for x in op:
            if(x!='0' or x!='1'):
                print("error de range")
                n, op=datos()
                break
    if '1' in op:    
        print("DIFICIL")
    else:
        print("FACIL")

def main():
    n,op=datos()
    analisis(n,op)

main()