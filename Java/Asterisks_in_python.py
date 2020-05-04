#Uses of asterisks in python

#For multiplication and power of
def mul(x, y):
    return x * y

def power(x, y):
    return x ** y

""" *args allows us to take in more arguments than the number of formal arguments that we previously defined.
With *args, any number of extra arguments can be tacked on to our current formal parameters (including zero extra arguments).
For example : we want to make a multiply function that takes any number of arguments and able to multiply them all together.
It can be done using *args."""
#In case of positional arguments use *args

def myMul(*args) :
    print(args)
    product = 1
    for arg in args :
        product = product * arg
    return product

print(myMul(1, 2, 3, 4))
#we can also do like :
#lis = [1, 2, 3, 4]
#print(myMul(*lis))

"""The special syntax **kwargs in function definitions in python is used to pass a keyworded, variable-length argument list.
One can think of the kwargs as being a dictionary that maps each keyword to the value that we pass alongside it."""
#In case of keyword arguments use **kwargs

def myFun(**kwargs):
    print(kwargs)
    for key, value in kwargs.items():
        print ("%s == %s" %(key, value))

#print(myFun(first ='Geeks', mid ='for', last='Geeks'))

"""*args means accepting the arbitrary numbers of positional arguments and **kwargs means accepting the arbitrary numbers of keyword arguments."""
#Using both
def save_ranking(*args, **kwargs):
    print(args)
    print(kwargs)

print(save_ranking('ming', 'alice', 'tom', fourth='wilson', fifth='roy'))

"""For unpacking the containers"""

#Using with reduce()
from functools import reduce
mylist = [ 1 , 3, 5, 6, 2, ]

def sum(*numbers):
    #using reduce to compute sum of list

    s = reduce(lambda a, b: a + b, numbers)
    return s

print(sum(*mylist))

#using with operator()
import operator
def sum1(*numbers):
    #using reduce to compute sum of list

    s = reduce(operator.add, numbers)
    return s

print(sum1(*mylist))


"""One more type of unpacking"""
my_list = [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
print(my_list)
print(*my_list)

for i in zip(*my_list):
    print(i)

#The above loop works same as the below one

for i in zip([1, 4, 7], [2, 5, 8], [3, 6, 9]):
    print(i)