#1
#Un granjero tiene cincuenta animales entre conejos y gallinas. Si la cantidad de patas de los animales es
#ciento cuarenta, ¿Cuántos conejos y cuántas gallinas tiene el granjero?

import numpy as np
print("Un granjero tiene cincuenta animales entre conejos y gallinas. Si la cantidad de patas de los animales es ciento cuarenta, ¿Cuántos conejos y cuátas gallinas tiene el granjero?.")
A=np.matrix([[4, 2], [1, 1]])
b=np.matrix([[140], [50]])
if np.linalg.det(A) == 0:
    x = None
    print("No se puede resolver")
else:
    x= (A**-1)*b
print("Cantidad de Gallinas es= " +str(x[0,0]))
print("Cantidad de Conenos es= "  +str(x[1,0]))

