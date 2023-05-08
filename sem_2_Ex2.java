// package lesson2;  найти сумму эл-тов двумерного массива. Если вместо числа стоит что-то, то считать как ноль. ДОБАВИТЬ ИСКЛЮЧЕНИЯ ГДЕ НАДО

public class sem_2_Ex2 {   // исходный код
    public static void main(String[] args) {
        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}});
        System.out.println(sum);
    }
    // исходный код 
    private static int sum2d(String[][] arr) {  // потенциальная проблема: ссылочный тип данных приходит
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    // исправленный код
    static int solve(String[][] arr) {
        int sum = 0;

        try {
            if (arr == null) {
                throw new NullPointerException("Массив не может быть null. Невозможно вычислить сумму");
            }

            for (String[] strings : arr) {
                if (strings.length >= 5) {
                    throw new ArrayIndexOutOfBoundsException("Невалидный размер массива. Внутренний массив должен "
                            + "иметь размер 5");
                }
                for (int j = 0; j < 5; j++) {
                    int val = 0;
                    try {
                        val = Integer.parseInt(strings[j]);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    sum += val;
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            throw new NullPointerException(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("Непредвиденное исключение. " + e.getMessage());
        }
        return sum;
    }
}
