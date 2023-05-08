package FinalProject;
/*
Продвинутая работа с исключениями в Java
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, 
при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. 
Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), 
должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException 
и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).
*/

public class FinalProjectException {
    public static void main(String[] args) { 
        
        String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"4", "3", "2", "1"}, {"8", "7", "6", "5"}};
        // String[][] array = {{"1", "2", "3b***", "4"}, {"5", "6", "7", "8"}, {"4", "3", "2", "1"}, {"8", "7", "6", "5"}};
        // String[][] array = {{"1", "2"}, {"5", "6", "7", "8"}, {"4"}, {"8", "7", "6", "5"}};
        
        try {
            int sum = calculateArray(array);
            System.out.println("Сумма элементов массива: " + sum);
        }catch (MyArraySizeException e) {
            System.out.println("Размер массива должен быть 4х4");
        }catch (MyArrayDataException e) {
            System.out.printf("В ячейке [%d][%d] некорректное значение", e.getRow(), e.getColumn());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void checkIfArrayIsSquare(String[][] array) throws MyArrayException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[i].length != 4) {
                    throw new MyArraySizeException();
                }        
            }
        }
    }

    public static int calculateArray(String[][] array) throws MyArrayException {
        checkIfArrayIsSquare(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
