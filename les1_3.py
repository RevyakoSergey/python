x = float(input('Введите кординату х: '))
y = float(input('Введите кординату y: '))
if x > 0 and y > 0: 
    print('I')
elif x == 0 or y == 0:
    print('Задайте верные значения')    
elif x < 0 and y > 0:
    print('II')
elif x < 0 and y < 0:
    print('III') 
else:
    print('IV')    
