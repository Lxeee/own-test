package com.test.program.example.bigdiciamlTest;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal total = new BigDecimal(0);
        BigDecimal nine = new BigDecimal(99);
        for (int i = 0 ; i <= 2 ; i++) {

            total = total.add(nine.multiply(new BigDecimal(100)));

        }
//        total.add(nine);

        System.out.println(total);
    }
}
