// NullPointerException - это исключение возникает при попытке обратиться к объекту, который имеет значение null
public class les1 {
    public void nullPointerExceptionMethod() {
        String str = null;
        System.out.println(str.length());
    }
}
// ArithmeticException - это исключение возникает при попытке выполнить арифметическую операцию, которая не может быть выполнена, например, деление на ноль.public void arithmeticExceptionMethod() {
    public void arithmeticExceptionMethod() {
        int a = 10/0;
        System.out.println(a);
    }
    // ArrayIndexOutOfBoundsException - это исключение возникает при попытке обратиться к элементу массива по индексу, который находится за пределами диапазона массива.
    public void arrayIndexOutOfBoundsExceptionMethod() {
        int[] arr = new int[5];
        System.out.println(arr[6]);
    }

    // Задача 2
    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        // Проверяем равенство длин массивов
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не совпадают!");
            return null;
        }
    
        // Вычитаем элементы массивов
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
    int[] arr1 = {1, 2, 3};
int[] arr2 = {4, 5, 6};

int[] result = subtractArrays(arr1, arr2);
System.out.println(Arrays.toString(result)); // [-3, -3, -3]

int[] arr3 = {1, 2, 3};
int[] arr4 = {4, 5};

int[] result2 = subtractArrays(arr3, arr4); // Длины массивов не совпадают!