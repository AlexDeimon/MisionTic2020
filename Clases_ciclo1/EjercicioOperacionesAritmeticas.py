#El banco unaleño requiere su ayuda para la implementación de cajeros electrónicos en ciudad Gótica. Gótica 
#tiene billetes de $10.000, $20.000, $50.000 y $100.000.
#El banco desea emplear la menor cantidad de billetes posibles cuando un ciudadano realiza un retiro. El banco 
#en otro desarrollo de software ya se aseguró de que la cantidad de dinero a retirar sea múltiplo de 10000.
#Entrada: La entrada es un valor a retirar. Se garantiza que el valor a retirar es múltiplo de 10.000
#Salida: El número de billetes a repartir de cada denominación en el formato mostrado en las ejecuciones de ejemplo

valor=int(input())
cien=valor//100000
residuo= valor%100000
cincuenta=(residuo//50000)
residuo= residuo%50000
veinte=(residuo//20000)
residuo=residuo%20000
diez=(residuo//10000)
if valor%10000==0:
  print(cien,"x $100000")
  print(cincuenta,"x $50000")
  print(veinte,"x $20000")
  print(diez,"x $10000")
if valor%10000!=0:
  print("digite un valor divisible por 10.000")