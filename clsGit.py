class Git():
    def __init__(self):
        import os
        self.comandoIngresado = False
        self.ruta = os.getcwd()

    def cls(self):
        import os
        os.system("clear || cls")

    def completo(self):
        print("Tarea finalizada. Presione enter para continuar.")
        input()
        self.cls()
        for i in range(50):
            print()

    def push(self):
        import os
        os.system("cd && cd "+ self.ruta +" && git add .")
        os.system("cd && cd "+ self.ruta +" && git commit -m pushConPython")
        os.system("cd && cd "+ self.ruta +" && git push")
        self.completo()

    def status(self):
        import os
        os.system("cd "+ self.ruta +" && git status")
        self.completo()

    def ejecutarComando(self, comandoRecibido):
        if comandoRecibido.lower() == "push":
            self.comandoIngresado = True
            self.push()
        if comandoRecibido.lower() == "status" and not self.comandoIngresado:
            self.comandoIngresado = True
            self.status()
        if not self.comandoIngresado:
            print("Comando no registrado.")

git = Git()
try:
    import sys
    git.ejecutarComando(sys.argv[1])
except:
    git.status()