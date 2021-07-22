#1
num = int(input('digite un número: '))
if num % 2 == 0:
    print(num, 'es par') #está en la suite que identifica que el residuo del número dado entre 2 es igual a cero
else:
    print(num, 'es impar') #está definido en la suite en caso de que el residuo del número dado entre 2 no sea igual a cero
if num & 1 == 0: #si el ultimo bit es cero es par
    print(num, 'es par') #está en la suite que identifica que el último bit del número es un 1
else:
    print(num, 'es impar') #está definido en la suite en caso de que el último bit del número es un 0

#2
def es_par(num):
    if num % 2 == 0:
        print(num, 'es par')
    else:
        print(num, 'es impar')    
num = int(input('digite un número: '))
es_par(num)

#3
def valor_absoluto(x):
    if x >= 0:
        return x
    else:
        return -x
numero = int(input('digite un número: '))
print('valor absoluto de x es' , valor_absoluto(numero))

#4
def descuento(vc):
    if vc > 10000 and vc <= 20000:
        print("valor a pagar", vc-vc*0.1, "y ahorró:" , vc*0.1)
    elif vc > 20000: # en otro caso si
        print("valor a pagar", vc-vc*0.2, "y ahorró:" , vc*0.2)
    else: #en otro caso
        print("usted compró muy poco y no tiene descuentos.")
vc = int(input('digite el valor total de su compra:'))
descuento(vc)

#5
def descuento(cantidad, precio):
    if 5 < cantidad <= 10:
        precio = precio - (precio*0.05)
    elif 10 < cantidad <= 20:
        precio = precio - (precio*0.1)
    elif 20 < cantidad:
        precio = precio - (precio*0.2)
    return precio*cantidad
def main():
    a = int(input("Digite la cantidad: "))
    b = float(input("Digite el precio: "))
    print("Valor a pagar: ", descuento(a, b))
main()

#6
x=int(input())
print("par") if x%2==0 else print("impar")