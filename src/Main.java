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
                    System.out.println("Какую покупку хотите добавить?");
                    String purchaseAdd = scanner.nextLine();
                    add(shoppingList, purchaseAdd);
                    break;
                case 2:
                    show(shoppingList);
                    break;
                case 3:
                    show(shoppingList);
                    System.out.println("Какую хотите удалить? Введите номер или название:");
                    String purchaseRemove = scanner.nextLine();
                    delete(purchaseRemove, shoppingList);
                    break;
                case 4:
                    find();
                    break;
            }
        }
    }

    public static void add(List<String> shoppingList, String purchase) {
        shoppingList.add(purchase);
        System.out.println("Итого в списке покупок: " + shoppingList.size() + "\n");
    }

    public static void show(List<String> shoppingList) {
        System.out.println("Список покупок:");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
        System.out.println();
    }

    public static void delete(String purchaseRemove, List<String> shoppingList) {
        try {
            int numberPurchaseRemove = Integer.parseInt(purchaseRemove) - 1;
            String removedPurchase = shoppingList.get(numberPurchaseRemove);
            shoppingList.remove(numberPurchaseRemove);
            System.out.println("Покупка \"" + removedPurchase + "\" удалена");
            show(shoppingList);
        } catch (NumberFormatException e) {
            shoppingList.remove(purchaseRemove);
            System.out.println("Покупка \"" + purchaseRemove + "\" удалена");
            show(shoppingList);
        }
    }

    public static void find() {
    }
}
