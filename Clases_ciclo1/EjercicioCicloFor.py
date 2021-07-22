#Dado un número entero n y otro entero m, escriba un programa que muestre los múltiplos de m hasta n.
#Entrada: Los números n y m. Para este laboratorio es necesario que al leer n y m agrege los mensajes 
# "digite n:" y "digite m:"
#Salida: Como salida se debe mostrar el aviso

def multiplo(N,M):
    i=0
    if N%M==0:    
        for i in range (i,N+M,M):
            s=print(i)
        return s
    else:
        for i in range (i,N,M):
            s=print(i)
        return s
def main():
    n=int(input("digite n:"))
    m=int(input("digite m:"))
    print("los múltiplos son:")
    multiplo(n,m)

main()

