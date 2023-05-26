# APRENDIENDO PHYTON
# QUE ES PHYTON?
# ES UN LENGUAJE INTERPRETADO O DE SCRIPT, CON TIPADO DINAMICO
# FUERTEMENTE TIPADO, MULTIPLATAFORMA Y ORIENTADO A OBJETOS
# UN LENGUAJE DE TIPADO DINAMICO SIGNIFICA QUE NO ES ESTRICTAMENTE TIPADO
# EN PHYTON TODOS SON OBJETOS Y CADA OBJETO TIENE LOS SIGUIENTES CAMPOS
# 1)UN TIPO DE DATO ALMACENADO
# 2)IDENTIFICADOR UNICO PARA DISTINGIR DE OTROS OBJETOS
# 3)VALOR CONSISTENTE CON SU TIPO
# print sirve para imprimir
print("hola mundo")
#al ser un lenguaje de tipado dinamico no se declara variable
mensaje='hola mundo'
a = 2
b = 3
suma=a+b
pi = 3.14159
es_nuevo=True
COMPLEJO = 3+2J
# imprimiendo valores

print(suma)
print(mensaje)
print(pi)
print(es_nuevo)
print(COMPLEJO)
# type nos permite saber que tipo es la variable
print(type(a))
print(type(pi))
print(type(COMPLEJO))
print(type(es_nuevo))
# Estructuras de control
# IF
edad = 18 
if edad >= 18:
    print('es mayor de edad')
else:
    print('es menor de edad')
# FOR
print('USO DEL FOR')
for i in range(5):
    print(i)
# WHILE
print('USO DEL WHILE')
contador = 0 
while contador < 5:
    print(contador)
    contador +=1
# EJEMPLO DE CASE 

def case_example(argument):
    if argument == 1:
        print("Opción 1 seleccionada")
    elif argument == 2:
        print("Opción 2 seleccionada")
    elif argument == 3:
        print("Opción 3 seleccionada")
    else:
        print("Opción no válida")
case_example(1)

# ejercicio planteado
RESTA = 5-9
print(RESTA)
if RESTA > 0 :
    print('ES POSITIVO')
else:
    print('Es NEGATIVO',RESTA)
# v2
def numero(argument):
    if argument >0:
        print("ES POSITIVO")
    elif argument < 0:
        print("ES NEGATIVO")
    else:
        print("NOSE WN")
numero(1-3)

