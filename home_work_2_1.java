// import java.util.InputMismatchException;
import java.util.Scanner;

/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.*/


public class home_work_2_1 {
    public static void main(String[] args) {
        enterFloat();
    }

    private static float enterFloat () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                String string_numb = scanner.nextLine();
                float number = Float.parseFloat(string_numb);
                System.out.print("Введённое число: " + number);
                return number;
            } catch (NumberFormatException e) {
                System.out.print("Ошибка. " + e.getMessage() + "\n");
            }
        }
    }
}           

        // Scanner scan = new Scanner(System.in);
        // while (true) {
        //     try {
        //         System.out.print("Введите дробное число через запятую: ");
        //         float f = 0.0f;
        //         f = scan.nextFloat();
        //         System.out.print("Вы ввели следующее число: " + f);
        //         // break;
        //     } catch (InputMismatchException e) {     // несоответствие входных данных
        //         // e.printStackTrace();
        //         System.out.println("Ошибка. Повторите ввод: \n");
        //         scan.nextFloat();
        //     }
        // }