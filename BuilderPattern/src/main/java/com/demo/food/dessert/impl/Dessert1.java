package com.demo.food.dessert.impl;

import com.demo.food.dessert.IDessert;

import java.math.BigDecimal;

/**
 * 甜点1
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class Dessert1 implements IDessert {

    private String name="Dessert1";

    @Override
    public String toString() {
        return "Dessert1{" +
                "name='" + name + '\'' +
                '}';
    }
}
