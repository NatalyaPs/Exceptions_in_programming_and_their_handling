/*public static void main(String[] args) {
        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}  });
        System.out.println(sum);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    сумма эл-тов массива. Если буква, то она конвентируется в ноль
    */


public class sem_2_2 {
    public static void main(String[] args) {
        int sum = sum2d(new String[][]{{"1", "2", "3", "4", "j", "6"}, {"1", "w"}, {"2", "7"}  });
        System.out.println(sum);
    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}

/*
Максим Максим
for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");]
for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");*/