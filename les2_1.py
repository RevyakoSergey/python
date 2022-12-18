#Задача 1
num = input("Введите число: ")
x = num.split(".") 
a = int(x[0]) 
b = int(x[1]) 
res = 0
while (a != 0): 
    res = res + (a % 10)
    a = a // 10
while (b != 0): 
    res = res + (b % 10)
    b = b // 10
print("Сумма цифр:", res)
