package com.demo.food.principal.impl;

import com.demo.food.principal.IPrincipal;

/**
 * 主食1
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class Principal1 implements IPrincipal {

    private String name="Principal1";

    @Override
    public String toString() {
        return "Principal1{" +
                "name='" + name + '\'' +
                '}';
    }
}
