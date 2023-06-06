import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number;
        System.out.println("Введите дробное число:");
        while (true) {
            try {
                number = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Попробуйте еще раз:");
            }
        }
        scanner.close();
        System.out.println("Вы ввели число: " + number);
    }
}

// Задача 2

// double catchedRes1 = intArray[8] / d;
// Здесь происходит попытка деления на ноль, что приведет к выбросу исключения ArithmeticException. Ошибка может быть исправлена путем проверки значения переменной d перед выполнением операции деления.

//исправленный код 


// try {
//     int d = 0;
//     double catchedRes1 = 0.0;
//     if (d != 0) {
//         catchedRes1 = intArray[8] / d;
//     }
//     System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
// }
// В этом коде мы добавили условие if (d != 0) для проверки значения d, и только если это значение не равно нулю, выполняется операция деления и результат сохраняется в переменную catchedRes1. Если же d равно нулю, то операция деления не выполняется, и в переменную catchedRes1 сохраняется значение по умолчанию (0.0).


public static void foo(String[] args) {
    try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[1] = 9;
    } catch (Throwable ex) {
        System.out.println("Что-то пошло не так...");
    } catch (NullPointerException ex) {
        System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
        System.out.println("Массив выходит за пределы своего размера!");
    }
}

public static void printSum(Integer a, Integer b) {
    System.out.println(a + b);
}



// Задание 2
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        }
        scanner.close();
        System.out.println("Вы ввели: " + input);
    }
}