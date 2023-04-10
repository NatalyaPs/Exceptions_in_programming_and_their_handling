/*2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/

public class home_work_1_2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        // int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        sumArray(arr1, arr2);
        printArray(sumArray(arr1, arr2));

    }

    public static int[] sumArray (int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Массивы разной длины");
        }
        int[] arraySum = new int[array1.length];
        if (array1.length == array2.length) {
            for (int k = 0; k < array1.length; k++) {
                arraySum[k] = array1[k] + array2[k];
            }
        }
        return arraySum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
