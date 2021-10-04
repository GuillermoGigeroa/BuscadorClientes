import sys
import os

comandoIngresado = False

ruta = "C:/Users/guill/OneDrive/Documentos/Eclipse/"
nombreCarpeta = "BuscadorClientesTigre"

ruta = ruta + nombreCarpeta

try:
    comando = sys.argv[1]
except:
    comando = "status"

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

def ejecutarComando(comandoRecibido,comandoValidar):
    if comandoRecibido.lower() == "push":
        comandoValidar = True
        push()
    if comandoRecibido.lower() == "status" and not comandoValidar:
        comandoValidar = True
        status()
    if not comandoValidar:
        print("Comando no registrado.")

ejecutarComando(comando, comandoIngresado)