
#Задача1 
from random import randint

n =input(" :")

n= int(n)
a = [randint(0, 30) for i in range(n)]
print(a)
m = [j for i, j in zip(a, a[1:]) if j > i]
print(m)
