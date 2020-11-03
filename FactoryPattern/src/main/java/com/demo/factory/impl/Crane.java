package com.demo.factory.impl;

import com.demo.factory.Icar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 吊车
 *
 * @author Yu_Yang
 * @date 2020-11-02
 */
public class Crane implements Icar {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void compose(String wheel, String door, String window) {
        logger.info("组装吊车，轮子：{}，车门：{}，车窗：{}",wheel,door,window);
    }
}
