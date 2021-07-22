#Calcular el área de la siguiente figura correspondiente al área lateral de un vehículo. 
#Utilice un método para calcular el área de un circulo y otro método para calcular el área de un rectángulo.
#La entrada corresponde a 6 valores de tipo double correspondientes a los lados de los rectángulos de la parte 
#superior del carro a subíndice 1 coma espacio b subíndice 1 coma espacio a subíndice 2 coma espacio b 
#subíndice 2, y las llantas de radio espacio r subíndice 1 coma espacio r subíndice 2
#En la salida se debe mostrar las palabras "suma total = " y el valor correspondiente al área.

#1
import math
def area_rectangulo(base,altura):
    return(base*altura)
def area_circulo(radio):
    return(math.pi*radio**2)
def area_total(arg1, arg2, arg3, arg4):
    return(arg1 + arg2 + arg3 + arg4)
def main():
    base1 = float(input("digite base 1: "))
    altura1 = float(input("digite altura 1: "))
    base2 = float(input("digite base 2: "))
    altura2 = float(input("digite altura 2: "))
    radio1 = float(input("digite radio 1: "))
    radio2 = float(input("digite radio 2: "))
    a_rectangulo1 = area_rectangulo(base1,altura1)
    a_rectangulo2 = area_rectangulo(base2,altura2)
    a_circulo1 = area_circulo(radio1)
    a_circulo2 = area_circulo(radio2)
    area = print("suma total: "+ str(area_total(a_rectangulo1, a_rectangulo2, a_circulo1, a_circulo2)))
main()

#2
a1=int(input("Digite altura 1: "))
b1=int(input("Digite base 1: "))
a2=int(input("Digite altura 2: "))
b2=int(input("Digite base 2: "))
r1=int(input("Digite radio 1: "))
r2=int(input("Digite radio 2: "))
area1=a1*b1
area2=a2*b2
area3=math.pi*r1**2
area4=math.pi*r2**2
def suma_total(a1,b1,a2,b2,r1,r2):
  area_total=area1+area2+area3+area4
  return area_total
print("suma total: "+ str(suma_total(a1,b1,a2,b2,r1,r2)))