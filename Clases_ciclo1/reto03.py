import math
productos=[]
cantidad=[]
valor=[]
txp=[]

def ingreso(p,c,v):
    productos.append(p)
    cantidad.append(c)
    valor.append(v)
    return True

def totalXproducto(c,v):
    n=0
    while n<len(c):
        tp=v[n]*c[n]
        txp.append(tp)
        n+=1
    return txp    

def acumulado(v):
    t=sum(v)
    return t

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

def TOTAL(a,d):
    T=int(a-d)
    return T

def limpiar(p,c,v,t):
    del p[:]
    del c[:]
    del v[:]
    del t[:]
    return True

def imprimir(cl):
    print("Centro Comercial Unaleño \nCompra más y Gasta Menos \nNIT: 899.999.063")
    print("Cliente: "+cl+ "\nArt Cant Precio")
    q=[int(x) for x in cantidad]
    w=[int(x) for x in valor]
    totalXproducto(q,w)
    n=0
    while n<len(productos):
        print (str(productos[n])+" x"+str(cantidad[n])+" $"+str(txp[n]))
        n+=1   
    TXP=[int(x) for x in txp]
    A=acumulado(TXP)
    D=int(descuento(A))
    T=math.ceil(TOTAL(A,D))
    print("Total: $"+str(T))
    print("En esta compra tu descuento fue $"+str(D))
    print("Gracias por tu compra\n---")
    limpiar(productos,cantidad,valor,txp)
    return True

def main():
    bandera=True
    while bandera:
        opcion=(input())
        comando=opcion.split("&")
        if comando[0]=='1':
            ingreso(comando[1],comando[2],comando[3])
        elif comando[0]=='2':
            imprimir(comando[1])
        elif comando[0]=='3':
            bandera=False

main()