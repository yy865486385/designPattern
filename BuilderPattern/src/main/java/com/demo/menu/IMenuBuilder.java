package com.demo.menu;

import com.demo.menu.Menu;

/**
 * 建造者抽象类
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public abstract class IMenuBuilder {

    protected Menu menu = new Menu();

    public abstract void addPrincipal();

    public abstract void addEntree();

    public abstract void addSoup();

    public abstract void addDessert();

    public abstract void setName();

    public void printMenu() {
        System.out.println(menu.toString());
    }

    @Override
    public String toString() {
        return "IMenuBuilder{" +
                "menu=" + menu +
                '}';
    }
}
