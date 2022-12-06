import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Добавить покупку в список\n" +
                    "2 - Показать список продуктов\n" +
                    "3 - Удалить покупку из списка\n" +
                    "4 - Найти покупку\n" +
                    "5 - Выход из программы\n" +
                    "Введите номер операции:");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 5) {
                System.out.println("Программа завершена!\n" +
                        "До свидания!");
                break;
            }
            switch (input) {
                case 1:
                    add();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    find();
                    break;
            }
        }
    }

    public static void add() {}

    public static void show() {}

    public static void delete() {}

    public static void find() {}
}
