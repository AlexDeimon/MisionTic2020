#A un niño pequeño le gusta escribir al reves. Sin embargo ha escrito unas cadenas muy largas y se tiene la 
#traducción. El necesita su ayuda para saber si lo que ha escrito al revés es lo mismo que piensa.
#Entrada: Dos Strings uno con la cadena al derecho y otro con la posible cadena invertida.
#Salida: La palabra SI si la palabra corresponde a su versión invertida.  La palabra NO en caso contrario.

c=input()
cr=input()

if c==(cr[::-1]):
    print("SI")
else:
    print("NO")