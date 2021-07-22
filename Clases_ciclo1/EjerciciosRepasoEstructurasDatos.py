#Cobra Mosmas
#Al ver los precios y los anuncios del almacén Cobra Mosmas, un cliente le pide crear un programa de computador 
#que le permita ingresar el precio individual de tres productos y el precio de la promoción en combo de los tres 
#productos anunciada por el almacen y determine si es preferible comprarlos por separado o en el combo promoción
def comprar(p1,p2,p3,pc):
    if pc <= p1+p2+p3:
        return 'Combo'
    else:
        return 'Por separado'

a=float(input('Precio primer producto?'))
b=float(input('Precio segundo producto?'))
c=float(input('Precio tercer producto?'))
d=float(input('Precio combo?'))
print("Comprar",comprar(a,b,c,d))

#La cerca
#Un campesino de la región le pide crear un programa de computador que le permita determinar cual de dos 
#opciones (madera o alambre) es la mejor opción (menor costo) para encerrar un terreno rectangular de 𝑛 ∗ 𝑚 
#metros cuadrados, sabiendo el costo de un metro lineal de alambre, el costo de un metro de madera y la cantdad 
#de hilos de alambre o hileras de madera. El campesino solo piensa en usar una de las dos opciones, no las 
#piensa combinar.

def en_madera(n,m,w,p):
    return (2*n+2*m)*w*p

def en_alambre(n,m,h,a):
    return (2*n+2*m)*h*a

def usar(n,m,h,a,w,p):
    if en_madera(n,m,w,p) <= en_alambre(n,m,h,a):
        return 'Madera'
    else:
        return 'Alambre'
    
n=float(input('Largo terreno?'))
m=float(input('Ancho terreno?'))
a=float(input('Costo metro alambre?'))
h=int(input('Hilos de alambre?'))
p=float(input('Costo metro madera?'))
w=int(input('Hileras de madera?'))
print("Usar",usar(n,m,a,h,p,w))

#Lista Escolar
#Unos padres de familia desesperados por determinar el dinero que debenpedir prestado para pagar los útiles 
#escolares de su hijo, le han pedido crearun programa de computador que a partir de una lista de los precios 
#de cada útil escolar y de la cantidad de cada útil escolar en la lista, determineel precio total de la lista.
def costo(precio, cantidad):
    costo = 0
    for i in range(0,len(precio)):
        costo = costo + precio[i] * cantidad[i]
    return costo

precio = []
cantidad = []
while input('Ingresar otro útil?').upper()=='Si':
    precio.append(float(input('Precio útil?')))
    cantidad.append(float(input('Cantidad?')))
print("La lista cuesta", costo(precio, cantidad))

#ADN
#En la última edición de la revista científica ”ADN al día” se indica que laspruebas de relación entre 
#individuos a partir de código genético se definede la siguiente manera: Si las dos cadenas se diferencian en 
#menos de𝑝letras, existe una relación de padre-hijo, si se diferencian en menos de𝑓 > 𝑝letras, existe una 
#relación de formar parte de la misma familia. Deotra manera no existe relación. El laboratorioTein Cul Pan, 
#le pidedesarrollar un programa que a partir de dos cadenas de ADN del mismo tamaño, determine si existe una 
#relación pader-hijo, de la misma familia o ninguna, siguiendo las reglas definidas por la revista científica 
#”ADN aldía”.
def diferencia(a,b):
    cuenta = 0
    for i in range(0,len(a)):
        if a[i] != b[i]:
            cuenta = cuenta + 1
        return cuenta
    
def relacion(a,b,p,f):
  d = diferencia(a,b)
  if d <= p:
    return 'Padre-Hijo'
  elif d <= f:
    return 'Familia'
  else:
    return 'Ninguna'
    
ind1=input('Cadena ADN individuo 1?')
ind2=input('Cadena ADN individuo 2?')
p=int(input('Diferencia máxima para ser Padre-Hijo?'))
f=int(input('Diferencia máxima para ser Familia?'))
print("Relación", relacion(ind1, ind2, f, p))

#Extraer nombres de universidades Colombianas
#Dada una lista de Universidades Colombianas, obtener el nombre del sitio web. Se asume que un nombre de 
#universidad está entre los caracteres www. y edu.co. Por ejemplo de www.unal.edu.co se obtiene unal.
#Entrada: Un numero n indicando la cantidad de nombres de sitios web a procesar
#Salida: Listado de posibles nombres de universidades.
def agregar_estudiante(estudiantes, est):    
    estudiantes.append(est)

def promedio(estudiantes):
    prom = 0
    print(estudiantes)
    for estudiante in estudiantes:
        prom += float(estudiante[1])
    print("El promedio de los estudiantes es: " + str(prom/len(estudiantes)))

def ordenar(estudiantes):
    estudiantes.sort()

def consultar(estudiantes, nombre):
    encontrado = False
    for estudiante in estudiantes:
        if estudiante[0] == nombre:
            encontrado = True
            print(estudiante[1])
    if not encontrado:
        print("Estudiante no encontrado")
        
def visualizar(estudiantes):
    print("Lista de estudiantes".center(30, "#"))
    if len(estudiantes) == 0:
        print("No hay estudiantes registrados.")
    for e in estudiantes:
        print("Nombre: " + e[0] + ", nota:" + str(e[1]))
            
def procesar_comandos():
    bandera = True
    estudiantes = []
    comando = [0]
    while bandera or comando[0] != "6":
        bandera = False
        mostrar_menu()
        comando = input().split("&")
        print(comando[0])
        if comando[0] == "1":
            agregar_estudiante(estudiantes, (comando[1], float(comando[2])))
        elif comando[0] == "2":
            promedio(estudiantes)
        elif comando[0] == "3":
            ordenar(estudiantes)
        elif comando[0] == "4":
            consultar(estudiantes, comando[1])        
        elif comando[0] == "5":
            visualizar(estudiantes)
            
def mostrar_menu():
    print("Seleccione una opción:")
    print("Comando 1: Agregar estudiante y nota `1&nombre_estudiante&nota`")
    print("Comando 2: Calcular promedio de los estudiantes en un momento dado.")
    print("Comando 3: Ordenar estudiantes agregados por nombre")
    print("Comando 4: Consultar la nota de un estudiante `4&nombre_estudiante`")
    print("Comando 5: Visualizar")
    print("Comando 6: Salir")
procesar_comandos()

