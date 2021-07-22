def saludo():
    msg=int(input("Digite una opcion: \n1. entrada carro \n2. salida carro \n3. fin\n"))
    return msg
def despedida():
    msg=input("programa terminado")
    return msg
def pedir_datos_auto():
    placa=input("placa: ")
    hora_entrada=input("hora enrada: ")
    datos_entrada=[placa, hora_entrada]
    return datos_entrada
def main():
    encendido=True
    while encendido:
        opcion=saludo()
        if opcion==1:
            datos_entrada=pedir_datos_auto()
            print(datos_entrada)
        if opcion==3:
            encendido=False
            print(despedida())
main()