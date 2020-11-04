package com.demo;

import com.demo.menu.IMenuBuilder;

/**
 * 指挥者，控制建造者的执行。
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class Director {

    public void construct(IMenuBuilder menuBuilder){
        menuBuilder.addDessert();
        menuBuilder.addEntree();
        menuBuilder.addPrincipal();
        menuBuilder.addSoup();
        menuBuilder.setName();
    }
}
