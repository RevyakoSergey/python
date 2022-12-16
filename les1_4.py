#Вариант 1
n = int(input('Введите номер четверти : '))

if n == 1: 
    print(' x > 0 and y > 0 ')
elif n == 2:
    print('x < 0 and y > 0')
elif n == 3:
    print('x < 0 and y < 0') 
elif n == 4:
    print('x > 0 and y < 0') 
else:
    print('Введите соответствующую четверть')  

#Вариант 2
coordinates = [' x > 0 and y > 0 ',
'x < 0 and y > 0',
'x < 0 and y < 0',
'x > 0 and y < 0']
c = 0
c = int (input('Введите номер четверти :'))   
print(coordinates[c-1])
import math
x1 = float(input("x1 - "))
y1 = float(input("y1 - "))
x2 = float(input("x2 - "))
y2 = float(input("y2 - "))
a = (math.sqrt((x2-x1)**2+(y2-y1)**2))
print ('{:.3f}'.format (a))
