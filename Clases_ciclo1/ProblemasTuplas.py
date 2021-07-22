#1
#Obtener por código el elemento 20 de la siguiente tupla:
aTuple = ("Naranjita", [10, 20, 30], (5, 15, 25))
print(aTuple[1][1])

#2
#Dados dos números enteros construya una función que retorne al mismo tiempo el cociente y el residuo de la 
#división utilizando tuplas:
def calculo(a,b):
    cociente=print("cociente: "+str(a//b))
    residuo=print("residuo: "+str(a%b))
    return [cociente,residuo]
x=int(input())
y=int(input())
calculo(x,y)