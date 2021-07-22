#1
#Dado un número entero, determinar si ese número corresponde al código ASCII de una vocal minúscula

def ascii(n):
    if 97<=n<=122:
        a=print(chr(n))
        return a
    else:
        return print("No corresponde a un Ascii de vocal minuscula")
def main():
    valor=int(input("Digite un numero entero: ")) 
    ascii(valor)
main()

#2
#Dada una cadena de longitud 1, determine si el código ASCII de primera letra de la cadena es par o no. 

def ascii(n):
    if 33<=n<=126 and n%2==0:
        b=print("es un ascii par")
        return b
    else:
        return print("no corresponde a un Ascii par")
def main():
    valor=[1]
    valor=ord((input("Digite una cadena de longitud 1 ")))
    ascii(int(valor))
main()

#3
#Dado un carácter, construya un programa en Python para determinar si el carácter es un dígito o no.

def main():
    c=input("digite un caracter: ")
    caracter(c)
def caracter(v):
    b=ord(v)
    if 48<=b<=57:
        i=print("el caracter es un digito")
        return i
    else:
        return print("el caracter no es un digito")
main()

#4
#Dado un número real x, construya una función que permita determinar si el número es positivo, negativo o cero.

def main():
    n=int(input("digite un numero real: "))
    tipo_numero(n)
def tipo_numero(t):
    if t==0:
        return print("el numero "+str(t)+" es neutro a la suma")
    elif t>0:
        return print("el numero "+str(t)+" es positivo")
    elif t<0:
        return print("el numero "+str(t)+" es negativo")  
main()  

#5
#Dado el centro y el radio de un círculo, determinar si un punto de R2 pertenece o no al interior del círculo.

print("Digite la coordenada del centro del circulo")
cx=int(input("x: "))
cy=int(input("y: "))
r=int(input("Digite el radio del circulo: "))
print("Digite la coordenada de un punto: ")
x=int(input("x: "))
y=int(input("y: "))

if r**2>=(x-cx)**2 + (y-cy)**2:
  print(f"el punto de coordenadas {x},{y} está dentro del circulo")
else:
  print(f"el punto de coordenadas {x},{y} no está dentro del circulo")

#6
#Dadas tres longitudes positivas, determinar si con esas longitudes se puede construir un tríangulo

a=int(input("lado a: "))
b=int(input("lado b: "))
c=int(input("lado c: "))
if a+b>c and a+c>b and b+c>a:
    print("los tres lados forman un triangulo")
else:
    print("los tres lados no forman un triangulo")