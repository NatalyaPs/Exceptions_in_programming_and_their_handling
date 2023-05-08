/*Задание №1
Создайте метод doSomething(), который может быть источником одного из
типов checked exceptions (тело самого метода прописывать не обязательно).
Вызовите этот метод из main и обработайте в нем исключение, которое
вызвал метод doSomething().*/

import java.io.IOException;

public class sem_3_1 {
    public static void main(String[] args) {
        try {
            doSomething();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doSomething() throws IOException {
        // пробрасываем исключение в main
    }
}