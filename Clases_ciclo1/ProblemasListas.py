#1
#Dada una frase averiguar cuantas vocales tiene y mostrarlas. Para esto, se debe usar la siguiente lista 
#1
def encontrar(frase):
    f=list(frase)
    vowels = ['a', 'e', 'i', 'o', 'u']
    n=0
    m=0
    a=f.count(vowels[0])
    e=f.count(vowels[1])
    i=f.count(vowels[2])
    o=f.count(vowels[3])
    u=f.count(vowels[4])
    c=a+e+i+o+u
    return c
def main(): 
    lista=(input()).split(" ")
    listajunta=("".join(lista))
    print(encontrar(listajunta))
main()

#2
def main():
  vowels = ['a', 'e', 'i', 'o', 'u']
  frases=input()
  frase_letras=tuple(frases)
  contar(vowels,frase_letras)
def contar(vowels,frase_letras):
  n=0
  for vocal in vowels:
        print(vocal, frase_letras.count(vocal))
        n+=frase_letras.count(vocal)
  print(n)
main()

#Transforme la cadena El mejor regalo? El perdón... en regalo el perdón utilizando únicamente los métodos de 
#listas que hemos visto. La nueva cadena debe guardarse en la variable nueva_frase:
frase = "El mejor regalo? El perdón..."
list_frase = list(frase)
print(frase)
print(list_frase) #deben jugar con esta lista
n=0
while n<9:
  list_frase.pop(0)
  n+=1
list_frase.pop(6)
list_frase[7]="e"
n=16
for n in range(n,18,1):
  list_frase.pop(n)
list_frase.pop(16)

print(list_frase)

