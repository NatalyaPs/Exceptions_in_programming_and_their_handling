import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/*Исправьте код, примените подходящие способы обработки исключений:

public static void main(String[] args) {
        InputStream inputStream;
        try {
                String[] strings = {"apple", "orange"};
                String strings1 = strings[2];
                test();
                int a = 1 / 0;
                inputStream = new FileInputStream("/broken_reference");
        } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("На ноль делить нельзя");
        }
        catch (Throwable e) {
                e.printStackTrace();
        } catch (StackOverflowError error) {
                System.out.println("Что-то сломалось");
        } finally {
                System.out.println("Я все равно выполнился");
        }
        System.out.println("Я жив!");
}

private static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
} */

public class home_work_2_4 {
        public static void main(String[] args) {
                // inputFloat();
                int[] abc = { 1, 2 };
                    // if (abc[i] >= abc.length) {      
                    //     throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива.");
                    //  }
                    // abc[3] = 9;
                    // System.out.println(abc);
        
                    String[] strings = {"apple", "orange"};
                    String strings1 = strings[2];
                    System.out.println(strings1);
        }
        
        private static float inputFloat() {
                Scanner scanner = new Scanner(System.in);
                while (true) {
                    try {
                        System.out.print("Введите дробное число: ");
                        String number = scanner.nextLine();
                        System.out.print("Ваше число: " + Float.parseFloat(number));
                        return Float.parseFloat(number);
                    } catch (NumberFormatException e) {
                        System.out.println("Ошибка. ");
                    }
                }
            }
}
