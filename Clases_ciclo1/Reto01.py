#Entrada: Los valores de cada producto en una línea de código diferente. En el siguiente orden:
#El nombre del producto
#El costo unitario CU
#El precio de venta al público PVP
#La cantidad de unidades disponibles

#Salida: Se debe mostrar lo siguiente:
#El texto “Producto” sin comillas acompañado del nombre del producto
#El texto “CU:” sin comillas acompañado del costo unitario del mismo
#El texto “PVP:” sin comillas acompañado del precio de venta al público
#El texto “Unidades Disponibles:” acompañado de las unidades disponibles
#El texto “Ganancia:” acompañado del cálculo de la ganancia por ese producto. 

product = input("Digite el producto: ")
cost = int(input("Digite el costo unitario del producto: "))
PVP = int(input("Digite el precio de venta al público del producto: "))
units = int(input("Digite la cantidad de unidades disponnibles del producto: "))
profits = (PVP - cost)*units
print("Producto: " + str(product))
print("CU: $" + str(cost))
print("PVP: $" + str(PVP))
print("Unidades disponibles: " + str(units))
print("Ganancia: $" + str(profits))