package com.demo.food.soup.impl;

import com.demo.food.soup.Isoup;

/**
 * 汤1
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class Soup1 implements Isoup {

    private String name="Soup1";

    @Override
    public String toString() {
        return "Soup1{" +
                "name='" + name + '\'' +
                '}';
    }
}
