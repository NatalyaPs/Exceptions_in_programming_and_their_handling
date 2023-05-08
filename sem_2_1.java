import java.util.Scanner;

/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[10];
    System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
    int index = scanner.nextInt();
    try {
        arr[index] = 1;
    } catch (Exception e) {
        System.out.println("Указан индекс за пределам массива");
    }
}*/

// outer:
// for (; ; ) {   - см. бесконечный цикл - совет Максима Максима

public class sem_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
        int index = scanner.nextInt(); // может быть проблемы с вводом
        try {
            arr[index] = 1;  // может быть проблема с индексом - может не существовать
        } catch (Exception e) {
            System.out.println("Указан индекс за пределам массива");
        }
    }

    // решение преподавателя - Тимофея Сафронова
    static void solve() {
        try {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[10];
            System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
            int index = 0;
            if (!scanner.hasNextInt()) {
                throw new IllegalArgumentException("Ошибка ввода числа");
            }
            index = scanner.nextInt();
            if (index < 0 || index >= arr.length) {
                throw new ArrayIndexOutOfBoundsException("Указан индекс за пределами массива");
            }
            arr[index] = 1;
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка");
            e.printStackTrace();
        }

    }
}

// // решение Дмитрия Кочетова
// public class sem_2_1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] arr = new int[10];
//         System.out.println("Укажите индекс элемента массива, в который хотите записать значение 1");
//         int index = -1;
//         while (true) {
//             try {
//                 index = scanner.nextInt();
//             } catch (Exception e) {
//                 System.out.println("должно быть число");
//                 break;
//             }

//             try {
//                 arr[index] = 1;
//                 // break; 
//             } catch (Exception e) {
//                 System.out.println("Указан индекс за пределам массива");
//                 // break;
//                 scanner.next();
//             }
//         }
//         scanner.close();
//     }
// }


