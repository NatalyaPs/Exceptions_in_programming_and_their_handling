/* Если необходимо, исправьте данный код:
 try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
} */

public class home_work_2_2 {
   public static void main(String[] args) {
      int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      // int[] intArray = null;
      // int[] intArray = {1, 2, 3};
      int d = 0;
      // int d = 2;
      try {
         if (intArray == null) {
            throw new NullPointerException("Для данной операции входящий масcив не может быть пустым.");
         }
         if (intArray[8] >= intArray.length) {      
            throw new ArrayIndexOutOfBoundsException("Указан индекс за пределам массива.");
         }
         if (d == 0) {
            throw new ArithmeticException("На ноль делить нельзя.");
         }
         double catchedRes1 = intArray[8] / d;
         System.out.println("catchedRes1 = " + catchedRes1);
      } catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException e) {   // перехватываем наши исключения
         e.printStackTrace();
      } catch (Exception e) {
         System.out.println("Непредвиденная ошибка: " + e);
      }
   }
}
