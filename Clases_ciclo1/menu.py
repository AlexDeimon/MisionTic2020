def consultar(s):
    return s

def consignar(valor,s):
    s+=valor
    return s

def retiro(valor,s):
    s-=valor
    return s

saldo=1000000

bandera=True
while(bandera):
    print("por favor escoja una opcion: ")
    print("1. consultar saldo")
    print("2. consignar")
    print("3. retitar")
    print("o. salir")
    opcion=int(input("digite una opcion: "))

    if opcion==1:
        print(consultar(saldo))
    elif opcion==2:
        valor= float(input("por favor ingrese el valor a consignar: "))
        print("Despues de la consignacion el saldo de su cuenta es: ")
        saldo=consignar(valor,saldo)
        print(saldo)
    elif opcion==3:
        valor= float(input("por favor ingrese el valor a retirar: "))
        print("Despues del retiro el saldo de su cuenta es: ")
        saldo=retiro(valor,saldo)
        print(saldo)
    elif opcion==0:
        print("gracias por usar el servcio")
        bandera=False
    else:
        print("opcion no valida")

