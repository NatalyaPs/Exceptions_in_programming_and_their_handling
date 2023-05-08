/*Задание №3
1.
Создайтекласс исключения, который будет выбрасываться при делении на 0. 
Исключение должно отображать понятное для пользователя сообщение об ошибке.
2.
Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа. 
Исключение должно отображать понятное для пользователя сообщениеоб ошибке
3.
Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл. 
Исключение должно отображать понятное для пользователя сообщение об ошибке.  */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class sem_3_3 {
    public static void main(String[] args) throws DivideByZeroException, ArrayNullElementException, FileNotExistException{
        // // 1
        // try {                          // условный контроллер обращается к сервису с логикой. Зона ответственности хорошо разделена
        //     // dev(10, 0);
        //     dev(10, 5);
        // } catch (DivideByZeroException e) {
        //     e.printStackTrace();
        // }
        
        // 2
        try {
            printArray();
        } catch (ArrayNullElementException e){
            e.printStackTrace();
        }

        // 3
        // ...
        
        // throw new DivideByZeroException();
        // throw new ArrayNullElementException();
        // throw new FileNotExistException();

    }

    //  1
    private static void dev(int a, int b) {  // сервис с логикой, который требует проверки
        IsOperendIsNotValue(b);  // срашиваем все ли нормально
        int c = a / b;
        System.out.println(c);
    }

    public static void IsOperendIsNotValue(int b) {  // метод, который проверяет
        if (b == 0) {
            throw new DivideByZeroException();
        }
    }

    // 2
    public static void ArrayElementNotNull (Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new ArrayNullElementException();
            }
        }
    }

    public static void printArray() {
        Integer[] arr = {1, 2, null, 4};
        // Integer[] arr = {1, 2, 3, 4};
        ArrayElementNotNull(arr);
        // System.out.println(arr.toString());
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    // // 3         --   не разобрадлась как это сделать
    // public static void printFile(Path pathRead) {
    //     try (BufferedReader in = Files.newBufferedReader(pathRead)) {
    //         if (in == null) {
    //             throw new FileNotExistException();
    //         }
    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    // }


    // в данном случае классы создаем внутри класса для быстроты. 
    // Нужно делать отдельными файлами (классами)
    public static class DivideByZeroException extends RuntimeException {
        public DivideByZeroException() {
            super("Ошибка: деление на 0");
        }
    }

    public static class ArrayNullElementException extends RuntimeException {
        public ArrayNullElementException() {
            super("Ошибка: обращениe к пустому элементу массивa");
        }
    }

    public static class FileNotExistException extends RuntimeException {
        public FileNotExistException() {
            super("Ошибка: попытка открыть несуществующий файл");
        }
    }
}
