// package lesson1;
//   1
/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
--- если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
--- если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
--- если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. 
То есть, этот метод запросит искомое число у пользователя, вызовет первый, 
обработает возвращенное значение и покажет читаемый результат пользователю. 
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.*/

//   2
/*Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
Необходимо посчитать и вернуть сумму элементов этого массива. 
При этом накладываем на метод 2 ограничения: 
метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), 
и в каждой ячейке может лежать только значение 0 или 1. 
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.*/

import java.util.Scanner;

public class sem_1_main_TEACHER {
    public static void main(String[] args) {
//        foo();
        ex1();
    }

    private static void foo() {
        try {
            int a = 2;
            int b = 3;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


    private static void ex1() {
        int[] arr = {4, 2, 6, 7, 8, 3, 2, 1, 7};
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для поиска: ");
        int n = in.nextInt();
        int index = searchNum(arr, n);
        switch (index) {
            case -1 -> System.out.println("Длина массива менее 3");
            case -2 -> System.out.println("Искомое число не найдено");
            case -3 -> System.out.println("Массив не может быть null");
            default -> System.out.printf("Искомое число %s находится под индексом %s%n", n, index);
        }
        System.out.println();
    }

    private static int searchNum(int[] arr, int n) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < 3) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -2;
    }

    private static int ex2(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != arr.length) {
                throw new RuntimeException("Массив не квадратный!");
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("В массиве есть элементы, отличные от 0 и 1!");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}