package com.demo;

import org.junit.Test;

/**
 * description
 *
 * @author Yu_Yang
 * @date 2020-11-05
 */
public class SingletonTest {

    @Test
    public void test(){
        Singleton singleton = Singleton.getInstance();
        singleton.print();
    }

}
