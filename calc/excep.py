
import mod_calc as c
def get_numder():
    while True:
        try:
            n = float(input('Enter number: '))
            return n
        except ValueError:
            input('Error.Enter number: ')
def menu_rat():
    n1 = get_numder()
    n2 = get_numder()
    while True:
        m = input('Select an operation\n'
                    '1 -  "sum+"\n'
                    '2 - "sub-"\n'
                    '3 - "mul*"\n'
                    '4 - "div/"\n'
                    '5 - "div//"\n'
                    '6 - "div"\n'
                    '7 - "pow**"\n'
                    '8 - "scrt**0.5"\n'
                    '0 -  previos menu\n'
                    )

def is_number_div(x, y):
    if y == '0':
        return False
    while True:
        try:
            float(x), float(y)
            return True
        except ValueError:
            return False


def is_number_all(x, y):
    while True:
        try:
            float(x), float(y)
            return True
        except ValueError:
            return False