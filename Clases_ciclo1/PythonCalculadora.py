#1
valor_compra = float(input("digite el valor de la compra: "))
#crear la variable porcentaje descuento y leer el valor
descuento = valor_compra*0.1 #hay un descuento del 10%
valor_a_pagar = valor_compra - descuento
print("El valor a pagar es: " + str(valor_a_pagar))
print('Tu ahorro fue de: ' + str(descuento))

#2
#Utilizando el programa anterior, leer el descuento y calcular valor a pagar y ahorro.

valor_compra = float(input("digite el valor de la compra: ")) 
valor_descuento=float(input("digite el valor del descuento: ")) 
descuento = valor_compra*valor_descuento/100 
valor_a_pagar = valor_compra - descuento 
print("El valor a pagar es: " + str(valor_a_pagar)) 
print('Tu ahorro fue de: ' + str(descuento))

#3
#Elabore un programa que Calcule el área de un rectángulo.

base=int(input("Digite la base del rectángulo: "))
altura=int(input("Digite la altura del rectángulo: "))
area=base*altura
print("base: "+ str(base))
print("altura: "+ str(altura))
print("area: "+ str(area))

#4
#Elabore un programa que Calcule el área de un círculo.

from math import pi
xd=int(input("Digite el radio del circulo: "))
porq_si=pi*(xd**2)
print("El radio del circulo es: " + str(xd))
print("El area del circulo es: " + str(porq_si))

