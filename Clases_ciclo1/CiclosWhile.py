#1
def ejemplo_while(): 
  i = 2 #inicializa a i en 2
  j = 25 # inicializa a j en 25
  while i < j: #mientras i sea menor a j
      print(i, ",", j) #va a imprimir los valores de i , j
      i*=2 # i = i*2 como a i lo va multiplicando por 2 en cada paso se espera que supere a j en un punto
      j+=10 # j = j + 10 se incrementa de 10 en 10
  print("the end.") #esta es una instrucción que se ejecuta al terminar el ciclo while
  print(i, ",", j) #imprime los valores finales de i y de j
ejemplo_while() #aquí se llama el método

#2
def main():
    entero = int(input("Ingrese un numero entero:"))
    while not (65<=entero<= 90):
        entero = int(input("Ingrese un numero entero:"))

    print("Su número corresponde a: ", chr(entero) )
main()