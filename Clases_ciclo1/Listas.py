#Así se crea una lista vacía
lis = []
print(lis)

#Una lista con un elemento
list2 = ["Este es un elemento"]
print(list2)

#Para crear una lista, se almacenan los valores separados por comas
lista3 = [1, 2, 3, 4.6, 'hola', 'a'] #una lista de 6 elementos
print(lista3)

#listas anidadas
lista1 = [0, 1, 2, 3]
lista2 = ['A', 'B', 'C']
lista3 = [lista1, lista2]
print(lista3)
print(lista3[0])
print(lista3[1][0])

#concatenar
list1 = ['A', 'B', 'C', 'E']
list2 = [1,2,3,4,5]
list3 = list1 + list2
print(list3)

#extender
nombres = ['Antonio', 'María', 'Mabel']
otros_nombres = ['Barry', 'John', 'Guttag']
nombres.extend(otros_nombres) #extend agrega una lista al final de otra lista.
print(nombres)

#repetir
list2 = [1,2,3,4,5]
list3 = list2*3
print(list3)
list4 = ['Abc', 'Bcd']
list5 = list4*2
print(list5)

#comparativos
#Es posible comparar dos listas con ==, >=, <, <=, != Se comparan de izquierda a derecha
print( ['Rojas', 123] < ['Rosas', 123] )
print( ['Rosas', 123] == ['rosas', 123] )
print( ['Rosas', 123] > ['Rosas', 23] )

a = ['Rojas', 123]
b = ["Rojas", 123]
c = ["Rosas", 123]

print( a == b )
print( a == c )

#is
#Se puede usar el operador is para determinar si dos listas son la misma (referencian al mismo objeto)
a = ['Rojas', 123]
b = ["Rojas", 123]
c = a
print( a == b )
print( a is b )
print( a == c )
print( a is c )

#Operador subindice [] (subscript)
avengers = ["Ironman", "Spiderman", "Ant-man", "Hulk"]
print(avengers[0]) 
print(avengers[3])
print(avengers[-1])    
print(avengers[-3]) 

#Consultando una lista (operador in)
#Para saber si un elemento está en una lista se puede utilizar el operador in
text = ['cien', 'años', 'de', 'soledad']
if 'años' in text:
  print('yes')
else:
    print("No")

text = ['cien', 'años', 'de', 'soledad']
if 'sien' not in text:
    print('No esta en la lista')
else:   
    print('Esta en la lista')

#Iterando una lista
#Es posible iterar una lista usando el ciclo for
s = ["hola", "amigos", "mios"]
for palabra in s:  #para cada palabra de la lista
    print(palabra + ",", end=' ')

#creando una lista
#Es posible asignarle una lista a una variable usando la asignación, el ciclo for y el concepto de lista.
d = 10
desplaza = [d+x for x in range(5)]
print(desplaza)
potencias = [3 ** x for x in range(2,6)]
print(potencias)

#Asignando múltiples variables
#Es posible asignarle los valores a un grupo de variables usando la asignación y el concepto de lista.
lista = [1, -2, 3]
a, b, c = lista
print('a=', a)
print('b=', b)
print('c=', c)

#Es posible asignar los valores de un grupo de variables usando la asignación, el ciclo \verb|for| y el 
#concepto de lista.
lista = [11, 9, -2, 3, 8, 5]  
var1, var2, var3 = [lista[i] for i in (1, 3, 5)] 
print("var1 =",var1,",var2 =",var2,",var3 =",var3)
var1, var2, var3 = [lista[i] for i in range(0,6,2)] 
print("var1 =",var1,",var2 =",var2,",var3 =",var3)

#listas y funciones
#Es posible retornar más de un valor en una función usando el concepto de lista
def minmax( a, b ):
    if a<b:
        return [a, b]
    else:
        return [b,a]
x, y = minmax( 5, 13 )
print('min=', x, 'max=', y)
x = minmax( 12, -4)
print('min=', x[0], 'max=', x[1])

#Metodos
#len
lista = [1,2,3,4]
nombre = ["Minch", "Yoda"]
trabajo = ["Stars", "War", "Movie"]
print(len(lista))   
print(len(nombre))
print(len(trabajo))

#cambiando elementos
#Es posible cambiar un elemento en una posición de una lista.
lista = ['E', 'l', 'm', 'e', 'j', 'o', 'r']
lista[0] = 'e'
print(lista)
lista[4] = 'l'
print(lista)
lista[-1] = 's'
print(lista)

#append: agregar elementos
#El método append permite agregar elementos al final de una lista.
nombres = ['Antonio', 'Johan']
nombres.append('Monica')
print(nombres)
nombres.append('Maria')
print(nombres)
nombres.append('Mabel')
print(nombres)

#insert: insertanr elementos
#nombres = ['Antonio', 'Johan', 'Maria']
nombres.insert(0, 'Guttag')
print(nombres)
nombres.insert(2, 'Peter')
print(nombres)
nombres.insert(len(nombres)//2, 10)
print(nombres)

#remove: eliminar elemntos
#remove permite eliminar la primera aparición (de izquierda a derecha) de un elemento de una lista
lista = ['a', 'e', 'i', 'o', 'u', 'i', 'x']
print(lista)
lista.remove('x')
print(lista)
lista.remove('i')
print(lista)

#Slice: sublistas
avengers = ["Ironman", "Spiderman", "Ant-man", "Hulk"]
print(avengers[1:3])
print(avengers[::-1])

#count
lista = [4, 3, 8, 8, 2, 5, 4, 6, 8, 9]
print(lista.count(2))
print(lista.count(8))
print(lista.count(5))

#index
lista = [4, 3, 8, 8, 2, 5, 4, 6, 8, 9]
print(lista.index(2))
print(lista.index(8))
print(lista.index(5))

#enumarmate: todos los indices
for index, i in enumerate(lista):
    print(index,i)

#Máximo y mínimo (max, min)
lista = [4,5,-1,6,7]
print(max(lista))
print(min(lista))

#sort: ordenar
lista = [4,5,-1,6,7]
lista.sort() #De menor a mayor
print(lista)
lista.sort(reverse=True) #De mayor a menor
print(lista)

#Convertir a lista
#El método list se usa para crear listas a partir de otros objetos, aquí se usa para convertir una cadena de 
#carácteres y tuplas a lista.
magician = 'Dumbledore'
lm = list(magician) 
print(lm)
t = ( 1, 2, 3, 4 )
lt = list(t) 
print(lt)

#del: eliminar
del(lm)

#Desempacar (unpacking) de variables
#Una forma rápida de desempacar y asignar variables de una lista es la siguiente:
list1 = [1, 2, 3]
a, b, c = list1
print('a:', a, 'b:', b, 'c:', c)
#Si se intentan obtener más valores de los que tiene la tupla se obtendrá el error: ```ValueError```
tup1 = (5,6)

#La función map(function, tuple|list)
#Ejecuta una función para cada uno de los valores de una tupla o una lista. Un truco muy usado es leer todos 
#los valores de una tupla en una sola línea
l = list(map(int, input().split(' '))) #digite por ejemplo 1 2 3
print(l) 
print(l[0]+ l[1]+ l[2])

#pop: eliminar un elemento de la lista
nombres = ['Antonio', 'Johan', 'Monica', 'María', 'Mabel']
nombres.pop(1) #remueve a Johan
print(nombres)
nombre_borrado = nombres.pop() # remueve a Mabel
print(nombre_borrado + " ha sido eliminada de la lista.")
print(nombres)


