package com.demo.food.entree.impl;

import com.demo.food.entree.IEntree;

/**
 * 主菜1
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class Entree1 implements IEntree {

    private String name="Entree1";

    @Override
    public String toString() {
        return "Entree1{" +
                "name='" + name + '\'' +
                '}';
    }
}
