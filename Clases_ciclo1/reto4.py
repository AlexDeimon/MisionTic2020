import json      
import requests  
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

def main():
    link= input()
    respuesta = requests.get(link) 
    tirillas= json.loads(respuesta.text)  
    for i in tirillas:
        print("Centro Comercial Unaleño \nCompra más y Gasta Menos \nNIT: 899.999.063")
        print(f'Cliente: {i["cliente"]}\nArt Cant Precio')
        acumulado = 0
        for j in range(len(i["productos"])):
            precios_productos = i["productos"][j]["precio unitario"] * i["productos"][j]["cantidad"]
            print(f'{i["productos"][j]["nombre"]} x{i["productos"][j]["cantidad"]} ${precios_productos}')
            acumulado += precios_productos
        D=int(descuento(acumulado))
        T=math.ceil(acumulado-D)
        print("Total: $"+str(T))
        print("En esta compra tu descuento fue $"+str(D))
        print("Gracias por tu compra\n---")
main()