import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Список возможных товаров для покупки:\n");
        int[] basket = new int[3];
        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] prices = {100, 200, 300};
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + " " + products[i] + " " + prices[i] + " руб/штука");
        }
        int sumProducts = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Выберете товар и количесво или введите 'end':\n");
            int productNumber = 0;
            int productCount = 0;

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
            String[] choise = input.split(" ");
            productNumber = Integer.parseInt(choise[0]) - 1;
            productCount = Integer.parseInt(choise[1]);
            basket[productNumber] += productCount;
            // System.out.println(Arrays.toString(basket));
        }
        System.out.println();
        System.out.println("Ваша корзина:");
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == 0) {
                break;
            }
            System.out.println(products[i] + " " + basket[i] + " шт, " + prices[i] + " руб/шт, " +
                    (basket[i] * prices[i]) + " рублей в сумме");
            sumProducts += (basket[i] * prices[i]);
        }
        System.out.println("итого: " + sumProducts + " рублей");
    }
}

