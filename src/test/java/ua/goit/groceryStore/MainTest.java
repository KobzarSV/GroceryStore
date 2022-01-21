package ua.goit.groceryStore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ua.goit.groceryStore.Groceries.products;
import static ua.goit.groceryStore.Utils.calculateTotalCost;

class MainTest {

    // It is the same as UtilsTest#testCalculateTotalCost ?
    @Test
    void testMain() {
        products();

        double expected = 22.64;
        double actual = calculateTotalCost("AAAAAABBCCCDD");
        assertEquals(expected, actual);
    }
}
