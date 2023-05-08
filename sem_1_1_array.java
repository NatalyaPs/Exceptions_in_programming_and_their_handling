/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
--- если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
--- если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
--- если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. 
То есть, этот метод запросит искомое число у пользователя, вызовет первый, 
обработает возвращенное значение и покажет читаемый результат пользователю. 
Например, если вернулся -2, пользователю выведется сообщение: “Искомый элемент не найден”.*/

/* из чата (?) Максим - код замера времени исполнения программы
long start = System.nanoTime();
Код 
        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed); */

// showMessageDialog - заменяет print полностью

// решение Андрей Романенков
        import java.util.Scanner;

        public class sem_1_1_array {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("> ");
                int a = scanner.nextInt();
                int[] array = {1, 2, 3, 4, 5};
                int res = arrayN(array, a);
                switch (res) {
                    case -3 -> System.out.println("Массив не может быть null");
                    case -4 -> System.out.println("Длина массина равна нулю");
                    case -1 -> System.out.println("Массив меньше заданной длины (3)");
                    case -2 -> System.out.printf("%d не найден в массив", a);
                    default -> System.out.printf("%d имеет индекс %d", a, res);
                }
                scanner.close();
        
            }
        
            private static int arrayN(int[] array, int n) {
                if (array == null) {
                    return -3;
                }
                if (array.length == 0) {
                    return -4;
                }
                if (array.length < 3) {
                    return -1;
                }
        
                for (int i : array) {
        
                }
        
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == n) {
                        return i;
                    }
                }
                return -2;
            }
        }

        
        /*Максим Максим - для замера времени исполнеия:
        long start = System.nanoTime();
        long finish = System.nanoTime();
        long elapsed = finish - start;
        iPrintArray.printArray(arr);
        System.out.println("Прошло времени, мс: " + elapsed);
        */

       /* Максим Максим
        showMessageDialog - заменяет принтер - интересный вывод вместо вывода в консоль
        ------------------------------------

        package VIVI;

        import Converted.IConverted;
        import Converted.PersonConverted;
        import VIVI.Command.*;
        
        import java.util.Objects;
        
        import static javax.swing.JOptionPane.showInputDialog;
        import static javax.swing.JOptionPane.showMessageDialog;
        
        public class ViewNew {
            IConverted iConverted = new PersonConverted();
        
            public void ViewvNEW() {
                //Новый метод вызова
                Presenter presenter = new Presenter(
                        new AddHumanCommand(),
                        new AddCildrenCommand(),
                        new AddParentsCommand(),
                        new SearchCommand(),
                        new ShowTreeAllCommand(),
                        new SortingCommand()
        
                );
        
                outer:
                for (; ; ) {
                    String txt = showInputDialog("""
                            \t\t\t\t\t\tДобро пожаловать в программу \n
                            \t\t\t\t\t\tгенеалогическова древа\n
                            \t\t\t\t\t\t\t\t\tВыберете действие
                            
                            \t\t\t\t\t\t\t\t\tДобавить человека
                            \t\t\t\t\t\t\t\t\tДобавить детей
                            \t\t\t\t\t\t\t\t\tДобавить родителей
                            \t\t\t\t\t\t\t\t\tПоказать все древо
                            \t\t\t\t\t\t\t\t\tПоиск по имени
                            \t\t\t\t\t\t\t\t\tСортировка""");
                    switch (txt.toLowerCase()) {
                        //iConverted.personСonvertedUpper_Lower(txt) -> не смог применить поскольку пришлось бы ломать метод
                        case "добавить человека" -> presenter.AddHumanCommandRecord();
                        case "добавить детей" -> presenter.AddСhildrenCommandRecord();
                        case "добавить родителей" -> presenter.AddParentsCommandRecord();
                        case "показать все древо" -> presenter.ShowTreeAllCommandRecord();
                        case "поиск по имени" -> presenter.SearchCommandRecord();
                        case "сортировка" -> presenter.SortingCommand();
                        default -> {
                            showMessageDialog(null, "Промазал давай по новой ");
                            continue outer;
                        }
                    }
                        String txt2 = showInputDialog(null, "\t\t\t\t\t\t\t\t\tПовторить Выбор ?\n\t\t\t\t\t\t\t\t\tДа? \t\t\t\t\t\t\t\t\tНет?");
        
                    if (Objects.equals(txt2.toLowerCase(), "да")) {
                            continue outer;
                        } else {
                            Objects.equals(txt2.toLowerCase(), "нет");{
                                break outer; //я не знаю почему светит серым, но все работает
                            }
                        }
        
        
                    }
        
        
                }
            }
        
        /*
        через условный оператор как то работало чрез жопу, через switch
         */

        