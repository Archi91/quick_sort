import sys
import time

class Data:

    def get_data(filename):
        lines = [int(line.rstrip('\n')) for line in open(filename, 'r')]
        return lines



class QuickSort:

    @staticmethod
    def sort_collection(collection):
        less = []
        equal = []
        greater = []
        if len(collection) > 1:
            pivot = collection[0]
            for x in collection:
                if x < pivot:
                    less.append(x)
                if x == pivot:
                    equal.append(x)
                if x > pivot:
                    greater.append(x)
            return(QuickSort.sort_collection(less) + equal + QuickSort.sort_collection(greater))
        else:
            return collection

start_time = time.time()
print(QuickSort.sort_collection(Data.get_data(str(sys.argv[1]))))
end_time = time.time()
final = start_time - end_time
print(final)
