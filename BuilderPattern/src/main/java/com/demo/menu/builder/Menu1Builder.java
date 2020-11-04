package com.demo.menu.builder;

import com.demo.food.dessert.impl.Dessert1;
import com.demo.food.entree.impl.Entree1;
import com.demo.food.principal.impl.Principal1;
import com.demo.food.soup.impl.Soup1;
import com.demo.menu.IMenuBuilder;
import com.demo.menu.Menu;

/**
 * 建造者
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class Menu1Builder extends IMenuBuilder {

    @Override
    public void addPrincipal() {
        menu.setPrincipal(new Principal1());
    }

    @Override
    public void addEntree() {
        menu.setEntree(new Entree1());
    }

    @Override
    public void addSoup() {
        menu.setSoup(new Soup1());
    }

    @Override
    public void addDessert() {
        menu.setDessert(new Dessert1());
    }

    @Override
    public void setName() {
        this.menu.setName("套餐1");
    }
}
