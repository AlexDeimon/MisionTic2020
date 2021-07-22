#1
frutas = ["Tomate de árbol", "Maracuyá ", "Guayaba"]
for f in frutas: #para cada elemento f en la lista de frutas
  print(f)

#2
frutas_colombianas = ["Tomate de árbol", "Maracuyá ", "Guayaba", "Lulo", "Granadilla"]
fruta_buscar = input("ingrese fruta ")
for f in frutas_colombianas:
    if f == fruta_buscar:
        print("traigame un jugo de ",f)
        break
    else:
        print(f, " no me gusta")

#3
suma = 0
while True:
    dato = int(input('Ingrese un número entero a sumar o 0 para salir :'))
    if(dato == 0):
        break
    suma += dato
print('La suma es: '+ str(suma))

#4
list(range(5)) #genera una lista con valores desde 0 a 4 incrementando de a uno en uno

#5
list(range(0,5,1)) #mismo ejemplo que el anterior pero especificando start en 0 e incrementando de a uno en uno

#6
#generar una lista con los números desde 10 hasta 2 saltando de dos en dos
list(range(10,1,-2))

#7
#generar una con los números de 2 a 10 incrementando de 2 en 2
list(range(2,11,2))

#8
def f():
    for i in range(10, 0, -1):
      print(i)
f()

#9
for i in range(3):
    print("hola")

#10
#Generar una lista con los elementos de 99 a 1 en orden descendente: 99, 98, 97, 96, ..., 3, 2, 1
def f():
    for i in range(99, 0, -1):
      print(i)
f()

#11
#Generar una lista con los múltiplos de 5 de 0 a 45: 0, 5, 10, 15, ..., 30, 35, 40, 45
def f():
    for i in range(0, 50, 5):
      print(i)
f()

#12
#Generar una lista con los números impares de 123 a 140: 123, 125, ..., 139
def f():
    for i in range(123, 140, 2):
      print(i)
f()

#13
casos = int(input())

for x in range(casos):
    print("hola")

