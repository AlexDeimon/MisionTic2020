def division(a, b):
    try:
        coc = a/b
        res = a % b
        return (coc, res)
    except ZeroDivisionError:
        print('ERROR. DIVISION POR 0.')
        return ''


def main():
    try:
        num = float(input('digite el dividendo: '))
        div = float(input('digite el divisor: '))
        print(division(num, div))
    except ValueError:
        print('El valor digitado no es un numero.')

main()
