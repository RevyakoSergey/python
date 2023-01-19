#Задача 2

def f(i):
   
   return 1 if i == 1 else i * f(i - 1)
n = int(input('Введите число: '))
spisok = [f(n - i) for i in range(n)]

print(spisok)
