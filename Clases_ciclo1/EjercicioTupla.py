#Utilizando tuplas elabore un método que retorne la distancia entre dos puntos 𝑝 y 𝑞 definidos en un espacio 
#de 3 dimensiones: La distancia corresponde a aplicar: d igual raíz cuadrada de paréntesis izquierdo x 
#subíndice 2 menos x subíndice 1 paréntesis derecho al cuadrado más paréntesis izquierdo y subíndice 2 menos 
#y subíndice 1 paréntesis derecho al cuadrado más paréntesis izquierdo z subíndice 2 menos z subíndice 1 
#paréntesis derecho al cuadrado fin raíz
#Entrada: La entrada corresponde a los valores de cada una de las coordenadas x, y, z de cada punto:
#Salida: Un único valor correspondiente a la distancia entre los dos puntos.

#1
from math import sqrt
def main():
    p = tuple(map(int, input("Digite la coordenada x y z de un punto 1 : ").split(' ')))
    q = tuple(map(int, input("Digite la coordenada x y z de un punto 2 : ").split(' ')))
    x, y, z = [q[i]-p[i] for i in range (3)]
    print(str(diferencia(x,y,z)))

def diferencia(x,y,z):
    d=float(sqrt((x)**2+(y)**2+(z)**2))
    return d
main()

#2
from math import sqrt
def main():
    p = tuple(map(int, input().split(' ')))
    q = tuple(map(int, input().split(' ')))
    x1=(p[0])
    y1=(p[1])
    z1=(p[2])
    x2=(q[0])
    y2=(q[1])
    z2=(q[2])
    print(str(diferencia(x1,x2,y1,y2,z1,z2)))

def diferencia(x1,x2,y1,y2,z1,z2):
    d=float(sqrt((x2-x1)**2+(y2-y1)**2+(z2-z1)**2))
    return d
main()