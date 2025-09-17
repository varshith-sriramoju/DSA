import ctypes
class List:
    def __init__(self):
        self.size=1 #total allocated
        self.n=0 #given
        #create a ctype array to create dynamic
        self.A=self.__make_array(self.size)
    def __len__(self):
        return self.n
    def __append__(self)
    def __make_array(self,capacity):
        #cr a ctype array static,referential with size capacity
        return (capacity*ctypes.py_object)()
