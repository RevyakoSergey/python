#Задача 3
n = int(input('Введите число: '))
list = [round((1+1/i)**i, 3) for i in range(1, n+1)]
print(f'{list}\n {round(sum(list), 3)}')
