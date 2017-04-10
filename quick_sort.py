import sys

class Data:

    def get_data(filename):
        lines = [line.rstrip('\n') for line in open(filename, 'r')]
        return lines

lista = Data.get_data(str(sys.argv[1]))
print(lista)
