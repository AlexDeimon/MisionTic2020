#Leer 4 valores enteros A, B, C y D. Si B es mayor que C y D es mayor que A y si la suma de C y D es mayor que 
#la suma de A y B y si C y D fueran valores positivos y si A es par, escriba el mensaje “Valores aceptados” sin 
#comilas. De lo contrario, escriba el mensaje “Valores no aceptados” sin comillas.
#La entrada corresponde a 4 valores enteros
#En la salida se debe mostrar las palabras "Valores aceptados" ó "Valores no aceptados" sin comillas
#dependiendo de si cumplen el criterio o no.
def valores(a, b, c, d):
	if (b>c and d>a and c+d > a+b and c >= 0 and d >= 0 and a%2 == 0):
		print("Valores aceptados")
	else:
		print("valores no aceptados")
a = int(input())
b = int(input())
c = int(input())
d = int(input())
valores(a,b,c,d)
