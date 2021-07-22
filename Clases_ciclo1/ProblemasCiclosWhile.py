#1
#Imprimir un listado con los números del 1 al 100 cada uno con su respectivo cuadrado

def list_1_100(): 
  i = 1 
  j = 1 
  while i<=100: 
      print(i, ",", j) 
      i+=1 
      j=i**2  
list_1_100() 

#2
#Imprimir un listado con los números impares desde 1 hasta 999 y seguidamente otro listado con los números 
#pares desde 2 hasta 1000.

def list_1_100(): 
  i = 1 
  j = 2 
  while i<=999 and j<=1000: 
      print(i, ",", j) 
      i+=2 
      j+=2  
list_1_100() 

#3
#Imprimir los números pares en forma descendente hasta 2 que son menores o iguales a un número natural n ≥ 2 dado.

def list_pares():
    n=int(input("Digite un numero par: "))
    while n>=2: 
        print(n)
        n-=2 
list_pares()

#4
#En 2022 el país A tendrá una población de 25 millones de habitantes y el país B de 18.9 millones. Las 
#tasas de crecimiento anual de la población serán de 2% y 3% respectivamente. Desarrollar un algoritmo para 
#informar en que año la población del país B superará a la de A

def main():
    A=25000000
    B=18900000
    ñ=print("A superara a B en el "+str(poblacion(A,B)))
def poblacion(a,b):
    i=2022
    while a>b :
        a=a+a*0.02
        b=b+b*0.03
        i+=1
    return i
main()

#5
#Diseñar una función que permita calcular el épsilon de la máquina. El épsilon de máquina es el número decimal 
#más pequeño que sumado a 1 se puede representar de manera precisa en la máquina (que no es redondeado), es 
#decir, retorna un valor diferente de 1, éste da una idea de la precisión o número de cifras reales que pueden 
#ser almacenadas en la máquina. La idea es realizar un ciclo en el cual se realiza la operación 1 + e para 
#potencias de 2 desde e = 2^0 y continuando con potencias decrecientes de 2 e = 2^−1, e = 2^−2, e = 2^−3, 
#e = 2^−4, . . .hasta obtener que el resultado de la suma 1 + e no se altere

def epsilon():
    n=0
    e=2**n
    e0=e
    while e>0:
        e0=e
        e=2**n
        e1=1+e
        n-=1
    return e0

print(f"el minimo numero positivo en esta maquina es {epsilon()} ")
