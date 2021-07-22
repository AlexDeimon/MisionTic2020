#1
#Establezca el modelo matemático (función matemática) que permita calcular el volumen del sólido.

import math
def volumen_Esfera(radio1):
    return (4*math.pi*radio1**3)/3

def volumen_Cono(radio2, altura):
    return(math.pi*altura*radio2**2)/3

def volumen_total(ve,vc):
    return vc+ve

def main():
    radio_esfera=float(input("Digite el radio de la esfera: "))
    radio_cono=float(input("Digite el radio del cono: "))
    altura_cono=float(input("Digite la altura del cono: "))
    esfera=volumen_Esfera(radio_esfera)
    cono=volumen_Cono(radio_cono,altura_cono)
    volumen= print("Volumen total= "+ str(volumen_total(esfera,cono)))

main()

#2
#Establezca el modelo matemático (función matemática) que permita calcular el área lateral del carro.
def area_rectangulo(a,b):
  area_rectangulo=a*b
  return area_rectangulo

def area_circulo(r):
  area_circulo=math.pi*r**2
  return area_circulo

def area_carro(area_circulo, area_rectangulo):
  area_carro=area_circulo+area_rectangulo
  return area_carro
base=int(input("Digite la base del carro: "))
altura1=int(input("Digite la altura del carro: "))
altura2=float(input("digite la altura de las ruedas del carro: "))
print("Area del carro es igual a: ", area_carro(area_circulo(altura2),area_rectangulo(base,altura1)))

#3
# Diseñe una función que calcule la cantidad de carne de aves en kilos si se tienen N gallinas, M gallos y
# K pollitos cada uno pesando 6 kilos, 7 kilos y 1 kilo respectivamente.

def Carne(N, M, K):
    return 6*N+7*M+K
gallinas=int(input("Digite cantidad de gallinas: "))
gallos=int(input("Digite cantidad de gallos: "))
pollitos=int(input("Digite cantidad de pollitos: "))
total=Carne(gallinas, gallos, pollitos)
print("El total de carne es "+str(total))

#4
#Mi mamá me manda a comprar P panes a $ 300 cada uno, M bolsas de leche a $ 3300 cada una y H huevos a $ 350
#cada uno. Hacer un programa que me diga las vueltas (o lo que quedo debiendo) cuando me da un billete de B pesos.

def total(P, M, H):
    return 300*P+3300*M+350*H

def vueltas(t,b):
    return b-t

panes=int(input("Digite cantidad de panes: "))
bolsas_de_leche=int(input("Digite cantidad de bolsas de leche : "))
huevos=int(input("Digite cantidad de huevos: "))
tot=total(panes,bolsas_de_leche,huevos)
print("total a pagar:"+str(tot))
billete=int(input("Digite el valor del billete: "))
v=vueltas(tot,billete)
print("cantidad de vueltas: "+ str(v))

#5
#Si pido prestados P cantidad de pesos para pagarlos en dos meses, si el interés del préstamo es del 3%.
#¿Cúanto se debe pagar al final del segundo mes si el interés es compuesto mensualmente?.

def interes(c,i,t):
    return c*i*t
p=int(input("Digite la capital inicial: "))
total_a_pagar=interes(p,0.3,2)+p
print("el total a pagar despues de dos meses con un interes del 3% es de "+ str(total_a_pagar))

#6
#El número de contagiados de Covid-19 en el país de NuncaLandia se duplica cada día. Hacer un programa que diga 
#el número total de personas que se han contagiado cuando pasen D días a partir de hoy, si el número de
#contagiados actuales es C.

def main():
    C=int(input("contagiados al dia 1: "))
    D=int(input("dias despues: "))
    return print("total de contagiados a ese dia "+ str(covid(C,D)))

def covid(c,d):
    l=1
    for l in range (l,d+1,1):
        c*=2
    return c
main()