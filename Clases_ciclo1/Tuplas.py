#Así se crea una tupla vacía
tupl = ()
print(tupl)

#Una tupla con un elemento
tupl2 = ("Este es un elemento", ) #python requiere la coma final para considerarla como una tupla
print(tupl2)

#Para crear una tupla, se almacenan los valores separados por comas
tup = (1, 2, 3, 4.6, 'hola', 'a') #una tupla de 6 elementos
print(tup)

#variables
x = () # x igual a tupla vacía

tup = (1, 2, 3, 4.6, 'hola', 'a') #tup es igual a esta tupla con 6 elementos

a = 1, 2, 3
a

#tuplas anidadas
tuple1 = (0, 1, 2, 3)
tuple2 = ('A', 'B', 'C')
tuple3 = (tuple1, tuple2)
print(tuple3)
print(tuple3[0])
print(tuple3[1][0])

#concatenar
tup1 = ('A', 'B', 'C', 'E')
tup2 = (1,2,3,4,5)
tup3 = tup1 + tup2
print(tup3)

#repetir
tup2 = (1,2,3,4,5)
tup3 = tup2*3
print(tup3)
tup4 = ('Abc', 'Bcd')
tup5 = tup4*2
print(tup5)

#comparativos
#Es posible comparar dos tuplas con ==, >=, <, <=, != Se comparan de izquierda a derecha
print( ('Rojas', 123) < ('Rosas', 123) )
print( ('Rosas', 123) == ('rosas', 123) )
print( ('Rosas', 123) > ('Rosas', 23) )

a = ('Rojas', 123)
b = ("Rojas", 123)
c = ("Rosas", 123)
print( a == b )
print( a == c )

#is
#Se puede usar el operador is para determinar si dos tuplas son la misma (referencian al mismo objeto)
a = ('Rojas', 123)
b = ("Rojas", 123)
c = a
print(id(a))
print(id(b))
print( a == b )
print( a is b )
print( a == c )
print( a is c )

#Operador subindice [] (subscript)
avengers = ("Ironman", "Spiderman", "Ant-man", "Hulk")
print(avengers[0]) 
print(avengers[3])
print(avengers[-1])    
print(avengers[-3]) 

#subtuplas
#Obtener una parte de la tupla [inicio:fin:incremento]
avengers[1:3]

avengers[::-1]

avengers[len(avengers):len(avengers)+1]

#Consultando una tupla (operador in)
#Para saber si un elemento está en una tupla se puede utilizar el operador in
text = ('cien', 'años', 'de', 'soledad' )
if 'años' in text:
    print('yes')
else:
    print("No")

#Iterando una tupla
#Es posible iterar una tupla usando el ciclo for
s = ("hola", "amigos", "mios")
for palabra in s: #para cada palabra de la tupla
    print(palabra + ",", end=' ')

#Asignando múltiples variables
#Es posible asignarle los valores a un grupo de variables usando la asignación y el concepto de tupla.
tupla = (1, -2, 3)
a, b, c = tupla
print('a=', a)
print('b=', b)
print('c=', c)

#Intercambiando variables
#Es posible intercambiar los valores de un grupo de variables usando la asignación y el concepto de tupla.
a = 1
b = 3
a, b = b, a
print('a=', a)
print('b=', b)

#Tuplas y funciones
#Es posible retornar más de un valor en una función usando el concepto de tupla
def minmax( a, b ):
    if a<b:
        return a, b
    else:
        return b,a
x, y = minmax( 5, 13 )
print('min=', x, 'max=', y)
x, y = minmax( 12, -4)
print('min=', x, 'max=', y)

#Metodos
#len
tup = (1,2,3,4)
nombre = ("Minch", "Yoda")
trabajo = ("Stars", "War", "Movie")
print(len(tup))
print(len(nombre))
print(len(trabajo))

#count
tupla = (4, 3, 8, 8, 2, 5, 4, 6, 8, 9)
print(tupla.count(2))
print(tupla.count(8))
print(tupla.count(5))

#index
tupla = (4, 3, 8, 8, 2, 5, 4, 6, 8, 9)
print(tupla.index(2))
print(tupla.index(8))
print(tupla.index(5))

#enumarmate: todos los indices
for index, i in enumerate(tupla):
    print(index,i)

#Máximo y mínimo (max, min)
t = (4,5,-1,6,7) 
max(t)
min(t)

t = (4,-1,4.0,-2)
max(t)

t = (4.0,-1,4,-2)
max(t)

tup1 = ('alice', 'bob', 'zorg')
max(tup1)
min(tup1)

#De cadena a tupla
#El método tuple se usa para crear tuplas a partir de otros objetos, aquí se usa para convertir una cadena de 
#carácteres a tupla.
magician = 'Dumbledore'
tm = tuple(magician) 
print(tm)

#del: eliminar
del(tm)

#Desempacar (unpacking) de variables
#Una forma rápida de desempacar y asignar variables de una tupla es la siguiente:
tup1 = (1, 2, 3)
a, b, c = tup1
print('a:', a, 'b:', b, 'c:', c)
#Si se intentan obtener más valores de los que tiene la tupla se obtendrá el error: ```ValueError```
tup1 = (5,6)

#La función map(function, tuple|list)
#Ejecuta una función para cada uno de los valores de una tupla o una lista. Un truco muy usado es leer todos 
#los valores de una tupla en una sola línea
t = tuple(map(int, input().split(' '))) #digite por ejemplo 1 2 3
print(t) 
print(t[0]+ t[1]+ t[2])

