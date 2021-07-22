#Lectura de n artículos:
#Se requiere leer una cantidad n de artículos que representan la compra de un cliente.
#Un artículo por ahora lleva nombre y precio.
#Cálculo de descuento:
#Por compras mayores a 150000 lleva un 10% de descuento.
#Por compras mayores a 300000 lleva un 15% de descuento.
#Por compras mayores a 700000 lleva un 20% de descuento.
#Entrada: Diferentes datos en el siguiente orden:
#La cantidad de artículos en el carrito
#El nombre y el precio de cada artículo en una línea diferente
#Salida: Se debe mostrar lo siguiente:
#La tirilla de compra en el formato especificado

#1
#sin listas
import math
def descuento(a):
    d=0
    if a>700000:
        d=a*0.2
        return d
    elif a>300000:
        d=a*0.15
        return d
    elif a>150000:
        d=a*0.1
        return d
    else:
        return d
def TOTAL(a,d):
    T=int(a-d)
    return T

def imprimir():
    n=int(input())
    c=0
    acumulado=0
    print("Centro Comercial Unaleño \nCompra más y Gasta Menos \nNIT: 899.999.063")
    while(c<n):
        producto=input()
        valor=int(input())
        acumulado+=valor
        c+=1
        print(producto)
        print(valor)
    D=int(descuento(acumulado))
    T=math.ceil(TOTAL(acumulado,D))
    while c<n:
        print(producto)
        print(valor)
    print("Total: $"+str(T))
    print("En esta compra tu descuento fue $"+str(D))
    print("Gracias por tu compra")


imprimir()


#2
#listas
import math
def main():
    n=int(input())
    x=0
    acumulado=0
    producto=[]
    valor=[]
    for i in range (n):
        producto.append(input())
        valor.append(int(input()))
    acumulado=sum(valor)
    D=math.floor(descuento(acumulado))
    T=math.ceil(total(acumulado,D))
    print("Centro Comercial Unaleño \nCompra más y Gasta Menos \nNIT: 899.999.063")
    for i in range(n):
        print(producto[i], end=" ")
        print("$"+str(valor[i]))
    
    print("Total: $"+str(T))
    print("En esta compra tu descuento fue $"+str(D))
    print("Gracias por tu compra")
    return 
def descuento(a):
    d=0
    if a>700000:
        d=a*0.2
        return d
    elif a>300000:
        d=a*0.15
        return d
    elif a>150000:
        d=a*0.1
        return d
    else:
        return d
def total(a,d):
    t=a-d
    return t
main()