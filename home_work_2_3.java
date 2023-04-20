import java.io.FileNotFoundException;

/*
Дан следующий код, исправьте его там, где требуется 
 public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
*/

public class home_work_2_3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя. ");
             }
            System.out.println(a / b);
            
            printSum(23, 234);

            int[] abc = { 1, 2 };
            for (int j = 0; j < abc.length; j++) {
                if (j >= abc.length) {      
                    throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива. ");
                }
            }
            abc[3] = 9;
        } catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e);
        }
     }

     public static void printSum(Integer a, Integer b) throws FileNotFoundException {      // ссылочный тип данных
        if (a == null  | b == null) { 
            throw new NullPointerException("Значения переменных не могут быть null. ");   // NumberFormatException  ?
        }    
        System.out.println(a + b);
     }
}
