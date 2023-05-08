import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. 
// Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class home_work_2_1_0 {
    public static void main(String[] args) {
        System.out.print("Введите дробное число через запятую: ");
        Scanner scan = new Scanner(System.in);
        float f = 0.0f;
        while (true) {
            try {
                f = scan.nextFloat();
                System.out.print("Вы ввели следующее число: " + f);
                break;
            } catch (InputMismatchException e) {     // несоответствие входных данных
                // e.printStackTrace();
                System.out.println("Ошибка. Повторите ввод: ");
                scan.nextFloat();
            }
        }
    }
}                
            //-------------------
            
            // scan.close();
            //-------------------------------
            // try {
            //     float fl = inputFloat();
            // } catch (InputMismatchException e) {  
            //     System.out.print("Ошибка. ");
            //     inputFloat();
            // }
            
        

        // public static float inputFloat () {
        //     Scanner scan = new Scanner(System.in);
        //     float number = 0.0f;
        //     System.out.print("Введите дробное число через запятую: ");
        //     number = scan.nextFloat();
        //     System.out.print("Ваше число: " + number);
        //     return number;
        // }
// }    
//-------------------------------------
// System.out.print("Введите дробное число через запятую: ");
            // Scanner scan = new Scanner(System.in);
            // float f = 0.0f;
            
            // try {
            //     f = scan.nextFloat();
            //     System.out.println("Вы ввели следующее число: " + f);
            // } catch (InputMismatchException e) {     // несоответствие входных данных
            //     // e.printStackTrace();
            //     System.out.print("Ошибка. Повторите ввод: ");
            //     scan.nextFloat();
            // }
            
            // scan.close();
// --------------------------
    // public static void main(String[] args) {
    //     System.out.print("Введите дробное число через запятую: ");
    //     Scanner scan = new Scanner(System.in);
    //     float f = 0.0f;
        
    //     try {
    //         f = scan.nextFloat();
    //         System.out.println("Вы ввели следующее число: " + f);
    //     } catch (InputMismatchException e) {     // несоответствие входных данных
    //         e.printStackTrace();
    //         System.out.println("Введите дробное число!");
    //     }
        
    //     scan.close();
    // }

    // ------------------------------------------
        // if (scan.hasNextFloat()) {
        //     f = scan.nextFloat();
        //     System.out.println("Вы ввели следующее число: " + f);
        // } else {
        //     throw new IllegalArgumentException("Введите дробное число!");
        // }
// } //-------------------
// public static void main(String[] args) {
    //     try {
    //         Scanner scan = new Scanner(System.in);
    //         float f = 0.0f;
    //         System.out.print("Введите дробное число через запятую: ");
    //         if (!scan.hasNextFloat()) {
    //             throw new InputMismatchException("Ошибка. Введите дробное число!" + scan.nextFloat());
    //             // System.out.print("Повторите ввод: ");
    //             // throw new IllegalArgumentException("Введите дробное число!");
    //             // scan.nextFloat();
    //         }
    //         f = scan.nextFloat();
    //         System.out.println("Вы ввели следующее число: " + f);
    //         scan.close();
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
        
    // }