package org.example;

public class DiscountService {

    public int calculateDiscount(int amount, int memberLevel) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        if (memberLevel == 2 && amount >= 1000000) {
            return amount * 20 / 100;
        }

        if (memberLevel == 1 && amount < 500000) {
            return amount * 10 / 100;
        }

        return 0;
    }
}