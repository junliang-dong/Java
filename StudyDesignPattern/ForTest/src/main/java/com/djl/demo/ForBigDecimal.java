package com.djl.demo;

import java.math.BigDecimal;

/**
 * Created by dongjunliang on 2018-5-28.
 */
public class ForBigDecimal {

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(Double.toString(10.1));
        BigDecimal b = new BigDecimal(Double.toString(9.2));
        System.out.println(a);
        System.out.println(a.subtract(b));
    }
}
