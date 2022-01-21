package ua.goit.groceryStore;

import static ua.goit.groceryStore.Groceries.products;
import static ua.goit.groceryStore.Utils.calculateTotalCost;

public class Main {
    public static void main(String[] args) {

        products();

        double totalCost = calculateTotalCost("AAAAAABBCCCDD");
        System.out.println("Basket value = " + totalCost);
    }
}
