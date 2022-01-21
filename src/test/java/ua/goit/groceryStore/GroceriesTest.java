package ua.goit.groceryStore;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ua.goit.groceryStore.Groceries.groceriesList;
import static ua.goit.groceryStore.Groceries.products;

class GroceriesTest {

    @Test
    void testProducts() {
        products();

        List<Products> testGroceriesList = new ArrayList<>();
        testGroceriesList.add(new Products("Apple", 1.25, "A"));

        assertEquals(testGroceriesList.get(0).getName(), groceriesList.get(0).getName());
        assertEquals(testGroceriesList.get(0).getPrice(), groceriesList.get(0).getPrice());
        assertEquals(testGroceriesList.get(0).getProductCode(), groceriesList.get(0).getProductCode());
    }
}
