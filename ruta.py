class Variables:
    @classmethod
    def getRuta(cls):
        file = open("ruta.gg")
        linea = file.read()
        print(linea)
        return linea