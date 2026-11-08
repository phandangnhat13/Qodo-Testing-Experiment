package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountServiceTest {

    private final DiscountService service = new DiscountService();

    @Test
    void testBasicDiscount() {
        assertEquals(50000, service.calculateDiscount(500000, 1));
    }

    @Test
    void testPremiumDiscount() {
        assertEquals(200000, service.calculateDiscount(1000000, 2));
    }

    @Test
    void testNoDiscount() {
        assertEquals(0, service.calculateDiscount(100000, 1));
    }

    @Test
    void testNegativeAmount() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.calculateDiscount(-1, 1)
        );
    }
}