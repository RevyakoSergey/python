
#Задача 3

names = ["Иван", "Мария", "Петр", "Илья", "Марина", "Петр", "Алина", "Бибочка"]
names = sorted(names)
names_sr = dict()

for name in names:
  f_let = name[0].upper()
  
  names_sr[f_let] = names_sr.setdefault(f_let,set()) |{name.capitalize()}
 

print(names_sr )
