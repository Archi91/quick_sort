import sys

class Data:

    def get_data(filename):
        lines = [line.rstrip('\n') for line in open(filename, 'r')]
        return lines

lista = Data.get_data(str(sys.argv[1]))


class QuickSort:

    @staticmethod
    def sort_collection(collection):
        pivot = len(collection)//2
        first_element = collection[0]
        last_element = collection[len(collection)-1]

        print(pivot, first_element, last_element)


QuickSort.sort_collection(lista)
