#1
str1 = 'ejemplo de cadena'
print(str1)

#2
id(str1) #id obtiene la posicion de memoria de la variable

#concatenar
nombre = "Minch Yoda"
trabajo = "Stars War"
print(nombre+" el maestro")
print(nombre+trabajo)
print(trabajo+' '+nombre)

#len: longitud de la cadena
a = 'May the Force be with you.'
len(a)

# in: Saber si una palabra o letra está en una cadena
text = 'cien años de soledad'

if 'años' in text:
    print('yes')

#Iteracion de una cadena
#1
s="hola amigos mios"
for i in range(len(s)):
    print(s[i]+",", end="")

#2
frutas = ['Pera', 'Manzana', 'Mango']

for fr in frutas:
    print(fr)

#comparar cadenas: se usan los operadores de comparacion (<,<=,>,>=,==,!=) 
print( 'Rojas' < 'Rosas' )
print( 'Rojas' == 'rosas' )

#operador subindice
name = "Minch Yoda"
print(name[0]) #imprime M
print(name[6]) #imprime Y
print(name[5]) #imprime espacio

#iterar a la derecha
name[-1]

#Slices: subcadenas 
#1
print(name)
name[0:5] #obtiene el texto desde la posición cero hasta la 4

#2
name[:5] #obtiene el texto desde la posición cero por defeco hasta la 4

#3
name[6:10] #obtiene el texto desde la posición 6 hasta la 10

#4
name[::-1] #invierte una cadena

#Para contar los caracteres en una cadena dada
#1
str1 = 'The avengers'
str1.count('e')

#2
str1.count('e',0,3) #cuenta cuantas e hay desde la posicion 0 a la 3

#3
str1.count('e',4,len(str1)) #cuenta cuantas e hay desde la posicion 4 hasta el largo de la cadena

#4
cad = 'abcabcabcabcabc'
cad.count('abc')

#find: encontrar primer el índice de una subcadena en la cadena dada.
str1 = 'All we have to decide is what to do with the time that is given us.'
str1.find('we', 0, len(str1))

#rfind: encontrar el último indice 
str2 = 'It is not despair, for despair is only for those who see the end beyond all doubt. We do not.'
print('first:', str2.find('despair'))
print('last: ', str2.rfind('despair'))

#MAYUSCULAS y minusculas
#1
s = input() #lee una cadena
print(s.lower()) #lower: minusculas

#2
s = input() #lee una cadena
print(s.upper()) #upper: mayúsculas

#3
name = 'cien años de soledad en Macondo'
print(name.capitalize()) #primer letra en mayuscula

#4
str1 = 'cien años de soledad en Macondo'
title = str1.title() #title: convertir el primer caracter de cada palabra en la cadena a mayuscula
print(title)
print(str1)

#5
print(title)
title.swapcase()#swapcase: intercambiar mayúsculas por minúsculas en una cadena 

#removiendo caracteres
#1
str1 = " ciudad de Bogotá "
str1.strip() #strip: quitalo que este en () por ambos lados de la cadena

#2
str1 = " ciudad de Bogotá "
str1.rstrip() #rstrip: quitalo que este en () a la derecha de la cadena

#3
str1 = " ciudad de Bogotá "
str1.lstrip() #lstrip: quitalo que este en () a la izquierda de la cadena

#4
str1 = " ICPC competition col"
str1 = str1.rstrip("col")
print(str1)

#dividir cadenas
#1
sdate = "05-06-2020"
sp = sdate.split("-") #split divide la cadena en cada - formando 3 subcadenas sp [0], sp[1] y sp[2]
print(sp)
print('día:' + sp[0] + ' mes: ' + sp[1] + ' año: ' + sp[2])

#2
sdate = "05-06-2020"
sdate.split("-", 1) #split solo se hace en el primer -

#3
cad = str(input())
num1, num2 = cad.split(' ') #se divide cad en las cadenas num1 y num2
print('num 1:' + num1)
print('num 2:' + num2)
print(num1 + num2)

#4
# en este código se pueden digitar dos números separados por &. 
s = input()
a,b = (int(x) for x in s.split("&")) #se dividen los numeros enteros separados por & en las cadenas a y b
print("a=" + str(a))
print("b=" + str(b))
print("a+b=" + str(a+b)) #al ser int al + se suman no se concatenan, pero al ser int se deben pasar luego a str

#5
sdate = "05-06-2020"
sdate.rsplit("-", 1) #rsplit: divide la cadenaen cada - de derecha a izquiera

#justificacion
#1
str1 = 'Bogotá'
str1.ljust(15, "#") #ljust: justificar una cadena a la izquierda

#2
str1 = 'Bogotá'
str1.rjust(15, "#") #rjust: justificar una cadena a la derecha

#3
str1 = 'Bogotá'
str1.center(15, "#") #center: justificar una cadena en el centro

#4
account = '123456789'
account.zfill(15) #zfill: completa la cantidad de espacios pedidos con ceros

binary_num = '10101010'
binary_num.zfill(16)

#replazar: replace
str1 = 'cien años de soledad'
print(str1)
rep = str1.replace('cien','setenta') #replace(old_str, new_str): reemplazar una palabra de una cadena por otra
print(rep)
rep = rep.replace('años','días')
print(rep)
rep = rep.replace('soledad','clases sincrónicas!')
print(rep)

#Crear una palabra a partir de una lista
#1
lista = ['cien', 'años', 'de', 'soledad']
" ".join(lista) #join junta los elementos de la lista y los sepra por " "

"".join(lista) 

"-".join(lista) 

#Métodos booleanos sobre cadenas
#endswith: saber si una cadena termina con
text = "Cien años de soledad."
result = text.endswith('soledad.')
print(result)

#startswith: saber si una cadena empieza con
text = "Cien años de soledad."
result = text.startswith('años',5,len(text))
print(result)

#isalpha: saber si una cadena contiene letras únicamente
str1 = 'lasquinceletras'
str1.isalpha()

str2 = 'las quince letras'
str2.isalpha()

str3 = 'edad:15'
str3.isalpha()

#isalnum: saber si una cadena contiene números y letras únicamente (alfanumérico)
str4 = 'edad15'
str4.isalnum()

str5 = 'edad15#'
str5.isalnum()

#isdigit: saber si una cadena contiene sólo dígitos.
str_num = '1234567898'
str_num.isdigit()


#isspace: saber si una cadena contiene sólo espacios.
strs = " "
strs.isspace()

#istitle: saber si una cadena es un título
strs = 'Cien Años De Soledad'
strs.istitle()

#islower: saber si una cadena contiene todos sus caracteres en minúsculas
str1 = 'pepe hola'
str1.islower()

str1 = 'pepe#235252'
str1.islower()

#isupper: saber si una cadena contiene todos sus caracteres en mayúsculas
str1 = 'PEPE MUNCK'
str1.isupper()

#Mínima ó máxima letra alfanumérica min, max:
min('abcdario')

max('abcdario')