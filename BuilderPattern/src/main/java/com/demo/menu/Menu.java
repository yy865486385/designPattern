package com.demo.menu;

import com.demo.food.dessert.IDessert;
import com.demo.food.entree.IEntree;
import com.demo.food.principal.IPrincipal;
import com.demo.food.soup.Isoup;

/**
 * 套餐的菜单
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class Menu {


    private IPrincipal principal;
    private IEntree entree;
    private Isoup soup;
    private IDessert dessert;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setDessert(IDessert dessert) {
        this.dessert = dessert;
    }

    public void setEntree(IEntree entree) {
        this.entree = entree;
    }

    public void setPrincipal(IPrincipal principal) {
        this.principal = principal;
    }

    public void setSoup(Isoup soup) {
        this.soup = soup;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "principal=" + principal +
                ", entree=" + entree +
                ", soup=" + soup +
                ", dessert=" + dessert +
                ", name='" + name + '\'' +
                '}';
    }
}
