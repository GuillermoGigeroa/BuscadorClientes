import sys
import os

comandoIngresado = False

ruta = "C:/Users/guill/OneDrive/Documentos/Eclipse/"
nombreCarpeta = "BuscadorClientesTigre"

ruta = ruta + nombreCarpeta

def cls():
    os.system("clear")

def completo():
    print("Tarea finalizada. Presione enter para continuar.")
    input()
    cls()
    for i in range(50):
        print()

def push():
    os.system("cd && cd "+ ruta +" && git add .")
    os.system("cd && cd "+ ruta +" && git commit -m pushConPython")
    os.system("cd && cd "+ ruta +" && git push")
    completo()

def status():
    os.system("cd "+ ruta +" && git status")
    completo()

push()