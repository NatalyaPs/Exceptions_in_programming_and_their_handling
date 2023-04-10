/*1. Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив. 
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”*/

public class home_work_1_1 {
    public static void main(String[] args) {
        Integer[] array = {1, null, 2, null, 3, 4, 5};
        checkArray(array);
    }

    public static void checkArray (Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.printf("элемент с индексом %d - null\n", i);
            }
        }
    }
}
