#Задача 3


from random import randint

lst = [randint(0, 10) for i in range(10)]
print(lst)

from collections import Counter

c = Counter(lst)

res = [x for x in lst if c[x] == 1]

print(res)
