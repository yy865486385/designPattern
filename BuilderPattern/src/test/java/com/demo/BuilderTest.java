package com.demo;

import com.demo.menu.Menu;
import com.demo.menu.builder.Menu1Builder;
import org.junit.Test;

/**
 * 建造者模式测试
 *
 * @author Yu_Yang
 * @date 2020-11-04
 */
public class BuilderTest {

    @Test
    public void test(){
        Menu1Builder menu1Builder = new Menu1Builder();
        Director director = new Director();
        director.construct(menu1Builder);
        menu1Builder.printMenu();
    }
}
