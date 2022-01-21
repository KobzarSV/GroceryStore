package ua.goit.groceryStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ua.goit.groceryStore.Groceries.products;
import static ua.goit.groceryStore.Utils.*;

class UtilsTest {

    @BeforeEach
    void startProductsMethod() {
        products();
    }

    @AfterEach
    void clearProductCodesAndQuantity() {
        productCodesAndQuantity.clear();
    }

    @Test
    void testGetPriceByProductCode() {
        double expected = 1.25;
        double actual = Utils.getPriceByProductCode("A");
        assertEquals(expected, actual);
    }

    @Test
    void testGetPriceByProductCodeNotExist() {
        double expected = 0;
        double actual = Utils.getPriceByProductCode("F");
        assertEquals(expected, actual);
    }

    @Test
    void testGetCountProducts() {
        getCountProducts("ABBB");
    }

    @Test
    void testGetProductsCost() {
        getCountProducts("AAAAAA");

        double expected = 6;
        double actual = getProductsCost("A", 6, 20);
        assertEquals(expected, actual);
    }

    @Test
    void testGetProductsCostWithoutDiscount() {
        getCountProducts("BB");

        double expected = 3;
        double actual = getProductsCost("B", 3, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testGetTotalCost() {
        getCountProducts("AAAAAABBCCCDD");
        getProductsCost("A", 6, 20);
        getProductsCost("B", 0, 0);
        getProductsCost("C", 3, 10);
        getProductsCost("D", 0, 0);

        double expected = 22.64;
        double actual = getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateTotalCost() {

        double expected = 22.64;
        double actual = calculateTotalCost("AAAAAABBCCCDD");
        assertEquals(expected, actual);
    }
}
