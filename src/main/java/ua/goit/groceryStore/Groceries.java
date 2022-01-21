package ua.goit.groceryStore;

import java.util.ArrayList;
import java.util.List;

public class Groceries {
    static List<Products> groceriesList = new ArrayList<>();

    public static void products() {
        groceriesList.add(new Products("Apple", 1.25, "A"));
        groceriesList.add(new Products("Banana", 1.5, "B"));
        groceriesList.add(new Products("Peach", 3.2, "C"));
        groceriesList.add(new Products("Apricot", 2.5, "D"));
    }
}
