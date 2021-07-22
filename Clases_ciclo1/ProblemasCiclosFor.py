#1
#Imprimir un listado con los números del 1 al 100 cada uno con su respectivo cuadrado.

i=1
def f():
    for i in range(1,101, 1):
      print(str(i)+", "+str(i**2))
f()

#2
#Imprimir un listado con los números impares desde 1 hasta 999 y seguidamente otro listado con los números 
#pares desde 2 hasta 1000
i=1
def f():
    for i in range(1,1001, 2):
        print(str(i)+", "+str(i+1))
f()

#3
#Imprimir los números pares en forma descendente hasta 2 que son menores o iguales a un número natural n ≥ 2 dado.

n=int(input("Digite un numero par: "))
for n in range(n,0,-2):
  print(n)

#4
# Imprimir los números de 1 hasta un número natural n dado, cada uno con su respectivo factorial.

n=int(input("Digite un numero: "))
m=0
for n in range(1,n+1,1):
  m+=n
  print(str(n)+", "+str(m))

#5
#Calcular el valor de 2 elevado a la potencia n

n=int(input("Digite un numero: "))
for n in range(1,n,1):
  n+=1
print(2**n)

#6
#Leer un número natural n, leer otro dato de tipo real x y calcular x**n

n=int(input("Digite un numero exponente: "))
m=int(input("Digite un numero base: "))
for n in range(1,n,1):
  n+=1
print(m**n)

#7
#Diseñe un programa que muestre las tablas de multiplicar del 1 al 9

for n in range(1,10,1):
  for m in range(1,11,1):
    print(str(n)+" x "+ str(m)+" = "+str(n*m))
  print(" ")
