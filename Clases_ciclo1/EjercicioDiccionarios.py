#Dory quiere ir al mercado a comprar frutas y vegetales. Como es un poco olvidadiza suele ir al mercado varias 
#veces para ir a comprar diferentes frutas y verduras.
#Entrada: La entrada de este problema contiene un entero N que es la cantidad de viajes que hace al mercado. 
#En cada viaje se define un número M correspondiente a la cantidad de productos disponibles en el mercado. 
#Después se tienen M productos con sus precios respectivos por kg. La siguiente entrada contiene un entero P 
#que indica la cantidad de productos que Dory quiere comprar. Las siguientes líneas contienen el nombre del 
#producto y la cantidad de kilos que Dory quiere comprar.
#Salida:Muestre el dinero gastado por Dory en cada viaje al mercado con dos cifras de precisión decimal.

def main():
    N=int(input())
    for i in range (N):
        pd=int(input())
        productos_disp={}
        for i in range (pd):
            p=(input()).split(" ")
            productos_disp[p[0]]=float(p[1]) #agrega los elementos de p[0] a las claves del diccionario vacio y agrega los p[1] como los valores.
        pc=int(input())
        productos_comp={}
        for i in range(pc):
            c=(input()).split(" ")
            productos_comp[c[0]]=int(c[1])
        total=0.0
        for i in productos_comp.keys():
            total+=float(productos_comp[i])*float(productos_disp[i])
        t=total
        if(N==1):
            print ("$"+"{0:2.2f}".format(t))
        else:
            print ("$ "+"{0:2.2f}".format(t))
main()
